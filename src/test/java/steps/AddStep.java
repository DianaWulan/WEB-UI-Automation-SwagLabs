package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddPage;
import utils.DriverFactory;
import utils.NavigationHelper;

public class AddStep {
    private WebDriver driver = DriverFactory.getDriver();
    private AddPage addPage = new AddPage(driver);
    private NavigationHelper navigationHelper = new NavigationHelper(driver);

    @Given("user in the product page")
    public void userInTheProductPage() {
        //panggil skenario login
        navigationHelper.goToProductPage();
    }

    @When("user click Add To Cart button on one product")
    public void userClickAddToCartButtonOnOneProduct() {
        addPage.addProduct1();
    }

    @Then("user success add one product")
    public void userSuccessAddOneProduct() {
        addPage.productInCart(1);
        driver.quit();
    }

    @When("user click Add To Cart button on first product")
    public void userClickAddToCartButtonOnFirstProduct() {
        addPage.addProduct1();
    }

    @And("user click Add To Cart button on second product")
    public void userClickAddToCartButtonOnSecondProduct() {
        addPage.addProduct2();
    }

    @And("user click Add To Cart button on third product")
    public void userClickAddToCartButtonOnThirdProduct() {
        addPage.addProduct3();
    }

    @Then("user success add three product")
    public void userSuccessAddThreeProduct() {
        addPage.productInCart(3);
        driver.quit();
    }
}
