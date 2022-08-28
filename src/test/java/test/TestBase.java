package test;

import driver.Driver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestBase {
    @BeforeClass
    public void setup() throws MalformedURLException {
        Driver.start();
    }

    @AfterClass
    public void teardown() {
        Driver.quit();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(final ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE || result.getStatus() == ITestResult.SKIP)
            Driver.takeScreenshot(result.getMethod().getMethodName().toLowerCase() + "_" + System.currentTimeMillis());

    }
}
