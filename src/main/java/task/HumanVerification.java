package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.SearchAmazonUI;

public class HumanVerification implements Task {
    public static HumanVerification humanVerification(){
        return Tasks.instrumented(HumanVerification.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        boolean verificationVisible = !SearchAmazonUI.CONTINUE_SHOPPING.resolveAllFor(actor).isEmpty();

        if (verificationVisible) {
            actor.attemptsTo(
                    Click.on(SearchAmazonUI.CONTINUE_SHOPPING)
            );
        }
    }
}
