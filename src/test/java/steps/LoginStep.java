package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginStep {
    //Before
    private WebDriver driver = DriverFactory.getDriver(); // Ambil instance driver dari DriverFactory
    private LoginPage loginPage = new LoginPage(driver);  // Buat instance LoginPage


    @Given("user enter the swag labs in browser")
    public void userEnterTheSwagLabsInBrowser() {
        loginPage.openLoginPage();
    }

    @When("user in login page")
    public void userInLoginPage() {
        Assert.assertTrue(loginPage.loginField(),"You in login page");
    }

    @And("user input the valid username")
    public void userInputTheValidUsername() {
        loginPage.validUsername();
    }

    @And("user input the valid password")
    public void userInputTheValidPassword() {
        loginPage.validPassword();
    }

    @And("user click the login button")
    public void userClickTheLoginButton() {
        loginPage.loginBtnClick();
    }

    @Then("user redirected to product page")
    public void userRedirectedToProductPage() {
        loginPage.inProductPage();
    }

    @And("user input the invalid username")
    public void userInputTheInvalidUsername() {
        loginPage.InvalidUsername();
    }

    @And("user input the invalid password")
    public void userInputTheInvalidPassword() {
        loginPage.InvalidPassword();
    }

    @Then("user get error massage")
    public void userGetErrorMassage() {
        Assert.assertTrue(loginPage.errorMessage(),"error message is not displayed");
        Assert.assertTrue(loginPage.getErrorMessage().startsWith("Epic sadface"), "error message is not match ");
    }

    @After
    public void tearDown() {
        // Mengakhiri sesi WebDriver
        DriverFactory.quitDriver();
    }
}
