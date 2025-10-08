//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class LoginPage {
//
//    private WebDriver browser;
//
//    public LoginPage(WebDriver browser) {
//        this.browser = browser;
//    }
//
//    //Localizadores
//    WebElement textoLoginAccount = browser.findElement(By.xpath("//*[@id=\\\"form\\\"]/div/div/div[1]/div/h2"));
//    WebElement fieldEmailAddress = browser.findElement(By.name("email"));
//    WebElement fieldPassWord = browser.findElement(By.name("password"));
//    WebElement btnLogin = browser.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
//
//    public void preencheEnderecoEmail() {
//        browser.findElement(fieldEmailAddress).sendKeys("afbonattoo@gmail.com");
//    }
//
//    public void preenchePassWord() {
//        browser.findElement(fieldPassWord).sendKeys("1a2b3c4d");
//    }
//
//    public void clicaBtnLogin() {
//        browser.findElement(btnLogin).click();
//    }
//
//}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver browser;

    // Construtor
    public LoginPage(WebDriver browser) {
        this.browser = browser;
    }

    // 🔹 Localizadores (somente By)
    private By fieldEmailAddress = By.name("email");
    private By fieldPassWord = By.name("password");
    private By btnLogin = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private By textoLoginAccount = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2");

    // 🔹 Ações
    public void preencheEnderecoEmail(String email) {
        browser.findElement(fieldEmailAddress).sendKeys("afbonattoo@gmail.com");
    }

    public void preenchePassWord(String senha) {
        browser.findElement(fieldPassWord).sendKeys("1a2b3c4d");
    }

    public void clicaBtnLogin() {
        browser.findElement(btnLogin).click();
    }

    // 🔹 Validação (opcional)
    public String obterTextoLoginAccount() {
        return browser.findElement(textoLoginAccount).getText();
    }
}

