package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class NavToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            Click.on(SearchAmazonUI.NAV_TO_CART)
        );
    }

    public static NavToCart navToCart() { return Tasks.instrumented(NavToCart.class); };
}
