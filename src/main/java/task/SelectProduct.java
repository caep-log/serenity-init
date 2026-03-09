package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class SelectProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            Click.on(SearchAmazonUI.SELECT_PRODUCT)
        );
    }

    public static SelectProduct selectProduct(){
        return Tasks.instrumented(SelectProduct.class);
    };
}
