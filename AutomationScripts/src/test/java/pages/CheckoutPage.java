package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By validFirstName = By.id("first-name");
    By validLastName = By.id("last-name");
    By validZipPostalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By cancelBtn = By.xpath("//*[@id='cancel']");
    By cancelOverviewBtn = By.xpath("//*[@id='cancel']");
    By finishBtn = By.xpath("//*[@id='finish']");
    By backHomeBtn = By.xpath("//*[@id='back-to-products']");
    By errorMassage = By.xpath("//*[@id='checkout_info_container']/div/form/div[1]/div[4]/h3");


    //action

    public void validFirstName(){
        driver.findElement(validFirstName).sendKeys("Diana");
    }

    public void NumFirstName(){
        driver.findElement(validFirstName).sendKeys("1234");
    }

    public void CharFirstName(){
        driver.findElement(validFirstName).sendKeys("Diana^-@");
    }

    public void validLastName(){
        driver.findElement(validLastName).sendKeys("Wulan");
    }

    public void NumLastName(){
        driver.findElement(validLastName).sendKeys("4567");
    }

    public void CharLastName(){
        driver.findElement(validLastName).sendKeys("Wulan*#");
    }

    public void validZipPostalCode(){
        driver.findElement(validZipPostalCode).sendKeys("17530");
    }

    public void WordZipPostalCode(){
        driver.findElement(validZipPostalCode).sendKeys("Bekasi");
    }

    public void CharZipPostalCode(){
        driver.findElement(validZipPostalCode).sendKeys("175*%");
    }

    public void continueButton(){
        driver.findElement(continueBtn).click();
    }

    public void redirectToCheckoutOverview(){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-step-two.html"));
    }

    public void cancelBtn(){
        driver.findElement(cancelBtn).click();
    }

    public void redirectToCartPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("cart.html"));
    }

    public void cancelOverviewBtn(){
        driver.findElement(cancelOverviewBtn).click();
    }

    public void finishBtn(){
        driver.findElement(finishBtn).click();
    }

    public void redirectToCheckoutCompletePage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete.html"));
    }

    public void backHomeBtn(){
        driver.findElement(backHomeBtn).click();
    }

    public String getErrorMassage(){
        System.out.println(driver.getCurrentUrl());
        return driver.findElement(errorMassage).getText();
    }

}
