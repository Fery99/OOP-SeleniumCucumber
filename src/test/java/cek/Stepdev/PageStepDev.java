package cek.Stepdev;

import cek.BaseTest;
import cek.Page.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class PageStepDev extends BaseTest {


    @Then("user is on homepage")
    public void userIsOnHomepage() {
        HomePage Halaman = new HomePage(driver);
        Halaman.AccesHomePage();

    }
}
