package starter.targets.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
public class DashboardPage extends PageObject {
public static Target DASHBOARD_ITEM = Target
                .the("user selects {0}")
                .locatedBy("//div[@class='card'][h2[contains(text(), '{0}')]]/a");
}
