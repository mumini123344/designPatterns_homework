package withoutPageFactory.steps;


import withoutPageFactory.pages.MovieSelenidePage;

public class MovieSelenIdeSteps {
    MovieSelenidePage movieSelenidePage = new MovieSelenidePage();

    public void HoverFirstMovie(){
        movieSelenidePage.firstMovieSelenide.hover();
    }
    public void clickFirstMovie(){
        movieSelenidePage.buyButton.click();
    }


}
