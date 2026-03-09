package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.greaterThan;

import models.Product;
import net.serenitybdd.screenplay.ensure.Ensure;
import quetions.ProductResults;
import quetions.ValueResult;
import task.*;
import userInterface.SearchAmazonUI;

public class searchAmazonStepDefinition {
    @Given("Go to Amazon")
    public void goToAmazon(){
        boolean exist = !SearchAmazonUI.CLICK_SEARCH.resolveAllFor(theActorInTheSpotlight()).isEmpty();

        if (exist) {
            theActorInTheSpotlight().attemptsTo(

            );
        } else {
            theActorInTheSpotlight().attemptsTo(


            );
        }
    }

    @When("Change currency")
    public void changeCurrency(){
        theActorInTheSpotlight().attemptsTo(
            CurrencySettings.currencySettings(),
            ChangeCurrency.changeCurrency(),
            SaveCyrrencySettings.saveCyrrencySettings()
        );
    }

    @Then("Put to search {string}")
    public void enterThePage (String productName){
        Product product = new Product(productName, "Electronics", 0);

        theActorInTheSpotlight().attemptsTo(
                EnterAmazon.enterAmazon(product)
        );
    };

    @And("Search electronic")
    public void searchOnPage(){
        theActorInTheSpotlight().attemptsTo(
                FindAmazon.findAmazon()
        );
    }

    @And("Must show me {string} List with {string} with {int}")
    public void showList(String product, String keyword, Integer value){
        theActorInTheSpotlight().attemptsTo(
                SelectProduct.selectProduct(),
                Ensure.that(ProductResults.title()).containsIgnoringCase(keyword),
                Ensure.that(ValueResult.value()).isGreaterThan(value)
        );
    }

    @And("Add Product to cart")
    public void addToCart() {
        theActorInTheSpotlight().attemptsTo(
            AddToCart.addToCart()
        );
    }

    @And("Nav to Cart")
    public void navToCart(){
        theActorInTheSpotlight().attemptsTo(
            NavToCart.navToCart()
        );
    }

    @And("Init checkout process")
    public void initCheckout(){
        theActorInTheSpotlight().attemptsTo(
            InitCheckout.initCheckout()
        );
    }
}
