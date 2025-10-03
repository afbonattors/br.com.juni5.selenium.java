package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tests.PaginaEcommerceTest.browser;


public class PageHome {
    WebElement carrocelHome = browser.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div"));
}
