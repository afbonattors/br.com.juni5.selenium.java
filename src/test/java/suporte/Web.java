package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Web {

    private static WebDriver browser;


    //Cria e retorna uma instância do ChromeDriver
    public static WebDriver criaChrome() {
        if (browser == null) {
            // Define o caminho do ChromeDriver
            System.setProperty("webdriver.chrome.driver", "E:\\Selenium WebDriver Java JUnit5\\br.com.juni5.selenium.java\\drivers\\chromedriver.exe");

            browser = new ChromeDriver();
            browser.manage().window().maximize();
            browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return browser;
    }


    //Retorna a instância atual do driver
    public static WebDriver getDriver() {
        return browser;
    }


    //Encerra o driver e zera a instância
    public static void fecharDriver() {
        if (browser != null) {
            browser.quit();
            browser = null; // permite criar novamente se necessário
        }
    }
}
