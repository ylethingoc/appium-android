package pom;

import element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class NotesPage {

    // Element
    private Element addButton = new Element(By.id("livio.pack.lang.en_US:id/addfab"));
    private Element newWord = new Element(By.id("livio.pack.lang.en_US:id/new_word"));
    private Element noteText = new Element(By.id("livio.pack.lang.en_US:id/notetext"));
    private Element saveButton = new Element(By.id("livio.pack.lang.en_US:id/save_button"));
    private Element itemName = new Element(By.id("livio.pack.lang.en_US:id/item_name"));
    private Element noteCnt = new Element(By.id("livio.pack.lang.en_US:id/notecnt"));
    private Element deleteIcon = new Element(By.id("livio.pack.lang.en_US:id/delete_icon"));
    private Element yesButton = new Element(By.id("android:id/button1"));

    // Method
    public void clickAddButton() {
        addButton.click();
    }

    public void addNewWord(String key) {
        newWord.wait(2);
        newWord.sendKeys(key);
    }

    public void addNoteText(String key) {
        noteText.sendKeys(key);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public String getItemName() {
        itemName.wait(3);
        return itemName.getText();
    }

    public String getNote() {
        return noteCnt.getText();
    }

    public void clickDeleteIcon() {
        deleteIcon.click();
        yesButton.click();
    }

    public boolean isNoteDeleted() {
        try {
            itemName.isDisplayed();
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }

}
