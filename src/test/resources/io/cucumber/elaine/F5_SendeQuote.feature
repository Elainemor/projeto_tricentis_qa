#language: pt

Funcionalidade: Preencher o formulario Send Quote
		
  Cenario: Preencher o Send Quote
    Dado Dado preencho o campo email
    E preencho o campo phone
    E preencho o campo username
    E preencho o campo password
    E preencho o campo confirm password
    E preencho o campo Comments
    E clico no botao send da send quote
    E verifico a mensagem de envio de email com sucesso
    Entao finalizo o preenchimento com ok
  