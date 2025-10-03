package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.paginaEcommerceTest.browser;


public class pageHome {
    WebElement carrocelHome = browser.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div"));
}
