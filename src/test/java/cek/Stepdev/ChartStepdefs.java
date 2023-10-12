package cek.Stepdev;

import cek.BaseTest;
import cek.Page.ChartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChartStepdefs extends BaseTest {
    ChartPage ChartView;

    @Then("user click Add to chart")
    public void userItemOnPageChart() {
        ChartView = new ChartPage(driver);
        ChartView.AddChart();
    }

    @And("user inspec item on Page Chart")
    public void userInspecItemOnPageChart() {
        ChartView = new ChartPage(driver);
        ChartView.klikViewChar();
    }

    @And("USer on Page Chart")
    public void userOnPageChart() {
        ChartView.OnPageChar();
    }

    @And("user click Checkout")
    public void userClickCheckout() {
        ChartView = new ChartPage(driver);
        ChartView.intCheckoutButton();
    }
}
