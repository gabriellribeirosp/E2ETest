package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = DriverFactory.getDriver();
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
