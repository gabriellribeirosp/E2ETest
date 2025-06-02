package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utils.DriverFactory;

public class CheckoutSteps {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPage amazonPage = new AmazonPage();

    @Given("que estou na página inicial da Amazon")
    public void abrirAmazon() {
        amazonPage.abrir();
    }

    @When("clico no primeiro produto listado")
    public void clicarPrimeiroProduto() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElements(By.cssSelector(".s-title-instructions-style")).get(0).click();
    }

    @When("adiciono o produto ao carrinho")
    public void adicionarAoCarrinho() throws InterruptedException {
        Thread.sleep(2000);
        WebElement botao = driver.findElement(By.id("add-to-cart-button"));
        if (botao.isDisplayed()) {
            botao.click();
        }
    }

    @Then("o carrinho deve conter o produto selecionado")
    public void validarProdutoNoCarrinho() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(2000);
        WebElement carrinho = driver.findElement(By.cssSelector(".sc-list-item-content"));
        Assert.assertTrue(carrinho.isDisplayed());
    }
}

@Given("que o usuário acessa a loja e adiciona 3 produtos ao carrinho")
    public void adicionarMultiplosProdutos() {
        // lógica de adicionar 3 produtos
    }

    @When("ele remove um produto do carrinho")
    public void removerUmProduto() {
        // lógica para remover um produto
    }

    @Then("o carrinho deve conter 2 produtos")
    public void validarCarrinhoComDoisProdutos() {
        // assert para validar quantidade no carrinho
    }

    @And("o botão de finalizar compra deve estar habilitado")
    public void validarBotaoFinalizar() {
        // assert do botão ativo
    }

    @When("ele preenche o formulário com email inválido e cartão vazio")
    public void preencherDadosInvalidosCheckout() {
        // lógica para simular dados inválidos
    }

    @Then("mensagens de erro devem ser exibidas para os campos obrigatórios")
    public void validarMensagensErroCampos() {
        // assert das mensagens de erro
    }