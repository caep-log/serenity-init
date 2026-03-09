package quetions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.SearchAmazonUI;

public class ValueResult {
    public static Question<Integer> value(){
        return actor -> Text.of(SearchAmazonUI.VALUE_PRODUCT)
                .asInteger()
                .answeredBy(actor);
    }
}
