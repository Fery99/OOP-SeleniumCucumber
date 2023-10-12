package cek.Stepdev;

import cek.BaseTest;
import cek.Page.DetailPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DetailStepdefs extends BaseTest {
    DetailPage itemPage;

    @Then("user is on page of item selection")
    public void userIsOnPageOfItemSelection() {
        itemPage = new DetailPage(driver);
        itemPage.detailItem();

    }

}