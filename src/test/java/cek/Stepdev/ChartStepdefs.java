package cek.Stepdev;

import cek.BaseTest;
import cek.Page.ChartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChartStepdefs extends BaseTest {
    ChartPage ChartView;
//    @Then("user see char add one item")
//    public void userInspecItemOnPageChart() {
//        ChartView = new ChartPage(driver);
//        ChartView.inputChart();
//
//    }
    @When("user click Add to chart")
    public void userClickAddToChart() {
        ChartView.AddChart();



    }
}
