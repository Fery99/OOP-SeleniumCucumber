package cek.Page;

import cek.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChartPage extends BaseTest {
//    By inputChart = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By inputAddToChart = By.id("add-to-cart-sauce-labs-onesie");
    public ChartPage (WebDriver driver){
        this.driver = driver;
    }

    public void AddChart(){
        driver.findElement(inputAddToChart).click();

    }
//    public void  inputChart(){
//        WebElement Akses = driver.findElement(inputChart);
//        assertTrue(Access.isDisplayed());
//        assertEquals("1",Akses.getText());
//    }


}
