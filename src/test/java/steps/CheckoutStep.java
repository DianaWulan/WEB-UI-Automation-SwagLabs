package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import utils.DriverFactory;
import utils.NavigationHelper;

import java.util.Arrays;
import java.util.List;

public class CheckoutStep {
    private WebDriver driver = DriverFactory.getDriver();
    private CheckoutPage checkoutPage = new CheckoutPage(driver);
    private NavigationHelper navigationHelper = new NavigationHelper(driver);

    @Given("user to checkout page")
    public void userToCheckoutPage() {
        navigationHelper.goToCheckoutPage();
    }

    @And("user input the first name")
    public void userInputTheFirstName() {
        checkoutPage.validFirstName();
    }

    @And("user input the last name")
    public void userInputTheLastName() {
        checkoutPage.validLastName();
    }

    @And("user input zip postal code")
    public void userInputZipPostalCode() {
        checkoutPage.validZipPostalCode();
    }

    @When("user clik continue button")
    public void userClikContinueButton() {
        checkoutPage.continueButton();
    }

    @Then("user redirect to checkout overview page")
    public void userRedirectToCheckoutOverviewPage() {
        checkoutPage.redirectToCheckoutOverview();
    }

    @And("user input the invalid num first name")
    public void userInputTheInvalidNumFirstName() {
        checkoutPage.NumFirstName();
    }

    @Then("user get error massage checkout")
    public void userGetErrorMassageCheckout() {
        // Ambil pesan error dari halaman
        String actualErrorMessage = checkoutPage.getErrorMassage();

        // Daftar pesan error yang valid
        List<String> validErrorMessages = Arrays.asList(
                "Error: First Name is required",
                "Error: Last Name is required",
                "Error: Postal Code is required"
        );

        // Validasi pesan error menggunakan NavigationHelper
        navigationHelper.validatErrorMessage(actualErrorMessage, validErrorMessages);
    }

    @And("user input the invalid char first name")
    public void userInputTheInvalidCharFirstName() {
        checkoutPage.CharFirstName();
    }

    @And("user input the zip postal code")
    public void userInputTheZipPostalCode() {
        checkoutPage.validZipPostalCode();
    }

    @And("user input the invalid num last name")
    public void userInputTheInvalidNumLastName() {
        checkoutPage.NumLastName();
    }

    @And("user input the invalid char last name")
    public void userInputTheInvalidCharLastName() {
        checkoutPage.CharLastName();
    }

    @And("user input invalid zip postal code")
    public void userInputInvalidZipPostalCode() {
        checkoutPage.WordZipPostalCode();
    }

    @And("user input invalid char zip postal code")
    public void userInputInvalidCharZipPostalCode() {
        checkoutPage.CharZipPostalCode();
    }

    @When("user clik cancel button")
    public void userClikCancelButton() {
        checkoutPage.cancelBtn();
    }

    @Then("user redirected to cart page")
    public void userRedirectedToCartPage() {
        checkoutPage.redirectToCartPage();
    }

    @Given("user to checkout overview page")
    public void userToCheckoutOverviewPage() {
        navigationHelper.goToCheckoutPage();
        userInputTheFirstName();
        userInputTheLastName();
        userInputZipPostalCode();
        userClikContinueButton();
        //cek url
        //System.out.println("Current URL: " + driver.getCurrentUrl());
    }

//    @Then("user redirected to the product page")
//    public void userRedirectedToTheProductPage() {
//        checkoutPage.redirectToProductPage();
//    }

    @When("user clik finish button")
    public void userClikFinishButton() {
        checkoutPage.finishBtn();
    }

    @Then("user redirected to the checkout complete page")
    public void userRedirectedToTheCheckoutCompletePage() {
        checkoutPage.redirectToCheckoutCompletePage();
    }

    @Given("user to checkout complate page")
    public void userToCheckoutComplatePage() {
        userToCheckoutOverviewPage();
        userClikFinishButton();
    }

    @When("user clik Back Home button")
    public void userClikBackHomeButton() {
        checkoutPage.backHomeBtn();
    }

    @When("user clik cancel button in checkout overview page")
    public void userClikCancelButtonInCheckoutOverviewPage() {
        //cek url
        //System.out.println("Current URL: " + driver.getCurrentUrl());
        checkoutPage.cancelOverviewBtn();
    }
}
