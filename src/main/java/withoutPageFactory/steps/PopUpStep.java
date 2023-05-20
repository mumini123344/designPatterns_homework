package withoutPageFactory.steps;

import io.qameta.allure.Step;
import withoutPageFactory.pages.PopUpPage;

public class PopUpStep {
    PopUpPage popUpPage = new PopUpPage();

    @Step
    public PopUpStep takingFreeSeat(){
        popUpPage.freeSeat.click();
        return this;
    }
}
