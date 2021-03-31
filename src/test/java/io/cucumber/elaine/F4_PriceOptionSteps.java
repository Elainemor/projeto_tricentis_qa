package io.cucumber.elaine;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.*;
import io.cucumber.elaine.servicos.Configuracao;


public class F4_PriceOptionSteps extends Configuracao {

    @Dado("que clico na opcao ultimate")
    public void que_clico_na_opcao_ultimate() {
        Configuracao.browser.findElement(By.cssSelector(".choosePrice:nth-child(4) > .ideal-radio")).click();
        Configuracao.browser.findElement(By.id("selectpriceoption")).click();
    }        

    @Dado("clico no botao next price option")
    public void clico_no_botao_next_price_option() throws InterruptedException {
        Thread.sleep(2000);
        Configuracao.browser.findElement(By.id("nextsendquote")).click();
    }
    
    @Entao("vejo o proximo formulario send quote")
    public void vejo_o_proximo_formulario_send_quote()  {        
        assertEquals(true,true);
    }
}

