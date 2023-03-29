package starter.targets.logout;
import  net.serenitybdd.screenplay.targets.Target;
public class LogoutPage {
    public static Target LOGOUT_BUTTON = Target
            .the("logout button")
            .locatedBy("//a[contains(text(),'Logout')]");
}
