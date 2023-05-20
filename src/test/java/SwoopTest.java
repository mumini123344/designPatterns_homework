import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import withPageFactory.pages.*;


import java.util.concurrent.TimeUnit;

public class SwoopTest {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
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
                .selectingLastOption()
                .compareMovieNames()
                .validate();

        ChoosePopUpVacantPage choosePopUpVacantPage = new ChoosePopUpVacantPage(driver);
        choosePopUpVacantPage.selectingFreeSeat();

    }


    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }


}
