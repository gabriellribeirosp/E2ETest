Feature: Fluxo de checkout
  Scenario: Usuário adiciona um produto ao carrinho e inicia o checkout
    Given que estou na página inicial da Amazon
    When pesquiso por um produto
    And clico no primeiro produto listado
    And adiciono o produto ao carrinho
    Then o carrinho deve conter o produto selecionado

@CheckoutMultiplosProdutos
  Scenario: Adicionar múltiplos produtos e remover um antes de finalizar
    Given que o usuário acessa a loja e adiciona 3 produtos ao carrinho
    When ele remove um produto do carrinho
    Then o carrinho deve conter 2 produtos
    And o botão de finalizar compra deve estar habilitado

  @CheckoutDadosInvalidos
  Scenario: Preencher formulário de checkout com dados inválidos
    Given que o usuário inicia o checkout
    When ele preenche o formulário com email inválido e cartão vazio
    Then mensagens de erro devem ser exibidas para os campos obrigatórios