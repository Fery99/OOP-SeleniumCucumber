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
    By inputListKerang = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    By inputOnPageChar = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By inputCheckoutButton =  By.xpath("//*[@id=\"checkout\"]");
    public ChartPage (WebDriver driver){
        this.driver = driver;
    }

    public void AddChart(){
        driver.findElement(inputAddToChart).click();
    }
    public void klikViewChar(){
        driver.findElement(inputListKerang).click();
    }

    public void OnPageChar() {
        WebElement bses = driver.findElement(inputOnPageChar);
        assertTrue(bses.isDisplayed());
        assertEquals("Your Cart", bses.getText());
        System.out.println("Judul pada Item ini adalah= " + bses.getText());
    }

    public void intCheckoutButton(){
        driver.findElement(inputCheckoutButton).click();
    }


//    public void  inputChart(){
//        WebElement Akses = driver.findElement(inputChart);
//        assertTrue(Access.isDisplayed());
//        assertEquals("1",Akses.getText());
//    }


}
