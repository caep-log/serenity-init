package task;

import models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class FindAmazon implements Task {
    public static FindAmazon findAmazon() {
        return Tasks.instrumented(FindAmazon.class);
    };

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
            Click.on(SearchAmazonUI.CLICK_BUTTON_SEARCH)
        );
    }
}
