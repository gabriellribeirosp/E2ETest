Feature: Login e navegação
  Scenario: Login e acesso ao formulário
    Given que estou na página de login da Amazon
    When pesquiso por um produto
    Then sou redirecionado para a página de resultados

@LoginInvalido
  Scenario: Tentativa de login com credenciais inválidas
    Given que o usuário está na página de login
    When ele insere "usuario_erro" e "senha_errada"
    Then uma mensagem de erro deve ser exibida

  @AcessoSemLogin
  Scenario: Tentar acessar página restrita sem login
    Given que o usuário acessa diretamente o formulário sem login
    Then ele deve ser redirecionado para a página de login

  @ValidaElemento
  Scenario: Validar exibição do título da página de formulário após login
    Given que o usuário faz login com credenciais válidas
    When ele é redirecionado para a página de formulário
    Then o título da página deve conter "Formulário de Cadastro"