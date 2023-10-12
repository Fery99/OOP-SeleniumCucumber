package cek.Page;

import cek.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChekoutPage extends BaseTest {
    By inputScreenCheckoutPage = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By inputFristName = By.xpath("//*[@id=\"first-name\"]");
    By inputLastName =  By.xpath("//*[@id=\"last-name\"]");
    By inputKodePos = By.xpath("//*[@id=\"postal-code\"]");
    By inputContinueButton = By.xpath("//*[@id=\"continue\"]");
    By inputCheckoutOverview = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By inputFinisButton =  By.xpath("//*[@id=\"finish\"]");
    By inputCheckoutComplete = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    public ChekoutPage (WebDriver driver){
        this.driver = driver;
    }
    public void ScreenCheckoutPage(){
        WebElement cses = driver.findElement(inputScreenCheckoutPage);
        assertTrue(cses.isDisplayed());
        assertEquals("Checkout: Your Information", cses.getText());
        System.out.println("Judul pada Item ini adalah= " + cses.getText());

    }

    public void fristName(String NamaPertama){
        driver.findElement(inputFristName).sendKeys(NamaPertama);
        }

    public void lastName(String NamaTerakhir){
        driver.findElement(inputLastName).sendKeys(NamaTerakhir);
    }
    public void kodePos(String ZipCode){
        driver.findElement(inputKodePos).sendKeys(ZipCode);
    }

    public void clickContinue(){
        driver.findElement(inputContinueButton).click();
    }
    public void CheckoutOverviewPage() {
        WebElement dses = driver.findElement(inputCheckoutOverview);
        assertTrue(dses.isDisplayed());
        assertEquals("Checkout: Overview", dses.getText());
        System.out.println("Judul pada Item ini adalah= " + dses.getText());
    }

    public void FinishButton(){
        driver.findElement(inputFinisButton).click();
    }

    public void CheckoutComplete(){
        WebElement eces = driver.findElement(inputCheckoutComplete);
        assertTrue(eces.isDisplayed());
        assertEquals("Checkout: Complete!", eces.getText());
    }
}
