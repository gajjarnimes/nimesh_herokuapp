import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest_3 {
    public static void main(String[] args) {
        String basaUrl="http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.msedge.driver","driver/msedgedriver.exe");
        //create object
        WebDriver driver = new EdgeDriver();

        // Open URL
        driver.get(basaUrl);

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);

        //print the current URL
        System.out.println("current url"+driver.getCurrentUrl());

        //print the page source
        System.out.println("Page source"+driver.getPageSource());

         //Enter the username to username field element
                WebElement usernameField = driver.findElement(By.id("username"));
               usernameField.sendKeys("gopal@gmail.com");

                // Enter the password to password field element
               WebElement passwordField = driver.findElement(By.name("password"));
               passwordField.sendKeys("shital980");

               //close the browser
              driver.quit();
    }
}
