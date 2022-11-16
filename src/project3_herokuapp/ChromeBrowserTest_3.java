package project3_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest_3 {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        // create object
        WebDriver driver = new ChromeDriver();
        //Luanch the URL
        driver.get(baseUrl);
        //print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :"+ title);
        // Print current url
        System.out.println("current url"+driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source"+driver.getPageSource());
        //Enter the username to username field element
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("test@gmail.com");
        // Enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("copy999");
        // close browser
        driver.quit();

    }
}
