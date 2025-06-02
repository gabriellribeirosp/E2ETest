package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class AmazonPage {

    WebDriver driver = DriverFactory.getDriver();

    public void abrir() {
        driver.get("https://www.amazon.com.br");
    }

    public void pesquisar(String termo) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(termo);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
