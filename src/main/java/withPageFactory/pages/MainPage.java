package withPageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    WebDriver driver;
    public String PAGE_URL = "https://www.swoop.ge/";

    @FindBy(how = How.LINK_TEXT, using = "კინო")
    public WebElement movies;

    @FindBys({
            @FindBy(className = "cookieSection"),
            @FindBy(css = ".acceptCookie")
    })
    WebElement cookieBanner;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage selectCookie() {
        cookieBanner.click();
        return this;
    }

    public void clickMovie() {
        movies.click();
    }
}
