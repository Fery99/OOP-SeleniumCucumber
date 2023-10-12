package cek.Stepdev;

import cek.BaseTest;
import cek.Page.ChekoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepdefs extends BaseTest {
    ChekoutPage View;
    @And("user is on Page checkot")
    public void userIsOnPageCheckot() {
        View = new  ChekoutPage(driver);
        View.ScreenCheckoutPage();
    }

    @And("user input Frist Name with {string}")
    public void userInputFristNameWith(String NamaPertama) {
        View.fristName(NamaPertama);
    }

    @And("user input Last Name  with {string}")
    public void userInputLastNameWith(String NamaTerakhir) {
        View.lastName(NamaTerakhir);
    }


    @And("user input Zip\\/Code with {string}")
    public void userInputZipCodeWith(String ZipCode) {
        View.kodePos(ZipCode);
    }

    @And("user click item Continue")
    public void userClickItemContinue() {
        View = new ChekoutPage(driver);
        View.clickContinue();
    }

    @And("user is on Page Checkout Overview")
    public void userIsOnPageCheckoutOverview() {
        View.CheckoutOverviewPage();
    }

    @When("user click Finish")
    public void userClickFinish() {
        View = new ChekoutPage(driver);
        View.FinishButton();
    }

    @Then("user is on Page Checkout Complete")
    public void userIsOnPageCheckoutComplete() {
        View.CheckoutComplete();
    }
}
