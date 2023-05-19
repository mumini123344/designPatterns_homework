package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement firstNameItem = $("#firstName"),
            lastNameItem = $("#lastName"),
            genderItem = $("label[for='gender-radio-1']"),
            mobileNumberItem = $("#userNumber");


}
