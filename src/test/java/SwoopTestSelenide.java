import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import withoutPageFactory.steps.MainSelenideSteps;
import withoutPageFactory.steps.MovieSelenIdeSteps;
import withoutPageFactory.steps.OnlyCaveaSelenideSteps;
import withoutPageFactory.steps.PopUpStep;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SwoopTestSelenide {

    MainSelenideSteps mainSelenideSteps = new MainSelenideSteps();
    MovieSelenIdeSteps movieSelenIdeSteps = new MovieSelenIdeSteps();
    OnlyCaveaSelenideSteps onlyCaveaSelenideSteps = new OnlyCaveaSelenideSteps();
    PopUpStep popUpStep = new PopUpStep();

    @BeforeTest
    public void setUp() {
        open("https://www.swoop.ge/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @Test
    public void SwoopTestSeleide() {
        mainSelenideSteps.hovering()
                .clickCookie()
                .clickMovies();
        movieSelenIdeSteps.HoverFirstMovie()
                .clickFirstMovie();

        $(By.id("ui-id-6")).scrollTo();

        onlyCaveaSelenideSteps.selectingCaveaEast()
                .selectingLastDay()
                .selectingTheLastOption()
                .compareNames().
                validatingNames();

        popUpStep.takingFreeSeat();


    }
}
