package starter.targets.registration;

import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
public class RegistrationPage extends PageObject {
    public static Target REGISTER_LINK = Target
            .the("register button")
            .locatedBy("//a[contains(text(),'Register')]");
    public static Target REGISTER_BUTTON = Target
            .the("register button")
            .locatedBy("//button[contains(text(), 'Register')]");

    public static Target REGISTER_SUCCESS_MESSAGE = Target
            .the("registration success message")
            .locatedBy("//div[contains(text(), 'Registration is successful')]");
}
