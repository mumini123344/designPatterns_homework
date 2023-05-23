package steps;

import io.qameta.allure.Step;
import pages.FormsPage;

public class FormsSteps {
    FormsPage formsPage = new FormsPage();

    @Step
    public FormsSteps formsClick(){
        formsPage.forms.click();
        return this;

    }
    @Step
    public FormsSteps practiceFormClick(){
        formsPage.practiceForm.click();
        return this;
    }

}
