package starter.targets.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PopularModelPage  extends PageObject {
    public static Target HEADLINE = Target
            .the("headline")
            .locatedBy("//h3");
}
