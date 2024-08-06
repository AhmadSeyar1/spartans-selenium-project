package tek.intro;

import com.sun.tools.javac.Main;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    // Navigate to "https://dev.insurance.tekschool-students.com/"
    // Maximize windows
    // Print Title
    // Close Browser
    // Push changes to repository

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
