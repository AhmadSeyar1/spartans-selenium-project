package tek.locators.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {

        // In google.com search for TekSchool and click on first link that have TekSchool.
        // Hint. to click on first link you can use partialLinkText locator strategy.

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("APjFqb")).sendKeys("TekSchool");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("TEK SCHOOL Modern")).click();
        Thread.sleep(2000);
    }
}
