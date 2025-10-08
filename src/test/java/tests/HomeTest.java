package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class HomeTest {
    private WebDriver browser;

    @BeforeAll
    public void setUp() {
        browser = Web.criaChrome();
    }

    @Test
    public void loginInvalido() {

        LoginPage login = new LoginPage(browser);
            login.preencheEnderecoEmail();
            login.preenchePassWord();
            login.clicaBtnLogin();
    }

    @AfterAll
    public void tearDown() {
        browser.quit();
    }
}
