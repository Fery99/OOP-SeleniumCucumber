package cek.Page;

import cek.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class detaiItemPage extends BaseTest {
    By inputPageItemSelecrion = By.xpath("<div class=\"inventory_details_price\">$29.99</div>");

    public detailItemPage(WebDriver driver){
        this.driver =driver;
    }

    public detailItem(){
        WebElement Access = driver.findElement(inputPageItemSelecrion);
        assertTrue(Access.isDisplayed());
        assertEquals("Sauce Labs Bike Light",Access.getText());
    }
}
