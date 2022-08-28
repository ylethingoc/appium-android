package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DefaultPage;
import pom.SettingsPage;
import utilities.Utilities;

public class C05_Verify_Website extends TestBase {

    private DefaultPage defaultPage = new DefaultPage();
    private SettingsPage settingsPage = new SettingsPage();

    @Test(description = "Verify Website")
    public void C05() {
        // Open app
        defaultPage.clickOKButton();
        // Click Menu > Settings > My website
        defaultPage.clickMenu();
        defaultPage.clickSettings();
        settingsPage.scrollAndClick();
        // Verify redirecting to browser with url: https://trovami.altervista.org/
        Assert.assertEquals(Utilities.getURL(), "trovami.altervista.org");
        // Press back
        Utilities.pressBack();
        // Verify the app is opened again at Settings page
        Utilities.scrollToView();
        Assert.assertTrue(settingsPage.isMyWebsiteTextDisplay());
    }
}
