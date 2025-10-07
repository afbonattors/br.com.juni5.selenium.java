package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Web {

    public static WebDriver browser;

    public static WebDriver criaChrome() {
        //Define os parametros de navegador
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium WebDriver Java JUnit5\\br.com.juni5.selenium.java\\drivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navega até a página "Automation Exercise"
        browser.get("https://automationexercise.com/");

        return browser;
    }
}