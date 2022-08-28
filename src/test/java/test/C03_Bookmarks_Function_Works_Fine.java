package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BookmarksPage;
import pom.DefaultPage;
import pom.RandomWordPage;

public class C03_Bookmarks_Function_Works_Fine extends TestBase {

    private DefaultPage defaultPage = new DefaultPage();
    private RandomWordPage randomWordPage = new RandomWordPage();
    private BookmarksPage bookmarksPage = new BookmarksPage();

    @Test(description = "Bookmark function works fine")
    public void C03() {
        // Open app
        defaultPage.clickOKButton();
        // Click Random word and verify the first word is displayed
        defaultPage.clickRandomWord();
        Assert.assertTrue(randomWordPage.isAWordDisplayed());
        // Bookmark it
        randomWordPage.clickBookmarkButton();
        String firstWord = randomWordPage.getTheWord();
        // Click Menu > Random word
        defaultPage.clickMenu();
        defaultPage.clickRandomWord();
        // Verify the second word is displayed
        Assert.assertTrue(randomWordPage.isAWordDisplayed());
        // Bookmark it
        randomWordPage.clickBookmarkButton();
        String sencondWord = randomWordPage.getTheWord();
        // Click Menu > Bookmarks
        defaultPage.clickMenu();
        defaultPage.clickBookmarks();
        // Verify the first and second words are showing
        Assert.assertTrue(bookmarksPage.isWordDisplayed(firstWord));
        Assert.assertTrue(bookmarksPage.isWordDisplayed(sencondWord));
    }
}
