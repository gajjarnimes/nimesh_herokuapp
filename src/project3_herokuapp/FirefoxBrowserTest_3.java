package project3_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest_3 {
    public static void main(String[] args) {
        String basaUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Open URL
        driver.get(basaUrl);

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);

        // Print the current Url
        System.out.println("current url:"+driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source:"+driver.getPageSource());


        //Enter the username to username field element
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("jind@gmail.com");

        // Enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("shahil980");
        // close the browser
        driver.quit();

    }
}
