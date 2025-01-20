package utils;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AddPage;
import pages.CartPage;
import pages.LoginPage;

import java.util.List;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void goToProductPage() {
        LoginPage loginPage = new LoginPage(driver);

        //login
        loginPage.openLoginPage();
        loginPage.validUsername();
        loginPage.validPassword();
        loginPage.loginBtnClick();
        loginPage.inProductPage();
    }

    public void goToCheckoutPage(){
        AddPage addPage = new AddPage(driver);
        CartPage cartPage = new CartPage(driver);

        //proses kee checkout page
        goToProductPage();
        addPage.addProduct1();
        cartPage.cartButton();
        cartPage.checkOutProduct();
    }

    public void validatErrorMessage(String actualErrorMessage, List<String> validMessages) {
        Assert.assertTrue(
                validMessages.contains(actualErrorMessage),
                "Unexpected error message: " + actualErrorMessage
        );
    }
}
