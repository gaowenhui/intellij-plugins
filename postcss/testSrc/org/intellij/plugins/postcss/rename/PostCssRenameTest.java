package org.intellij.plugins.postcss.rename;

import org.intellij.plugins.postcss.PostCssFixtureTestCase;

public class PostCssRenameTest extends PostCssFixtureTestCase {

  public void testCustomSelector() {
    doTest("new-name");
  }

  public void testCustomSelectorWithTwoDashes() {
    doTest("--new-name");
  }

  private void doTest(String newName) {
    myFixture.testRename(getTestName(true) + "-before.pcss", getTestName(true) + "-after.pcss", newName);
  }
}