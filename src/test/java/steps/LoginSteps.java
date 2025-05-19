package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverManager;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @Given("que o usuário acessa o site")
    public void acessar_site() {
        DriverManager.getDriver().get("https://www.saucedemo.com");
    }

    @When("realiza o login com usuário {string} e senha {string}")
    public void realiza_login(String usuario, String senha) {
        loginPage.login(usuario, senha);
    }
}