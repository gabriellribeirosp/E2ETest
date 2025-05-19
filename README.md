
# Projeto de Automação E2E com Selenium, Cucumber e Page Object Pattern

## Descrição
Este projeto realiza testes de ponta a ponta (E2E) em uma aplicação web com duas tarefas principais:

- **Tarefa 1**: Login e navegação até uma página específica.
- **Tarefa 2**: Fluxo de checkout completo em um e-commerce.

## Tecnologias utilizadas
- Java 17
- Maven
- Selenium WebDriver
- Cucumber
- JUnit
- ExtentReports

## Pré-requisitos
- IntelliJ IDEA
- Maven 3.9.9
- Chrome instalado (versão compatível com o ChromeDriver incluído)
- Java 17

## Como importar no IntelliJ
1. Abra o IntelliJ e clique em **File > Open**.
2. Selecione a pasta raiz do projeto.
3. Aguarde o Maven importar as dependências.
4. Vá até `src/test/java/runners/TestRunner.java`, clique com o botão direito e selecione **Run 'TestRunner'**.

## Execução dos testes
Execute a classe `TestRunner.java`. O relatório será gerado na pasta `/reports`.

## Relatórios
Os relatórios de execução serão gerados automaticamente após o teste com o ExtentReports.
