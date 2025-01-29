package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddPage;
import pages.CartPage;
import utils.DriverFactory;

public class CartStep {
    private WebDriver driver = DriverFactory.getDriver();
    private CartPage cartPage = new CartPage(driver);
    private AddPage addPage = new AddPage(driver);

    @And("user add products to cart")
    public void userAddProductsToCart() {
        addPage.addProduct1();
        addPage.addProduct2();
    }

    @And("user clik the cart icon")
    public void userClikTheCartIcon() {
        cartPage.cartButton();
    }

    @When("user in the cart page")
    public void userInTheCartPage() {
        cartPage.InCartPage();
    }

    @And("user clik Remove button")
    public void userClikRemoveButton() {
        cartPage.removeProduct();
    }

    @Then("user success remove product in cart page")
    public void userSuccessRemoveProductInCartPage() {
        cartPage.successRemoveCart();
    }

    @And("user clik Continue Shopping button")
    public void userClikContinueShoppingButton() {
        cartPage.continueShoppingProduct();
    }

    @Then("user redirected to the product page")
    public void userRedirectedToTheProductPage() {
        cartPage.redirectProductPage();
    }

    @And("user add one product to cart")
    public void userAddOneProductToCart() {
        addPage.addProduct1();
    }

    @And("user clik Checkout button")
    public void userClikCheckoutButton() {
        cartPage.checkOutProduct();
    }

    @Then("user redirected to Checkout page")
    public void userRedirectedToCheckoutPage() {
        cartPage.InCheckoutPage();
    }

    //FAILED
    @Then("user failed redirect to checkout page and get error massage")
    public void userFailedRedirectToCheckoutPageAndGetErrorMassage() {
        //cek url
        System.out.println("Current URL: " + driver.getCurrentUrl());

        cartPage.getErrorMassage();
    }

}
