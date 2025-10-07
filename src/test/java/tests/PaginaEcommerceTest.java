package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;

import java.time.Duration;

public class PaginaEcommerceTest {

    public static WebDriver browser;

    @Test
    public void testHomeEcommerce(){

        browser = Web.criaChrome();

        //Identifica o logo na Home
        WebElement logoHome = browser.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));

        //Vealida se o logo na página Home é exibido
        assertTrue(logoHome.isDisplayed(), "Logo da homepage não está sendo exibido!");
        Screenshot.tirarPrintScreen(browser, "E:\\Selenium WebDriver Java JUnit5\\test-report\\automationexercise.com\\" + Generator.dataHoraParaArquivo() + "validaLogoHome.jpg");

        //Valida nome da página home
        assertEquals("Automation Exercise", browser.getTitle(), "O título da página não foi validado com sucesso!");
        Screenshot.tirarPrintScreen(browser, "E:\\Selenium WebDriver Java JUnit5\\test-report\\automationexercise.com\\" + Generator.dataHoraParaArquivo() + "validaTituloPagina.jpg");

        //Navega para página "Products"
        WebElement paginaProduto = browser.findElement(By.cssSelector("a[href='/products']"));
        paginaProduto.click();

        //Identifica a imagem de 50% na página "Products"
        WebElement imagemDesconto = browser.findElement(By.id("sale_image"));

        //Valida nome é exibido a imagem 50% desconto
        assertTrue(imagemDesconto.isDisplayed(), "A imagem de desconto não está sendo exibida com sucesso!");
        Screenshot.tirarPrintScreen(browser, "E:\\Selenium WebDriver Java JUnit5\\test-report\\automationexercise.com\\" + Generator.dataHoraParaArquivo() + "validaImagemDescontoExibido.jpg");

        //Identifica o texto "ALL PRODUCTS"
        WebElement textoALLPRODUCTS = browser.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));

        //Valida se o texto "ALL PRODUCTS" é exibiso
        assertTrue(textoALLPRODUCTS.isDisplayed(), "Texto All Products não está sendo exibido!");
        Screenshot.tirarPrintScreen(browser, "E:\\Selenium WebDriver Java JUnit5\\test-report\\automationexercise.com\\" + Generator.dataHoraParaArquivo() + "validaTextoDescontoProdutos.jpg");
    }

    //Fecha o navegador
    @AfterAll
    public static void tearDown() {
        if (browser != null) {
            browser.quit();
        }
    }
}