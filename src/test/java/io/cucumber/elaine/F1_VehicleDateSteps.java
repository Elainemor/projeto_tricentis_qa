package io.cucumber.elaine;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.pt.*;
import io.cucumber.elaine.servicos.Configuracao;


public class F1_VehicleDateSteps extends Configuracao {
       
    @Dado("que eu estou no site da tricentis")
    public void que_eu_estou_no_site_da_tricentis() {    
        Configuracao.abrir("http://sampleapp.tricentis.com/101/app.php");
    }
    
    @Dado("seleciono o formulario motorcycle")
    public void seleciono_o_formulario_motorcycle() {
        Configuracao.browser.findElement(By.id("nav_motorcycle")).click();        
    }

    @Dado("preencho o campo make")
    public void preencho_o_campo_make() {    
        WebElement dropdown = Configuracao.browser.findElement(By.id("make"));
        dropdown.findElement(By.xpath("//option[. = 'Honda']")).click();  
    }

    @Dado("seleciono o campo model")
    public void seleciono_o_campo_model() {
        WebElement dropdown = Configuracao.browser.findElement(By.id("model"));
        dropdown.findElement(By.xpath("//option[. = 'Scooter']")).click();
    }

    @Dado("preencho o campo cylinder capacity")
    public void preencho_o_campo_cylinder_capacity() {
        Configuracao.browser.findElement(By.id("cylindercapacity")).click();
        Configuracao.browser.findElement(By.id("cylindercapacity")).sendKeys("123");
    }

    @Dado("preencho o campo engine performance kw")
    public void preencho_o_campo_engine_performance_kw() {
        Configuracao.browser.findElement(By.id("engineperformance")).click();
        Configuracao.browser.findElement(By.id("engineperformance")).sendKeys("2");
    }

    @Dado("preencho a date of manufacture")
    public void preencho_a_date_of_manufacture() {
        Configuracao.browser.findElement(By.id("dateofmanufacture")).click();
        Configuracao.browser.findElement(By.id("dateofmanufacture")).sendKeys("06/20/2008");
    }

    @Dado("seleciono o campo number of seats")
    public void seleciono_o_campo_number_of_seats() {
        Configuracao.browser.findElement(By.id("numberofseatsmotorcycle")).click();    
        WebElement dropdown = Configuracao.browser.findElement(By.id("numberofseatsmotorcycle"));
        dropdown.findElement(By.xpath("//option[. = '2']")).click();
      }

    @Dado("preencho o campo list price")
    public void preencho_o_campo_list_price() {
        Configuracao.browser.findElement(By.id("listprice")).click();
        Configuracao.browser.findElement(By.id("listprice")).sendKeys("12345");
    }

    @Dado("preencho annual mileage")
    public void preencho_annual_mileage() {
        Configuracao.browser.findElement(By.id("annualmileage")).click();
        Configuracao.browser.findElement(By.id("annualmileage")).sendKeys("2001");        
    }
    
    @Dado("clico no botao next vehicle data")
    public void clico_no_botao_next_vehicle_data() {
        Configuracao.browser.findElement(By.id("nextenterinsurantdata")).click();
    }
    
    @Entao("devo ver o proximo formulario insurance data")
    public void devo_ver_o_proximo_formulario_insurance_data() {
        assertEquals(true,true);
    } 
}