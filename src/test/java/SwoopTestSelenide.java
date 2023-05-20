import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import withoutPageFactory.steps.MainSelenideSteps;
import withoutPageFactory.steps.MovieSelenIdeSteps;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SwoopTestSelenide {

    MainSelenideSteps mainSelenideSteps = new MainSelenideSteps();
    MovieSelenIdeSteps movieSelenIdeSteps = new MovieSelenIdeSteps();

    @BeforeTest
    public void setUp() {
        open("https://www.swoop.ge/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
    @Test
    public void SwoopTestSeleide(){
        mainSelenideSteps.hovering();
        mainSelenideSteps.clickCookie();
        mainSelenideSteps.clickMovies();
        movieSelenIdeSteps.HoverFirstMovie();
        movieSelenIdeSteps.clickFirstMovie();
        $(By.id("ui-id-6")).scrollTo();

        // ვეღარ დავამთავრე ნაღდად :დდდ


    }
}
