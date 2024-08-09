package tek.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    /*
    In Retail app, click on sign in then click on Create new Account
    then fill up the form and sign up, Expectation is to Create new Account.
    Once account created make sure profile picture is displayed.(isDisplayed)
    And print result of isDisplayed method.
    Push to your repository.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.id("signinLink");
        WebElement singInElement = driver.findElement(signInLocator);
        singInElement.click();
        Thread.sleep(2000);

        By createAccLocator = By.id("newAccountBtn");
        WebElement createAccElement = driver.findElement(createAccLocator);
        createAccElement.click();
        Thread.sleep(2000);

        By nameInputLocator = By.id("nameInput");
        WebElement nameInputElement = driver.findElement(nameInputLocator);
        nameInputElement.sendKeys("Malikzada");
        Thread.sleep(2000);

        By emailInputLocator = By.id("emailInput");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys("ahmad.malikzada@tekschool.us");
        Thread.sleep(2000);

        By passwordInputLocator = By.id("passwordInput");
        WebElement passwordInputElement = driver.findElement(passwordInputLocator);
        passwordInputElement.sendKeys("Sohail123@");
        Thread.sleep(2000);

        By confirmPasswordInputLocator = By.id("confirmPasswordInput");
        WebElement ConfirmPasswordInputElement = driver.findElement(confirmPasswordInputLocator);
        ConfirmPasswordInputElement.sendKeys("Sohail123@");
        Thread.sleep(2000);

        By signUpLocator = By.id("signupBtn");
        WebElement singUpElement = driver.findElement(signUpLocator);
        singUpElement.click();
        Thread.sleep(2000);

        By profileImageLocator = By.id("profileImage");
        WebElement profileImageElement = driver.findElement(profileImageLocator);
        boolean IsImageDisplayed = profileImageElement.isDisplayed();
        System.out.println(IsImageDisplayed);
        Thread.sleep(1000);
        driver.quit();


    }
}
