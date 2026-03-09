package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class CurrencySettings implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(SearchAmazonUI.CURENCY_SETTINGS)
        );
    }

    public static CurrencySettings currencySettings(){
        return Tasks.instrumented(CurrencySettings.class);
    }
}
