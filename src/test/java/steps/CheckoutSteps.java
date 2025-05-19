package steps;

import io.cucumber.java.en.Then;
import pages.CheckoutPage;
import utils.DriverManager;

public class CheckoutSteps {
    CheckoutPage checkoutPage = new CheckoutPage(DriverManager.getDriver());

    @Then("o usuário finaliza o checkout")
    public void finaliza_checkout() {
        checkoutPage.proceedToCheckout();
    }
}