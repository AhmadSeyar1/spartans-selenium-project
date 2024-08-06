package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) {
        // Open Chrome Browser
        // And Navigate to Facebook.com
        // Push the activity to your repository

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
    }
}
