package steps;

import io.qameta.allure.Step;
import pages.SubmitPage;

public class SubmitSteps {
    SubmitPage submitPage = new SubmitPage();


    @Step
    public SubmitSteps clickSubmit(){
        submitPage.submitButton.scrollTo().click();
        return this;
    }


}
