package element;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class Element {

    private By by;

    public Element(By by) {
        this.by = by;
    }

    public WebElement findElement() {
        return Constant.DRIVER.findElement(this.by);
    }

    public void wait(int second) {
        WebDriverWait wait = new WebDriverWait(Constant.DRIVER, second);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(this.by));
    }

    public void click() {
        findElement().click();
    }

    public void sendKeys(String text) {
        findElement().clear();
        findElement().sendKeys(text);
    }

    public boolean isDisplayed() {
        return findElement().isDisplayed();
    }

    public String getText() {
        return findElement().getText();
    }

}
