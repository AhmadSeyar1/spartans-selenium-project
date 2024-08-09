package tek.locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        // In Retail app click on sign in then enter email and password then click on login

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.get("https://retail.tekschool-students.com/");

        By singInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(singInLocator);
        signInElement.click();

        By emailLocator = By.id("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("ahmad@gmail.com");

        By passwordLocator = By.id("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("abc123");


        By logInBtnLocator = By.id("loginBtn");
        WebElement logInBtnElement = driver.findElement(logInBtnLocator);
        logInBtnElement.click();
        Thread.sleep(2000);
        driver.quit();



    }
}
