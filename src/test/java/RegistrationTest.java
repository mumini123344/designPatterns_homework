import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import steps.FormsSteps;
import steps.RegistrationSteps;
import steps.SubmitSteps;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest {
    FormsSteps formsSteps = new FormsSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();
    SubmitSteps submitSteps = new SubmitSteps();


    @BeforeTest
    public void setUp(){
        open("https://demoqa.com/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @Test
    public void Test() throws AWTException {
        formsSteps.formsClick();
        formsSteps.practiceFormClick();


        registrationSteps.setFirstName()
                .setLastName()
                .setGender()
                .setMobileNumber();


        Robot robot = new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
        }

        submitSteps.clickSubmit();



    }

}
