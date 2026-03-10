package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchAmazonUI extends PageObject {
    public static final Target CONTINUE_SHOPPING =
        Target.the("Continue Shopping")
            .locatedBy("//button[@alt='Continue shopping']");

    public static final Target CURRENCY_BUTTON =
        Target.the("Currency button")
            .locatedBy("//div[@id='icp-nav-flyout']");

    public static final Target CHANGE_CURRENCY =
        Target.the("Currency Settings")
            .locatedBy("(//div[@data-a-input-name='cop'])[1]");

    public static final Target SAVE_CURRENCY_SETTINGS =
        Target.the("Save currency settings")
            .locatedBy("//input[@aria-labelledby='icp-save-button-announce']");

    public static final Target CLICK_SEARCH =
        Target.the("Search Mercado Libre")
            .locatedBy("//input[@id='twotabsearchtextbox']");

    public static final Target CLICK_BUTTON_SEARCH =
        Target.the("Search Button")
            .locatedBy("//input[@id='nav-search-submit-button']");

    public static final Target SELECT_PRODUCT =
        Target.the("Select product")
            .locatedBy("(//div[@data-component-type='s-search-result'])[1]//a");

    public static final Target SELECT_QUANTITY =
        Target.the("Select Quantity")
            .locatedBy("//div[@id='selectQuantity']");

    public static final Target OPTIONS_QUANTITY =
        Target.the("Options Quantity")
            .locatedBy("//a[@role='option' and normalize-space()='{0}']");

    public static final Target ADD_TO_CART =
        Target.the("Add to cart")
            .locatedBy("//input[@id='add-to-cart-button']");

    public static final Target NAV_TO_CART =
        Target.the("Add to cart")
            .locatedBy("//a[@id='nav-cart']");

    public static final Target INIT_CHECKOUT =
        Target.the("Init Checkout")
            .locatedBy("//input[@data-feature-id='proceed-to-checkout-action']");

    public static final Target RESULT_TITLE =
        Target.the("Product title")
            .locatedBy("//span[@id='productTitle']");

    public static final Target VALUE_PRODUCT =
        Target.the("Value Product")
            .locatedBy("(//span[@class='a-price-whole'])[1]");
}
