package suporte;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Screenshot {

    //Método que gera printscreen do teste
    public static void tirarPrint(WebDriver driver, String nomeArquivo) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // Cria pasta se não existir
            Files.createDirectories(Paths.get("target/screenshots"));
            Files.copy(screenshot.toPath(), Paths.get("target/screenshots", nomeArquivo));
            System.out.println("Screenshot salvo em: target/screenshots/" + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o screenshot: " + e.getMessage());
        }
    }
}
