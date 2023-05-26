package allureClass;

import com.google.common.collect.ImmutableMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import withPageFactory.pages.*;


import java.util.concurrent.TimeUnit;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

@Epic("Swoop Test")
@Feature("Testing site functions like switching pages and selecting free sessions")
public class SwoopTest {
    WebDriver driver;

    @Story("Setting up environment information report ")
    @BeforeSuite
    void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "87.0.4280.88")
                        .build());
    }
    @Story("Setting up drivers")
    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test(description = "Swoop test, where we are testing its movie sector")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Swoop test about if we can choose Cavea East Point where we will chose last day and last option")
    @Story("Booking seat test")
    public void Test() {
        MainPage mainPage = new MainPage(driver);
        mainPage.selectCookie()
                .clickMovie();

        MoviePage moviePage = new MoviePage(driver);
        moviePage.hoverMovie()
                .clickFirstMovie()
                .ScrollToObject();

        OnlyCaveaPage onlyCaveaPage = new OnlyCaveaPage(driver);
        onlyCaveaPage.selectingCavea()
                .clickingCavea()
                .checkingCaveaOptions();

        LastDateAndLastOptionPage lastDateAndLastOptionPage = new LastDateAndLastOptionPage(driver);
        lastDateAndLastOptionPage
                .selectingLastDay()
                .advertise()
                .selectingLastOption()
                .compareMovieNames()
                .validate();

        ChoosePopUpVacantPage choosePopUpVacantPage = new ChoosePopUpVacantPage(driver);
        choosePopUpVacantPage.selectingFreeSeat();

        Screenshot screenshot = new Screenshot();
//        screenshot.onTestFailure();

    }

    @Story("Ending test and closing browser")
    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
