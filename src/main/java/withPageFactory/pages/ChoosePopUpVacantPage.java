package withPageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ChoosePopUpVacantPage {
    WebDriver driver;

    public ChoosePopUpVacantPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBys({
            @FindBy(xpath = "//body//section//div//div//form"),
            @FindBy(className = "seat-new-part")
    })
    WebElement freeSeat;

    public ChoosePopUpVacantPage selectingFreeSeat() {
        freeSeat.click();
        return this;
    }

}
