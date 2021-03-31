package io.cucumber.elaine;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.*;
import io.cucumber.elaine.servicos.Configuracao;


public class F3_ProductDataSteps extends Configuracao {

    @Dado("preencho o campo start date")
    public void preencho_o_campo_start_date() {
        Configuracao.browser.findElement(By.id("startdate")).sendKeys("05/05/2021");
    }

    @Dado("seleciono o campo insurance sum")
    public void seleciono_o_campo_insurance_sum() throws InterruptedException{
         Configuracao.browser.findElement(By.id("insurancesum")).click();        

        WebElement insurancesumType = Configuracao.browser.findElement(By.xpath("//select[@id='insurancesum']"));
        Select dropdownField = new Select(insurancesumType);
        dropdownField.selectByIndex(4);
        
    }

    @Dado("seleciono o campo damage insurance")
    public void seleciono_o_campo_damage_insurance() {
        Configuracao.browser.findElement(By.id("damageinsurance")).click();    
        WebElement dropdown = Configuracao.browser.findElement(By.id("damageinsurance"));
        dropdown.findElement(By.xpath("//option[. = 'No Coverage']")).click();
    }
    
    @Dado("clico na opcao optional products")
    public void clico_na_opcao_optional_products() {
        Configuracao.browser.findElement(By.cssSelector(".idealforms-field:nth-child(4) .ideal-radiocheck-label:nth-child(1)")).click();
        Configuracao.browser.findElement(By.cssSelector(".idealforms-field:nth-child(4) .ideal-radiocheck-label:nth-child(2)")).click();
    }
   
    @Dado("clico no botao next product data")
    public void clico_no_botao_next_product_data() {
        Configuracao.browser.findElement(By.id("nextselectpriceoption")).click();               
    }
    
    @Entao("devo ver o proximo formulario price option")
    public void devo_ver_o_proximo_formulario_price_option() {        
        assertEquals(true,true);
    }
    

}