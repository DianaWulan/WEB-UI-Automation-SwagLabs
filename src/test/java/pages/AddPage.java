package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddPage {
    WebDriver driver;

    public AddPage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By firstProduct = By.id("add-to-cart-sauce-labs-backpack");
    By secondProduct = By.id("add-to-cart-sauce-labs-bike-light");
    By thridProduct = By.id("add-to-cart-sauce-labs-onesie");
    By cartProduct = By. className("shopping_cart_badge");

    //actions
    public void addProduct1(){
        driver.findElement(firstProduct).click();
    }

    public void addProduct2(){
        driver.findElement(secondProduct).click();
    }

    public void addProduct3(){
        driver.findElement(thridProduct).click();
    }

    public void productInCart(int cartContent){
        //ambil jumlah produk dalam keranjang
        WebElement cartBadge = driver.findElement(cartProduct);
        String cartCountText = cartBadge.getText();
        int cartCount = Integer.parseInt(cartCountText);

        //validasi isi keranjang
        Assert.assertEquals(cartCount,cartContent,"Cart is Match");
    }
}
