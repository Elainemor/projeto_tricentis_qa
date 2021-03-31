package io.cucumber.elaine;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.*;
import io.cucumber.elaine.servicos.Configuracao;


public class F5_SendeQuoteSteps extends Configuracao {

    @Dado("Dado preencho o campo email")
    public void dado_preencho_o_campo_email() {
        Configuracao.browser.findElement(By.id("email")).click();
        Configuracao.browser.findElement(By.id("email")).sendKeys("oitodedezembro@gmail.com");    
    }

    @Dado("preencho o campo phone")
    public void preencho_o_campo_phone() {
        Configuracao.browser.findElement(By.id("phone")).click();
        Configuracao.browser.findElement(By.id("phone")).sendKeys("5511986713258");
    }

    @Dado("preencho o campo username")
    public void preencho_o_campo_username() {        
        Configuracao.browser.findElement(By.id("username")).click();
        Configuracao.browser.findElement(By.id("username")).sendKeys("elainemor");
    }

    @Dado("preencho o campo password")
    public void preencho_o_campo_password() {
        Configuracao.browser.findElement(By.id("password")).click();
        Configuracao.browser.findElement(By.id("password")).sendKeys("xpaq2Z@Q?");
    }

    @Dado("preencho o campo confirm password")
    public void preencho_o_campo_confirm_password() {        
        Configuracao.browser.findElement(By.id("confirmpassword")).click();
        Configuracao.browser.findElement(By.id("confirmpassword")).sendKeys("xpaq2Z@Q?");
    }

    @Dado("preencho o campo Comments")
    public void preencho_o_campo_Comments() {
        Configuracao.browser.findElement(By.id("Comments")).sendKeys("Olá! Estou feliz por participar deste treinamento. Obrigada");
        
    }

    @Dado("clico no botao send da send quote")
    public void clico_no_botao_send_da_send_quote() throws InterruptedException{
        Configuracao.browser.findElement(By.id("sendemail")).click();
        Thread.sleep(10000);       
    }
    
    @Dado("verifico a mensagem de envio de email com sucesso")
    public void verifico_a_mensagem_de_envio_de_email_com_sucesso() {         
        WebElement element = Configuracao.browser.findElement(By.cssSelector("h2"));
        System.out.println(element.getText());      
        assertEquals("Sending e-mail success!", element.getText());
    }

    @Entao("finalizo o preenchimento com ok")
    public void finalizo_o_preenchimento_com_ok() throws InterruptedException{   
       Configuracao.browser.findElement(By.cssSelector(".confirm")).click();
       Thread.sleep(3000);  
       Configuracao.fechar();
    }
}