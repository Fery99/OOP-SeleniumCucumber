package cek.Stepdev;

import cek.BaseTest;
import cek.Page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PageStepDev extends BaseTest {
    HomePage Halaman;
    @Then("user is on homepage")
    public void userIsOnHomepage() {
        Halaman = new HomePage(driver);
        Halaman.AccesHomePage();

    }

    @And("user click open menu button")
    public void userClickOpenMenuButton() {
        Halaman.menuButton();

    }

    @When("user click all items")
    public void userClickAllItems() {
        Halaman.allItemButton();

    }

    @Then("user is on All List Item")
    public void userIsOnAllListItem() {
        Halaman.viewAllList();
    }

    @When("user click item selection")
    public void userClickItemSelection() {
        Halaman.itemSelection();

    }
}
