package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RemovePage {
    WebDriver driver;

    public RemovePage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By cartProduct = By. className("shopping_cart_badge");
    By removeFistProduct = By.id("remove-sauce-labs-backpack");
    By removeSecondProduct = By.id("remove-sauce-labs-bike-light");
    By removeThirdProduct = By.id("remove-sauce-labs-onesie");

    //actions
    //action remove
    public void removeProduct1(){
        driver.findElement(removeFistProduct).click();
    }

    public void removeProduct2(){
        driver.findElement(removeSecondProduct).click();
    }

    public void removeProduct3(){
        driver.findElement(removeThirdProduct).click();
    }

    public void cartIsEmpty(){
        //cek apakah elemen <span> yang menunjukkan jumlah item di keranjang ada
        boolean isCartEmpty = driver.findElements(cartProduct).size() == 0;

        //validasi bahwa keranjang kosong
        Assert.assertTrue(isCartEmpty, "Cart is empty");
    }
}
