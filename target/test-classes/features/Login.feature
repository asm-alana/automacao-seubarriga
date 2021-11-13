#language: pt
#UTF: 8
  @login @regressivo
  Funcionalidade: Login

    Contexto:
      Dado que o usuario esta no site Seu Barriga
    @login-sucesso
    Esquema do Cenario: Login efetuado com sucesso
      Quando preenche o campo email com "<email>"
      E preenche o campo senha com "<senha>"
      Entao sera redirecionado para a pagina com a mensagem "Bem vindo, alana!" na tela
    Exemplos:
      | email | senha |
      | email | senha |

    @login-sem-sucesso
    Esquema do Cenario: Login sem sucesso
      Quando preenche o campo email com "<email>" invalido
      E preenche o campo senha com "<senha>" invalida
      Entao visualizara a mensagem "Problemas com o login do usuário" na tela
    Exemplos:
      | email        | senha   |
      | testes@teste | teste12345 |

    @login-sem-preencher
    Esquema do Cenario: Login sem preencher os campos
      Quando acessa os campos email com "<email>", senha com "<senha>"
      Entao visualizara a mensagem de erro "<msgErroPreenchimento>"
    Exemplos:
      | email       | senha        | msgErroPreenchimento         |
      |              | teste123456 | Email é um campo obrigatório |
      | teste@teste |              | Senha é um campo obrigatório |

