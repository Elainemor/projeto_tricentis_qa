package io.cucumber.elaine.servicos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class Configuracao {
    
    public static WebDriver browser;
    
    public static void abrir(String url) { 
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();        
        browser.get(url);
    }

    public static void fechar(){
        browser.close();
        browser = null;
    }   


}