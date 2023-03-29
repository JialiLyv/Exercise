package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.targets.logout.LogoutPage;

public class LogoutStepdefs {
    @When("{actor} logs out")
    public void logsOut(Actor actor) {
        actor.attemptsTo(
                Click.on(LogoutPage.LOGOUT_BUTTON)
        );
    }

    @Then("{actor} can sees the login button")
    public void sheCanSeesTheLoginButton(Actor actor) {
        actor.attemptsTo(
                Ensure.that(LogoutPage.LOGOUT_BUTTON).isNotDisplayed()
        );
    }
}
