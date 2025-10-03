package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.paginaEcommerceTest.browser;

public class menuHeader {
    WebElement paginaHome = browser.findElement(By.cssSelector("a[href='/home']"));
    WebElement paginaProduto = browser.findElement(By.cssSelector("a[href='/products']"));
    WebElement paginaCarrinho = browser.findElement(By.cssSelector("a[href='/view_cart']"));
    WebElement paginaLogin = browser.findElement(By.cssSelector("a[href='/login']"));
    WebElement paginaCasosTeste = browser.findElement(By.cssSelector("a[href='/test_case']"));
    WebElement paginaAPITeste = browser.findElement(By.cssSelector("a[href='/api_case']"));
    WebElement paginaVideoTutorial = browser.findElement(By.linkText("https://www.youtube.com/c/AutomationExercise"));
    WebElement paginaContato = browser.findElement(By.cssSelector("a[href='/contact_us']"));
}
