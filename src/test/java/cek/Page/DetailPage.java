package cek.Page;

import cek.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetailPage extends BaseTest {
    By inputPageItemSelecrion = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    public DetailPage(WebDriver driver){
        this.driver =driver;
    }

    public void  detailItem(){
        WebElement Access = driver.findElement(inputPageItemSelecrion);
        assertTrue(Access.isDisplayed());
        assertEquals("Sauce Labs Onesie",Access.getText());
        System.out.println("Judul pada Item ini adalah=" + Access.getText());
    }

}
