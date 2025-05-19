package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    private By checkoutButton = By.id("checkout");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }
}