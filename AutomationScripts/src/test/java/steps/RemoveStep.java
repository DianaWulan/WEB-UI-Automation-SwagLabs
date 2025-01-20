package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddPage;
import pages.RemovePage;
import utils.DriverFactory;

public class RemoveStep {
    private WebDriver driver = DriverFactory.getDriver();
    private RemovePage removePage = new RemovePage(driver);
    private AddPage addPage = new AddPage(driver);

    @And("user click Remove button on one product")
    public void userClickRemoveButtonOnOneProduct() {
        removePage.removeProduct1();
    }

    @Then("user success remove product")
    public void userSuccessRemoveProduct() {
        removePage.cartIsEmpty();
    }

    @When("user click Add To Cart button on first, second and third product")
    public void userClickAddToCartButtonOnFirstSecondAndThirdProduct() {
        addPage.addProduct1();
        addPage.addProduct2();
        addPage.addProduct3();
    }

    @And("user click Remove button on first, second and third product")
    public void userClickRemoveButtonOnFirstSecondAndThirdProduct() {
        removePage.removeProduct1();
        removePage.removeProduct2();
        removePage.removeProduct3();
    }

    @Then("user success remove all product")
    public void userSuccessRemoveAllProduct() {
        removePage.cartIsEmpty();
    }
}
