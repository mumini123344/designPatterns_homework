package withoutPageFactory.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MovieSelenidePage {

    public SelenideElement firstMovieSelenide = $(byXpath("//body/div[@class='container cinema_container']/div[1]"));
    public SelenideElement buyButton = $(byXpath("(//p[contains(text(),'ყიდვა')])"));

}
