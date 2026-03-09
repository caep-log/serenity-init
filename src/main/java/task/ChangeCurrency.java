package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class ChangeCurrency implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        Click.on(SearchAmazonUI.CHANGE_CURRENCY);
    }

    public static ChangeCurrency changeCurrency(){
        return Tasks.instrumented(ChangeCurrency.class);
    }
}
