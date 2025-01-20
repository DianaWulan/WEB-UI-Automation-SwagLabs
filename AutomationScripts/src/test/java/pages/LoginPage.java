package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    protected WebDriver driver;
    protected String baseUrl = "https://www.saucedemo.com/";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By loginPages = By.id("login_button_container");
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.xpath("//*[@id='login_button_container']/div/form/div[3]");

    //actions
    public void openLoginPage(){
        driver.get(baseUrl);
    }

    public boolean loginField(){
        return driver.findElement(loginPages).isDisplayed();
    }

    public void validUsername(){
        driver.findElement(usernameField).sendKeys("standard_user");
    }

    public void validPassword(){
        driver.findElement(passwordField).sendKeys("secret_sauce");
    }

    public void InvalidUsername(){
        driver.findElement(usernameField).sendKeys("invalid_user");
    }

    public void InvalidPassword(){
        driver.findElement(passwordField).sendKeys("invalid_password");
    }

    public void loginBtnClick(){
        driver.findElement(loginButton).click();
    }

    public void inProductPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }

    public boolean errorMessage(){
        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

}
