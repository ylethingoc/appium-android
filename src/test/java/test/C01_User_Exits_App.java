package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.DefaultPage;
import utilities.Utilities;

public class C01_User_Exits_App extends TestBase {

    private DefaultPage defaultPage = new DefaultPage();

    @Test(description = "User exits app")
    public void C01() {
        // Open app
        defaultPage.clickOKButton();
        // Verify that default state of the app displayed
        Assert.assertTrue(defaultPage.isDefaultStateAppDisplayed());
        // Menu > Exit
        defaultPage.clickMenu();
        defaultPage.clickExit();
        // Verify that app is not displayed
        Assert.assertEquals(Utilities.getAppState(), "RUNNING_IN_BACKGROUND");
    }
}
