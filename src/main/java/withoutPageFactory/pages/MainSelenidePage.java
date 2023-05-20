package withoutPageFactory.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class MainSelenidePage {
    public SelenideElement cookie = $(By.className("cookieSection"));
    public SelenideElement acceptCookie = $(".acceptCookie");
    public SelenideElement movie = $(By.linkText("კინო"));
}
