package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

import models.Product;
import quetions.ProductResults;
import quetions.ValueResult;
import task.*;

public class searchAmazonStepDefinition {
    @Given("Go to Amazon")
    public void goToAmazon(){
        theActorInTheSpotlight().attemptsTo(
            HumanVerification.humanVerification()
        );
    }

    @When("Change currency")
    public void changeCurrency(){
        theActorInTheSpotlight().attemptsTo(
            ChangeCurrency.changeCurrency()
        );
    }

    @Then("Put to search {string}")
    public void enterThePage (String productName){
        Product product = new Product(productName, "Electronics", 0, 0);

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
            SelectProduct.selectProduct()
        );

        theActorInTheSpotlight().should(
            seeThat(ProductResults.displayed(), containsStringIgnoringCase(keyword)),
            seeThat(ValueResult.value(), greaterThan(value))
        );
    }

    @And("Select Quantity {int} about this {string}")
    public void selectQuantity(Integer quantity, String productName){
        Product product = new Product(productName, "Electronics", 0, quantity);

        theActorInTheSpotlight().attemptsTo(
            SelectQuantity.selectQuantity(product)
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
