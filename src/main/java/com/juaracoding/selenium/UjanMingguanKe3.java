package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UjanMingguanKe3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/");
        System.out.println("get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");
        System.out.println("Delay 3 second");
        WebElement dismissLink = driver.findElement(By.className("woocommerce-store-notice__dismiss-link"));
        dismissLink.click();
        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
        myAccountLink.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)", new Object[0]);
        driver.findElement(By.name("username")).sendKeys(new CharSequence[]{"anggitpangestu84"});
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"sahra11@Aa"});
        driver.findElement(By.cssSelector(".woocommerce-form-row:nth-child(2) .show-password-input")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.cssSelector(".custom-logo:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".post-1491 h3 > a")).click();
        driver.findElement(By.id("pa_color")).click();
        WebElement dropdown = driver.findElement(By.id("pa_color"));
        dropdown.findElement(By.xpath("//option[. = 'Grey']")).click();
        driver.findElement(By.id("pa_size")).click();
        dropdown = driver.findElement(By.id("pa_size"));
        dropdown.findElement(By.xpath("//option[. = '42']")).click();
        driver.findElement(By.cssSelector(".icon_plus")).click();
        driver.findElement(By.cssSelector(".single_add_to_cart_button")).click();
        driver.findElement(By.linkText("View cart")).click();
    }
}