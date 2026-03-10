package task;

import models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SelectQuantity implements Task {
    private final Product product;

    public SelectQuantity(Product product) { this.product = product; }

    public static SelectQuantity selectQuantity(Product product){ return Tasks.instrumented(SelectQuantity.class, product); }

    @Override
    public <T extends Actor> void performAs(T actor){

        if (product.getQuantity() > 1) {
            actor.attemptsTo(
                Click.on(SearchAmazonUI.SELECT_QUANTITY),
                Click.on(SearchAmazonUI.OPTIONS_QUANTITY.of(product.getQuantity().toString()))
            );
        }
    }
}
