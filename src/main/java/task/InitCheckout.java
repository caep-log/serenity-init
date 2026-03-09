package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class InitCheckout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            Click.on(SearchAmazonUI.INIT_CHECKOUT)
        );
    }

    public static InitCheckout initCheckout() { return Tasks.instrumented(InitCheckout.class); };
}
