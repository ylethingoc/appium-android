package pom;

import element.Element;
import org.openqa.selenium.By;

public class WordOfTheDayPage {

    //Element
    private Element searchButton = new Element(By.id("livio.pack.lang.en_US:id/menu_search"));
    private Element searchBox = new Element(By.id("livio.pack.lang.en_US:id/search_src_text"));
    private Element backButton = new Element(By.xpath("//android.widget.ImageButton[@content-desc='Collapse']"));
	private Element menuDrawer = new Element(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']"));
	private Element historyItem = new Element(By.xpath("//*[@text='History']"));
	private Element aWordText = new Element(By.id("livio.pack.lang.en_US:id/aword"));

    //Method
    public void clickSearchButton() {
        searchButton.click();
    }

    public void searchKey(String text) {
        searchBox.sendKeys(text);
    }

    public void clickBack() {
        backButton.click();
    }
	
	public void clickMenu() {
        menuDrawer.click();
    }
	
    public void clickHistory() {
        historyItem.click();
    }

    public boolean isTextDisplayed() {
       return aWordText.isDisplayed();
    }
	
}
