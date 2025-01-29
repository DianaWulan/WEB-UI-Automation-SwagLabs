package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.LogoutPage;
import utils.DriverFactory;

public class LogoutStep {
    private WebDriver driver = DriverFactory.getDriver();
    private LogoutPage logoutPage = new LogoutPage(driver);
    private LoginPage loginPage = new LoginPage(driver);

    @When("user clik Menu button")
    public void userClikMenuButton() {
        logoutPage.menuBtn();
    }

    @And("user clik logout button")
    public void userClikLogoutButton() {
        logoutPage.logoutBtn();
    }

    @Then("user success logout")
    public void userSuccessLogout() {
        Assert.assertTrue(loginPage.loginField(),"You in login page");
        logoutPage.succcessLogout();
    }
}
