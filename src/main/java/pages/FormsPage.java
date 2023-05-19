package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    public SelenideElement forms = $(byXpath("//*[text()='Forms']"));
    public SelenideElement practiceForm = $(byXpath("//*[text()= 'Practice Form']"));
}
