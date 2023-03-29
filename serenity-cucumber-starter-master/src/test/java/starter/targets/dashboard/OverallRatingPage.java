package starter.targets.dashboard;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class OverallRatingPage  extends PageObject {
    public static Target firstRankMake = Target
            .the("most votes")
            .locatedBy("//tbody//tr[1]//td[2]//a");
    public static Target firstRankModel = Target
            .the("most votes")
            .locatedBy("//tbody//tr[1]//td[3]//a");

}
