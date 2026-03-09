package quetions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.SearchAmazonUI;

public class ProductResults {
    public static Question<String> title(){
        return actor -> Text.of(SearchAmazonUI.RESULT_TITLE).answeredBy(actor);
    }
}
