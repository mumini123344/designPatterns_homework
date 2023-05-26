package withoutPageFactory.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OnlyCaveaSelenidePage {
    public SelenideElement selectingCaveaSection = $(byLinkText("კავეა ისთ ფოინთი"));
    public SelenideElement movieNameOnPage = $(byXpath("//div[@class = 'movie_first_section']//p[@class='name']"));
    public SelenideElement lastDay =  $(byXpath("(//a[@id='ui-id-17'])[1]"));
    public SelenideElement lastOption = $("body > section:nth-child(16) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(24)");

}
