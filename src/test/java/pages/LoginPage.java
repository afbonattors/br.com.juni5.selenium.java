package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Construtor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Localizadores
    private By campoEmail = By.name("email");
    private By campoSenha = By.name("password");
    private By botaoLogin = By.xpath("//button[contains(text(),'Login')]");
    private By mensagemErro = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");

    // Ações
    public LoginPage preencherEmail(String email) {
        driver.findElement(campoEmail).sendKeys(email);
        return this;
    }

    public LoginPage preencherSenha(String senha) {
        driver.findElement(campoSenha).sendKeys(senha);
        return this;
    }

    public LoginPage clicarBotaoLogin() {
        driver.findElement(botaoLogin).click();
        return this;
    }

    // Validação
    public boolean isMensagemErroVisivel() {
        try {
            return driver.findElement(mensagemErro).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
