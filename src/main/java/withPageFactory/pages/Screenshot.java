package withPageFactory.pages;

import POM_Allure.BaseTest;
import POM_Allure.Config;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;


import static POM_Allure.Config.*;

public class Screenshot {
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println((getTestMethodName(iTestResult) + " test is failed."));

        Object testClass = iTestResult.getInstance();
        WebDriver driver = BaseTest.getDriver();


        if (driver != null) {
            System.out.println("Screenshot captured for test case: " + getTestMethodName(iTestResult));
            Config.saveScreenshotPNG(driver);
        }
        saveTextLog(getTestMethodName(iTestResult) + " failed and screen shot taken");


    }


}
