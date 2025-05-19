# 🧪 Selenium Cucumber E2E Project

Automação de testes End-to-End usando Java, Selenium WebDriver, Cucumber, Page Object Pattern e ExtentReports. Este projeto executa:

- **Login em uma aplicação web**
- **Navegação até uma página de formulário**
- **Fluxo de checkout em um e-commerce**
- **Geração de relatório detalhado (ExtentReports)**

---

## ✅ Tecnologias Utilizadas

- Java 17
- Maven
- Selenium WebDriver
- Cucumber (Gherkin)
- JUnit
- Page Object Pattern
- ExtentReports
- JitPack (para dependências do seu GitHub)

---

## 📂 Estrutura do Projeto

```
SeleniumCucumberE2EProject/
├── pom.xml
├── drivers/                     # ChromeDriver incluído
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/           # Page Objects
│   ├── test/
│   │   ├── java/
│   │   │   ├── runners/         # TestRunner
│   │   │   ├── steps/           # Step Definitions
│   │   └── resources/
│   │       ├── features/        # Cucumber .feature files
│   │       └── extent-config.xml
├── reports/                     # Relatórios Extent HTML
└── README.md
```

---

## 🚀 Pré-requisitos

- **Java 17** ou superior
- **Maven 3.9.9**
- **IntelliJ IDEA (recomendado)**

---

## 🔧 Instalação e Configuração

1. **Clone o repositório**

```bash
git clone https://github.com/gabriellribeirosp/SeleniumCucumberE2EProject.git
cd SeleniumCucumberE2EProject
```

2. **Abra no IntelliJ**:
   - Vá em `File > Open` e selecione o diretório do projeto.

3. **Atualize o Maven**:
   - Clique com o botão direito no `pom.xml` > `Maven` > `Reload Project`.

4. **Execute os testes**:
   - Clique com o botão direito na classe `TestRunner.java` > `Run`.

---

## 📝 Executando via Linha de Comando

```bash
mvn clean test
```

---

## 🧪 Funcionalidades Automatizadas

### 🧩 Tarefa 1 - Login e Navegação

- Acessa a URL da aplicação
- Realiza login com credenciais válidas
- Navega até uma página de formulário
- Valida que a navegação foi bem-sucedida

### 🛒 Tarefa 2 - Checkout em E-commerce

- Adiciona produtos ao carrinho
- Preenche formulário de pagamento
- Finaliza a compra
- Verifica o sucesso do pedido

---

## 📊 Relatórios

Após a execução, o relatório é gerado automaticamente em:

```
./reports/ExtentReport.html
```

Abra o HTML em um navegador para ver os detalhes dos testes.

---

## 🔗 Dependência GitHub via JitPack

O projeto utiliza como dependência o repositório GitHub:

```xml
<dependency>
    <groupId>com.github.gabriellribeirosp</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>v1.0.0</version>
</dependency>
```

Certifique-se de que o repositório `webdrivermanager` esteja público e com release publicado no GitHub.

---

## 🧼 Limpeza

Para limpar o projeto:

```bash
mvn clean
```

---

## 🆘 Problemas Comuns

- **Run não aparece no IntelliJ**: Certifique-se de que o plugin do Cucumber está instalado.
- **Problemas com dependência JitPack**: Verifique se há um release publicado no GitHub.
- **ChromeDriver incompatível**: Certifique-se de que a versão do ChromeDriver corresponde à versão do seu navegador Chrome. O ChromeDriver v136 já está incluso no projeto.

---

## 📃 Licença

Este projeto é de uso livre para fins educacionais.