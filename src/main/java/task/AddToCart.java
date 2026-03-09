package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class AddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(SearchAmazonUI.ADD_TO_CART)
        );
    }

    public static AddToCart addToCart() { return Tasks.instrumented(AddToCart.class); };
}
