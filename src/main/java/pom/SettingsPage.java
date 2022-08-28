package pom;

import utilities.Utilities;

public class SettingsPage {

    public void scrollAndClick() {
        Utilities.click();
    }

    public boolean isMyWebsiteTextDisplay() {
        return Utilities.isDisplayed();
    }

}
