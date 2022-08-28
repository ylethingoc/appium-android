package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DefaultPage;
import pom.HistoryPage;
import pom.WordOfTheDayPage;
import utilities.Utilities;

public class C02_History_Function_Works_Fine extends TestBase {

    private DefaultPage defaultPage = new DefaultPage();
    private WordOfTheDayPage wordOfTheDayPage= new WordOfTheDayPage();
    private HistoryPage historyPage = new HistoryPage();

    @Test(description = "History function works fine")
    public void C02() {
        defaultPage.clickOKButton();
        // Verify default state app is displayed
        Assert.assertTrue(defaultPage.isDefaultStateAppDisplayed());
        // Click Word of the day
        defaultPage.clickWordOfTheDay();
        // Verify the first word is display
        Assert.assertTrue(wordOfTheDayPage.isTextDisplayed());
        // Click Search icon
        wordOfTheDayPage.clickSearchButton();
        // Search for 'winter'
        wordOfTheDayPage.searchKey("winter");
        Utilities.pressEnter();
        // Click Back > Menu > History
        wordOfTheDayPage.clickBack();
        wordOfTheDayPage.clickMenu();
        wordOfTheDayPage.clickHistory();
        // Verify 'winter' and the first word are showing
        Assert.assertTrue(historyPage.isTextDisplayed("winter"));
        Assert.assertTrue(historyPage.isTextDisplayed("clap"));
    }
}
