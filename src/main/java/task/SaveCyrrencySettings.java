package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class SaveCyrrencySettings implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        Click.on(SearchAmazonUI.SAVE_CURRENCY_SETTINGS);
    }

    public static SaveCyrrencySettings saveCyrrencySettings(){
        return Tasks.instrumented(SaveCyrrencySettings.class);
    }
}
