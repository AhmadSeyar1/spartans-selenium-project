package tek.locators.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    /*
    In Retail app go to create new account
    and create new account.
    use name, id, linkText or anything that is available.
    15 minutes
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By signInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        // Do it in one line of code
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("name")).sendKeys("Ahmad");
        driver.findElement(By.name("email")).sendKeys("ahmad12@gmail.com");
        driver.findElement(By.id("passwordInput")).sendKeys("Ahmad12$");
        driver.findElement(By.id("confirmPasswordInput")).sendKeys("Ahmad12$");
        driver.findElement(By.id("signupBtn")).click();
        Thread.sleep(2000);
        String errorText = driver.findElement(By.className("error")).getText();
        System.out.println(errorText);
        driver.quit();

    }
}
