package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.SearchAmazonUI;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChangeCurrency implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            Click.on(SearchAmazonUI.CURRENCY_BUTTON),

            MoveMouse.to(SearchAmazonUI.CHANGE_CURRENCY),
            WaitUntil.the(SearchAmazonUI.CHANGE_CURRENCY, isVisible()).forNoMoreThan(3).seconds(),

            Click.on(SearchAmazonUI.CHANGE_CURRENCY),
            Click.on(SearchAmazonUI.SAVE_CURRENCY_SETTINGS)
        );
    }

    public static ChangeCurrency changeCurrency(){
        return Tasks.instrumented(ChangeCurrency.class);
    }
}
