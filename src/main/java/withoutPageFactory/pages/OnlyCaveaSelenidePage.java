package withoutPageFactory.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OnlyCaveaSelenidePage {
    public SelenideElement selectingCaveaSection = $(By.linkText("კავეა ისთ ფოინთი"));
    public SelenideElement movieNameOnPage = $(byXpath("//div[@class = 'movie_first_section']//p[@class='name']"));
    public SelenideElement lastDay =  $(byXpath("//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/ul/li[last()]"));
    public SelenideElement lastOption = $(byXpath("//div[contains(@class,'ui-tabs-panel')][@aria-expanded='true']/div/div[@aria-hidden = 'false'][last()]"));

}
