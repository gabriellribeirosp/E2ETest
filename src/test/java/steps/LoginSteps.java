package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPage amazonPage = new AmazonPage();

    @Given("que estou na página de login da Amazon")
    public void acessarAmazon() {
        amazonPage.abrir();
    }

    @When("pesquiso por um produto")
    public void pesquisarProduto() {
        amazonPage.pesquisar("notebook");
    }

    @Then("sou redirecionado para a página de resultados")
    public void validarResultados() {
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("notebook"));
    }
}

@When("ele insere {string} e {string}")
    public void insereCredenciaisInvalidas(String usuario, String senha) {
        // lógica para preencher login com valores inválidos
    }

    @Then("uma mensagem de erro deve ser exibida")
    public void mensagemErroLogin() {
        // lógica de validação da mensagem de erro
    }

    @Given("que o usuário acessa diretamente o formulário sem login")
    public void acessoDiretoSemLogin() {
        // simula o acesso direto via URL
    }

    @Then("ele deve ser redirecionado para a página de login")
    public void redirecionamentoLogin() {
        // assert para verificar redirecionamento
    }

    @Then("o título da página deve conter {string}")
    public void validarTituloPagina(String tituloEsperado) {
        // assert para verificar o título da página
    }