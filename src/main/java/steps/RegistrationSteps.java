package steps;

import data.RegistrationData;
import io.qameta.allure.Step;
import pages.RegistrationPage;

public class RegistrationSteps {
    RegistrationData registrationData = new RegistrationData();
    RegistrationPage registrationPage = new RegistrationPage();

    @Step
    public RegistrationSteps setFirstName(){
        registrationPage.firstNameItem.setValue(registrationData.firstName);
        return this;
    }

    @Step
    public RegistrationSteps setLastName() {
        registrationPage.lastNameItem.setValue(registrationData.lastName);
        return this;
    }

    @Step
    public RegistrationSteps setGender(){
        registrationPage.genderItem.click();
        return this;
    }

    @Step
    public RegistrationSteps setMobileNumber(){
        registrationPage.mobileNumberItem.setValue(registrationData.mobileNumber);
        return this;
    }

}
