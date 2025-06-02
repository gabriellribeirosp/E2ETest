# Projeto de Testes E2E com Java, Selenium e Cucumber

Este projeto realiza testes de ponta a ponta (E2E) automatizados em um e-commerce de exemplo utilizando:

- Java 11+
- Selenium WebDriver
- Cucumber
- Page Object Pattern
- Maven

## 🧪 Estrutura do Projeto

```
src
├── test
│   ├── java
│   │   ├── pages            # Page Objects
│   │   ├── steps            # Step Definitions do Cucumber
│   │   ├── runners          # Test Runner
│   │   └── utils            # Utilitários (Driver, Screenshot)
│   └── resources
│       └── features         # Cenários .feature (Gherkin)
```

## ▶️ Como Executar os Testes

### Pré-requisitos
- Java 11 ou superior
- Maven instalado

### Rodar via terminal:
```bash
mvn clean test
```

## ✅ Cenários Implementados

### Tarefa 1: Login e Navegação
- Login com credenciais válidas e navegação até o formulário
- Login com credenciais inválidas
- Acesso direto ao formulário sem login (bloqueio/redirecionamento)
- Validação do título da página após login

### Tarefa 2: Checkout E-commerce
- Adição de produto ao carrinho e finalização da compra
- Adição de 3 produtos, remoção de 1, validação do restante
- Preenchimento de dados inválidos no checkout e validação de mensagens de erro

## 📊 Relatórios

Relatórios de execução podem ser gerados com Cucumber HTML Reports. Você pode integrá-lo via plugin no `pom.xml`.

## ✍️ Autor

Gabriel Lopes Ribeiro