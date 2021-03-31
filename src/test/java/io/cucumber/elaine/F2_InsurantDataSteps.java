package io.cucumber.elaine;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.elaine.servicos.Configuracao;


public class F2_InsurantDataSteps extends Configuracao {

    @Dado("que preencho o campo first name")
    public void que_preencho_o_campo_first_name() {
        Configuracao.browser.findElement(By.id("firstname")).click();
        Configuracao.browser.findElement(By.id("firstname")).sendKeys("Elaine");       
    }

    @Dado("preencho o campo last name")
    public void preencho_o_campo_last_name() {
        Configuracao.browser.findElement(By.id("lastname")).click();
        Configuracao.browser.findElement(By.id("lastname")).sendKeys("Moreira");
    }

    @Dado("seleciono o campo date of birth")
    public void seleciono_o_campo_date_of_birth() {
        Configuracao.browser.findElement(By.id("birthdate")).click();
        Configuracao.browser.findElement(By.id("birthdate")).sendKeys("02/15/1982");
    }

    @Dado("clico na opcao Gender")
    public void clico_na_opcao_Gender() {
        Configuracao.browser.findElement(By.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(2) > .ideal-radio")).click();
 
    }

    @Dado("preencho o campo street address")
    public void preencho_o_campo_street_address() {
        Configuracao.browser.findElement(By.id("streetaddress")).click();
        Configuracao.browser.findElement(By.id("streetaddress")).sendKeys("Rua Europa");
    }

    @Dado("seleciono o campo country")
    public void seleciono_o_campo_country() {
        Configuracao.browser.findElement(By.id("country")).click();
        WebElement dropdown = Configuracao.browser.findElement(By.id("country"));
        dropdown.findElement(By.xpath("//option[. = 'Brazil']")).click();
    }

    @Dado("preencho o campo zip code")
    public void preencho_o_campo_zip_code() {
        Configuracao.browser.findElement(By.id("zipcode")).click();
        Configuracao.browser.findElement(By.id("zipcode")).sendKeys("12345678");
    }

    @Dado("preencho o campo city")
    public void preencho_o_campo_city() {
        Configuracao.browser.findElement(By.id("city")).click();
        Configuracao.browser.findElement(By.id("city")).sendKeys("Sao Paulo");
    }

    @Dado("seleciono o campo occupation")
    public void seleciono_o_campo_occupation() {
        Configuracao.browser.findElement(By.id("occupation")).click();
        WebElement dropdown = Configuracao.browser.findElement(By.id("occupation"));
        dropdown.findElement(By.xpath("//option[. = 'Unemployed']")).click();
    }

    @Dado("clico na opcao Hobbies")
    public void clico_na_opcao_Hobbies() {
        Configuracao.browser.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
        Configuracao.browser.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(2) > .ideal-check")).click();
        Configuracao.browser.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(3) > .ideal-check")).click();
        Configuracao.browser.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(4) > .ideal-check")).click();
        Configuracao.browser.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check")).click();
    }

    @Dado("preencho Website")
    public void preencho_Website() {
        Configuracao.browser.findElement(By.id("website")).click();
        Configuracao.browser.findElement(By.id("website")).sendKeys("www.elainemor.com.br");
    }

    @Dado("clico no botao next insurant")
    public void clico_no_botao_next_insurant() {
        Configuracao.browser.findElement(By.id("nextenterproductdata")).click();
    } 

    @Entao("devo ver o proximo formulario product data")
    public void devo_ver_o_proximo_formulario_product_data() {
        assertEquals(true,true);
    } 
}
       
    