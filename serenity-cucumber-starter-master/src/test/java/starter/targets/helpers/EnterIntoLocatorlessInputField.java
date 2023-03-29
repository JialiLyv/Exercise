package starter.targets.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class EnterIntoLocatorlessInputField {

    public static Performable value(String label, String value) {
        if (value.startsWith("TEXT_")) {
            value = TextGenerator.valueOf(value).toString();
        }
        return Task.where("{0} enters into the text field labeled '" + label + "' value '" + value + "'",
                WaitUntil.the(InputField.withLabel(label), isEnabled()).forNoMoreThan(3).seconds(),
                Click.on(InputField.withLabel(label)),
                Clear.field(InputField.withLabel(label)),
                Enter.theValue(value)
                        .into(InputField.withLabel(label))
                        .thenHit(Keys.TAB)
        );
    }
}
