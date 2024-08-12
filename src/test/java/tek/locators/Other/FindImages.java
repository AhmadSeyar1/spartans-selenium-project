package tek.locators.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindImages {
    public static void main(String[] args) {
        //Find out how many images are there in bbc home page

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        By imageTag = By.tagName("img");
        List<WebElement> imagesElements = driver.findElements(imageTag);
        System.out.println(imagesElements.size());
        driver.quit();
        // there are 72 images in bbc home page
    }
}
