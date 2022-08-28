package pom;

import element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class DefaultPage {

    // Element
    private Element historyItem = new Element(By.id("livio.pack.lang.en_US:id/history"));
    private Element okButton = new Element(By.xpath("//*[@text='OK']"));
    private Element menuDrawer = new Element(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']"));
    private Element exitLabel = new Element(By.xpath("//*[@text='Exit']"));
    private Element randomWord = new Element(By.xpath("//*[@text='Random word']"));
    private Element wordOfTheDayItem = new Element(By.id("livio.pack.lang.en_US:id/wod"));
    private Element bookmarks = new Element(By.xpath("//*[@text='Bookmarks']"));
    private Element notesLabel = new Element(By.xpath("//*[@text='Notes']"));
    private Element settingsLabel = new Element(By.xpath("//*[@text='Settings']"));

    // Method
    public void clickHistory() {
        historyItem.click();
    }

    public void clickMenu() {
        menuDrawer.click();
    }

    public void clickExit() {
        exitLabel.click();
    }

    public void clickWordOfTheDay() {
        wordOfTheDayItem.click();
    }

    public void clickOKButton() {
        okButton.click();
    }

    public void clickBookmarks() {
        bookmarks.click();
    }

    public void clickRandomWord() {
        randomWord.click();
    }

    public void clickNotes() {
        notesLabel.click();
    }

    public void clickSettings() {
        settingsLabel.click();
    }

    public boolean isDefaultStateAppDisplayed() {
        try {
            menuDrawer.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isDefaultStateAppNotDisplayed() {
        try {
            menuDrawer.isDisplayed();
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }
}
