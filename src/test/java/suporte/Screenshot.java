package suporte;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

public class Screenshot {
    public static void tirarPrintScreen(WebDriver browser, String arquivo) {
        File screenshot = ((TakesScreenshot) browser).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File(arquivo));
        } catch (Exception e) {
            System.out.println("Houve problema ao copiar o arquivo para a pasta: " + e.getMessage());
        }
    }
}