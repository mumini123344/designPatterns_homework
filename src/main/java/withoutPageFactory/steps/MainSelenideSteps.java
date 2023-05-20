package withoutPageFactory.steps;


import withoutPageFactory.pages.MainSelenidePage;

public class MainSelenideSteps {
    MainSelenidePage mainPage = new MainSelenidePage();

    public void hovering(){
        mainPage.cookie.hover();
    }
    public void clickCookie(){
        mainPage.acceptCookie.click();
    }
    public void clickMovies(){
        mainPage.movie.click();
    }
}
