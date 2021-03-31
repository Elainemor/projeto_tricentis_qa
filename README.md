# Descrição do Desafio

##Projeto em selenium Webdriver - java  e cucumber individual para avaliação.

<b>Este projeto foi elaborado por:</b>
Elaine Souza Moreira https://github.com/Elainemor
Solicitado pelo professor Danilo - Torne se um programador e Gama Academy para avaliação da Empresa Accenture,

###Criar um projeto em selenium Webdriver - java  e cucumber usando Page objects 
(precisamos executar o script através da feature)

Passo a passo para o teste automático(Colocar algum verificador do objeto antes 
de fazer as ações): 

- [x]Entrar no site http://sampleapp.tricentis.com/101/app.php
- [x]Preencher o formulário, aba <b>“Enter Vehicle Data”</b> e pressione next
- [x]Preencher o formulário, aba <b>“Enter Insurant Data”</b> e pressione next
- [x]Preencher o formulário, aba <b>“Enter Product Data”</b> e pressione next
- [x]Preencher o formulário, aba <b>“Select Price Option”</b> e pressione next
- [x]Preencher o formulário, aba <b>“Send Quote”</b> e pressione Send
- [x]Verificar a mensagem “Sending e-mail success!” na tela

Disponibilizar o projeto no repositório remoto do GitHub

Obs: Minha necessidade é importar no Eclipse e colocar para rodar.
Obs: Todo o código será analisado e pontuado, mesmo não chegando ao final. 


--------------------------------------------------------------------
## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone para iniciar o projeto
 ```bash
git clone https://github.com/Didox/estrutura-cucumber-vazia
 ```

- Entrando na pasta do projeto
 ```bash
cd + nome da pasta
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na rapiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos
<pre>
  driver <br>
      |-- chromedriver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquina<br>
  mvnw<br>
  mvnw.cmd<br>
  pom.xml<br>
  src<br>
    |-- test<br>
    |  |-- java<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- elaine<br>
    |  |  |  |  |  |-- RunCucumberTest.java -- Arquivo que configura a inicialização do Java test <br> 
    |  |-- resources<br>
    |  |  |-- io<br>
    |  |  |  |-- cucumber<br>
    |  |  |  |  |-- elaine<br>
    |  |  |  |  |  |-- nome_da_pasta_do_projeto.feature -- Gherkin com os cenários de teste de acordo com o meu cliente<br>
  test.bat -- Arquivo para rodar teste no Windows<br>
  test.sh -- Arquivo para rodar teste no Unix<br>
</pre>

