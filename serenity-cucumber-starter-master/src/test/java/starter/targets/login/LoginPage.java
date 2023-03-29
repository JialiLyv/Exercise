package starter.targets.login;

import net.serenitybdd.screenplay.targets.Target;
public class LoginPage {
    public static Target USER_NAME_FIELD = Target
            .the("user name field")
            .locatedBy("//input[@name='login']");
    public static Target PASSWORD_FIELD = Target
            .the("password field")
            .locatedBy("//input[@name='password']");
    public static Target LOGIN_BUTTON = Target
            .the("login button")
            .locatedBy("//button[@class='btn btn-success']");

    public static final Target MESSAGE = Target
            .the("Welcome message")
            .locatedBy("//span[@class='nav-link disabled']");
}
