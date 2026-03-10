package quetions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.SearchAmazonUI;

public class ProductResults implements Question<String> {
    public static ProductResults displayed(){
        return new ProductResults();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SearchAmazonUI.RESULT_TITLE).answeredBy(actor);
    }
}
