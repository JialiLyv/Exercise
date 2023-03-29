package starter.targets.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theBuggyCarsRatingPage() {
        return Task.where("{0} opens the buggy cars rating home page",
                Open.browserOn().the(BuggyCarsRatingHomePage.class));
    }
}
