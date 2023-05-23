package withoutPageFactory.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PopUpPage {
    public SelenideElement freeSeat = $(byXpath("(//div[@class='seat free'])[1]"));
}
