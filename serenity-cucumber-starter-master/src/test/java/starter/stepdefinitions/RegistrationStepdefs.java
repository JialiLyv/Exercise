package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.jetbrains.annotations.NotNull;
import starter.targets.helpers.EnterIntoLocatorlessInputField;
import starter.targets.registration.RegistrationPage;

import java.util.Map;
import java.util.List;

public class RegistrationStepdefs {
    @When("{actor} clicks register")
    public void clicksRegister(Actor actor) {
        actor.attemptsTo(
                Click.on(RegistrationPage.REGISTER_LINK)
        );
    }

    @Then("{actor} fills the form:")
    public void fillsTheForm(Actor actor, @NotNull DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        rows.forEach(row ->
                row.forEach((key, value) ->
                        actor.attemptsTo(EnterIntoLocatorlessInputField.value(key, value))
                )
        );
    }

    @When("{actor} confirms register")
    public void confirmsRegister(Actor actor) {
        actor.attemptsTo(
                Click.on(RegistrationPage.REGISTER_BUTTON)
        );
    }

    @Then("{actor} should see the success message")
    public void shouldSeeTheSuccessMessage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(RegistrationPage.REGISTER_SUCCESS_MESSAGE).isDisplayed()
        );
    }
}
