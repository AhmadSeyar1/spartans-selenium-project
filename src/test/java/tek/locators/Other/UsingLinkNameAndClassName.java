package tek.locators.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkNameAndClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        By singInLocator = By.linkText("Sign in");
        WebElement singInElement = driver.findElement(singInLocator);
        singInElement.click();
        Thread.sleep(2000);

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("wrongemail@gmail.com");
        Thread.sleep(2000);

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Abc123@");
        Thread.sleep(2000);

        By logInbtnLocator = By.id("loginBtn");
        WebElement logInBtnElement = driver.findElement(logInbtnLocator);
        logInBtnElement.click();
        Thread.sleep(2000);

        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);

        // getText() method will return the text of an element.
       String errorText =  errorElement.getText();
        System.out.println(errorText);
        driver.quit();


    }
}
