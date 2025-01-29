package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutPage {
    protected WebDriver driver;

    public LogoutPage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By menuBtn = By.id("react-burger-menu-btn");
    By logoutBtn = By.id("logout_sidebar_link");

    //actions
    public void menuBtn(){
        driver.findElement(menuBtn).click();
    }

    public void logoutBtn(){
        driver.findElement(logoutBtn).click();
    }

    public void succcessLogout(){
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.saucedemo.com/"));
    }
}
