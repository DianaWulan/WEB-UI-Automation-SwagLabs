package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    //locator
    By cart = By.xpath("//*[@id='shopping_cart_container']/a");
    By cartPage = By.xpath("//*[@id='header_container']/div[2]/span");
    By removeButton = By.xpath("//*[@id='remove-sauce-labs-backpack']");
    By continueshoppingButton = By.xpath("//*[@id='continue-shopping']");
    By checkoutButton = By.xpath("//*[@id='checkout']");
    By succcesRemove = By.id("remove-sauce-labs-bike-light");
    By succcessCheckoutPage = By.xpath("//*[@id='header_container']/div[2]/span");

    //action
    public void cartButton(){
        driver.findElement(cart).click();
    }
    public void InCartPage(){
        boolean Cartpage = driver.findElement(cartPage).isDisplayed();
        Assert.assertTrue(Cartpage,"You in cart page");
    }

    public void removeProduct(){
        driver.findElement(removeButton).click();
    }

    public void successRemoveCart(){
        // Tunggu hingga elemen cart_item tidak lagi terlihat
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu hingga elemen removed_cart_item muncul
        //WebElement removedCartItem = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("remove-sauce-labs-bike-light")));
        //Assert.assertTrue(removedCartItem.isDisplayed(), "Produk tidak berhasil dihapus dari keranjang!");

        boolean removeProduct = driver.findElement(succcesRemove).isDisplayed();
        Assert.assertTrue(removeProduct, "Success remove product from cart");
    }

    public void continueShoppingProduct(){
        driver.findElement(continueshoppingButton).click();
    }

    public void redirectProductPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        //driver.quit();
    }

    public void checkOutProduct(){
        driver.findElement(checkoutButton).click();
    }

    public void InCheckoutPage(){
        boolean inCheckoutPage = driver.findElement(succcessCheckoutPage).isDisplayed();
        Assert.assertTrue(inCheckoutPage,"You in checkout page");
    }

    public void getErrorMassage(){
        String actualErrorMessage = driver.findElement(By.cssSelector("error-message-container")).getText();
        String expectedErrorMessage = "Your cart is empty. Please add items before checking out.";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error massage is not match");
    }
}
