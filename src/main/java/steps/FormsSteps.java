package steps;

import pages.FormsPage;

public class FormsSteps {
    FormsPage formsPage = new FormsPage();

    public void formsClick(){
        formsPage.forms.click();

    }
    public void practiceFormClick(){
        formsPage.practiceForm.click();
    }

}
