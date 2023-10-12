package cek.Page;

import cek.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BaseTest {
    By inputtextHomePage = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    By inputMenuButton = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    By inputListItem = By.xpath("//*[@id=\"inventory_sidebar_link\"]");
    By inputViewAllList = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    By inputItemSelection = By.xpath("//*[@id=\"item_2_title_link\"]/div");


    public HomePage(WebDriver driver){
        this.driver =driver;
    }

    public void AccesHomePage(){
        WebElement Access = driver.findElement(inputtextHomePage);
        assertTrue(Access.isDisplayed());
        assertEquals("Sauce Labs Bike Light",Access.getText());
    }

    public void menuButton (){
        driver.findElement(inputMenuButton).click();
    }

    public void allItemButton (){
        driver.findElement(inputListItem).click();
    }

    public void viewAllList(){
        WebElement Access = driver.findElement(inputViewAllList);
        assertTrue(Access.isDisplayed());
        assertEquals("Sauce Labs Bike Light",Access.getText());
    }

    public void itemSelection (){
        driver.findElement(inputItemSelection).click();
    }
}
