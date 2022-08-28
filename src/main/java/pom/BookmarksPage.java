package pom;

import element.Element;
import org.openqa.selenium.By;

public class BookmarksPage {

    // Element

    // Method
    public boolean isWordDisplayed(String word) {
       return new Element(By.xpath(String.format("//*[@text='%s']", word))).isDisplayed();
    }
}
