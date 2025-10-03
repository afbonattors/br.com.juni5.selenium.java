package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class paginaEcommerceTest {

    private  static WebDriver browser;

    //Abre o navegador
    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium WebDriver Java JUnit5\\drivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testHomeEcommerce(){
        //Navega até a página "Automation Exercise"
        browser.get("https://automationexercise.com/");

        //Valida nome da página home
        assertEquals("Automation Exercise", browser.getTitle(), "O título da página não foi validado com sucesso!");

        //Navega para página "Products"
        WebElement paginaProduto = browser.findElement(By.cssSelector("a[href='/products']"));
        paginaProduto.click();

        //Identifica a imagem de 50% na página "Products"
        WebElement imagemDesconto = browser.findElement(By.id("sale_image"));

        //Valida nome é exibido a imagem 50% desconto
        assertTrue(imagemDesconto.isDisplayed(), "A imagem de desconto não está sendo exibida com sucesso!");

        //Identifica o texto "ALL PRODUCTS"
        WebElement textoALLPRODUCTS = browser.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));

        //Valida se o texto "ALL PRODUCTS" é exibiso
        assertTrue(textoALLPRODUCTS.isDisplayed(), "Texto All Products não está sendo exibido!");
    }

    //Fecha o navegador
    @AfterAll
    public static void tearDown() {
        if (browser != null) {
            browser.quit();
        }
    }
}