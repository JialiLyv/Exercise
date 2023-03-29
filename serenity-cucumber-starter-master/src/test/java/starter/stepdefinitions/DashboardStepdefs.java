package starter.stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.targets.dashboard.DashboardPage;
import starter.targets.dashboard.PopularMakePage;
import starter.targets.dashboard.PopularModelPage;
import starter.targets.dashboard.OverallRatingPage;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DashboardStepdefs {
    @When("{actor} clicks {string} item")
    public void clicksItem(Actor actor, String itemName) {
        actor.attemptsTo(
                Click.on(DashboardPage.DASHBOARD_ITEM.of(itemName)));
    }

    @Then("{actor} can see {string} as the popular make")
    public void canSeeItAsThePopularMake(Actor actor, String itemName) {
        actor.attemptsTo(
                WaitUntil.the(PopularMakePage.HEADLINE, isVisible()).forNoMoreThan(3).seconds(),
                Ensure.that(PopularMakePage.HEADLINE).hasText(itemName)
        );
    }

    @Then("{actor} can see {string} as the popular model")
    public void canSeeItAsThePopularModel(Actor actor, String itemName) {
        actor.attemptsTo(
                WaitUntil.the(PopularModelPage.HEADLINE, isVisible()).forNoMoreThan(3).seconds(),
                Ensure.that(PopularModelPage.HEADLINE).hasText(itemName)
        );
    }

    @Then("{actor} can see the Model {string} from the Make {string} has the most votes")
    public void canSeeItHasTheMostVotes(Actor actor, String modelName, String makeName) {
        actor.attemptsTo(
                WaitUntil.the(OverallRatingPage.firstRankMake, isVisible()).forNoMoreThan(3).seconds(),
                Ensure.that(OverallRatingPage.firstRankMake).hasText(makeName),
                Ensure.that(OverallRatingPage.firstRankModel).hasText(modelName)
        );
    }
}
