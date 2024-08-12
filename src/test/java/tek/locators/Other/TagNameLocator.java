package tek.locators.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocator {
    public static void main(String[] args) {

        //To find how many links are there in BBC page. (use find.elements)

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        By anchorsTagLocator = By.tagName("a");
        List<WebElement> anchorElements = driver.findElements(anchorsTagLocator);
        System.out.println(anchorElements.size());
        //Number of links in bbc page is 139
        driver.quit();


    }
}
