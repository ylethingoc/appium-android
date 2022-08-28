package pom;

import element.Element;
import org.openqa.selenium.By;

public class RandomWordPage {

    // Element
    private Element aWord = new Element(By.id("livio.pack.lang.en_US:id/aword"));
    private Element bookmarksButton = new Element(By.id("livio.pack.lang.en_US:id/bookmarkbutton"));

    // Method
    public boolean isAWordDisplayed() {
        return aWord.isDisplayed();
    }

    public void clickBookmarkButton() {
        bookmarksButton.click();
    }

    public String getTheWord() {
        return aWord.getText();
    }
}
