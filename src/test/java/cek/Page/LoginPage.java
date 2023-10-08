package cek.Page;

import cek.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BaseTest {

    By inputTextUserName = By.xpath("//*[@id=\"user-name\"]");
    By inputTextPassword = By.xpath("//*[@id=\"password\"]");
    By inputTextLoginButton = By.xpath("//*[@id=\"login-button\"]");


    public LoginPage(WebDriver driver){
        this.driver= driver;
    }
    public void linkUrl(){
        driver.navigate().to("https://www.saucedemo.com");
    }

    public void inputUserName (String username){
        driver.findElement(inputTextUserName).sendKeys(username);
    }

    public void inputPassword (String Password){
        driver.findElement(inputTextPassword).sendKeys(Password);
    }

    public void loginButton (){
        driver.findElement(inputTextLoginButton).click();
    }

    public void validateError(String ErrorBro){
        assertTrue(driver.getPageSource().contains(ErrorBro));
    }


}
