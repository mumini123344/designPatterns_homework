package withoutPageFactory.steps;


import io.qameta.allure.Step;
import withoutPageFactory.pages.MovieSelenidePage;

public class MovieSelenIdeSteps {
    MovieSelenidePage movieSelenidePage = new MovieSelenidePage();

    @Step
    public MovieSelenIdeSteps HoverFirstMovie(){
        movieSelenidePage.firstMovieSelenide.hover();
        return this;
    }
    @Step
    public MovieSelenIdeSteps clickFirstMovie(){
        movieSelenidePage.buyButton.click();
        return this;
    }


}
