package cek.Page;

import cek.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BaseTest {
    By inputtextHomePage = By.xpath("//*[@id=\"item_0_title_link\"]/div");

    public HomePage(WebDriver driver){
        this.driver =driver;
    }

    public void AccesHomePage(){
        WebElement Access = driver.findElement(inputtextHomePage);
        assertTrue(Access.isDisplayed());
        assertEquals("Sauce Labs Bike Light",Access.getText());
    }
}
