package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;
import suporte.Screenshot;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginInvalidoTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeAll
    public void setUp() {
        driver = Web.criaChrome();
        driver.get("https://automationexercise.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    @DisplayName("Validar mensagem de erro ao tentar login inválido")
    public void deveExibirMensagemDeErroParaLoginInvalido() {
        loginPage
                .preencherEmail("usuario_invalido@teste.com")
                .preencherSenha("senhaErrada123")
                .clicarBotaoLogin();

        Assertions.assertTrue(
                loginPage.isMensagemErroVisivel(),
                "A mensagem de erro de login não foi exibida!"
        );
    }

    @AfterEach
    public void tirarPrintAposTeste() {
        String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        Screenshot.tirarPrint(driver, "LoginInvalido_" + dataHora + ".png");
    }

    @AfterAll
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
