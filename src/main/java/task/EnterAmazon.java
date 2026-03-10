package task;

import models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.SearchAmazonUI;

public class EnterAmazon implements Task {
    private final Product product;

    public EnterAmazon(Product product){
        this.product = product;
    }

    public static EnterAmazon enterAmazon(Product product) {
        return Tasks.instrumented(EnterAmazon.class, product);
    };

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            Click.on(SearchAmazonUI.CLICK_SEARCH),
            Enter.theValue(product.getName())
                .into(SearchAmazonUI.CLICK_SEARCH)
        );
    }
}
