Feature: Login e Checkout

  Scenario: Usuário realiza login e finaliza o checkout
    Given que o usuário acessa o site
    When realiza o login com usuário "standard_user" e senha "secret_sauce"
    Then o usuário finaliza o checkout