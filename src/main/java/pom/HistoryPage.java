package pom;

import element.Element;
import org.openqa.selenium.By;

public class HistoryPage {

    private Element historyTitle = new Element(By.xpath("//*[@text='History']"));

    public boolean isHistoryTitleDisplayed() {
        return historyTitle.isDisplayed();
    }

    public boolean isTextDisplayed(String searchKey) {
        return  new Element(By.xpath(String.format("//*[@text='%s']", searchKey))).isDisplayed();
    }
}
