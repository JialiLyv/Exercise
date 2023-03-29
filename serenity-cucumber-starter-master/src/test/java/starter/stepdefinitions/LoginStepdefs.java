package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.targets.navigation.NavigateTo;
import starter.targets.login.LoginPage;

public class LoginStepdefs {
    @Given("{actor} is looking at the Buggy Cars Rating")
    public void lookingAtBuggyCarsRating(Actor actor) {
        actor.attemptsTo(
                NavigateTo.theBuggyCarsRatingPage());
    }

    @When("{actor} logs into the app with userName {string} and password {string}")
    public void logsIntoTheApp(Actor actor, String userName, String password) {
        actor.attemptsTo(
                Enter.theValue(userName)
                        .into(LoginPage.USER_NAME_FIELD),
                Enter.theValue(password)
                        .into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    @Then("{actor} can sees the welcome message with name {string}")
    public void seesThatLogInSuccessfully(Actor actor, String name) {
        actor.attemptsTo(
                Ensure.that(LoginPage.MESSAGE).hasText("Hi, " + name)
        );
    }

    @Given("{actor} is logged in")
    public void isLoggedIn(Actor actor) {
        lookingAtBuggyCarsRating(actor);
        logsIntoTheApp(actor, "abcd_1234", "Qwer1234!");
    }
}
