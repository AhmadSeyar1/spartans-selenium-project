package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args) {

        // Open Browser Chrome browser
        ChromeDriver chromeDriver = new ChromeDriver();

        // Use this method to Maximize browser
        chromeDriver.manage().window().maximize();

        // Navigate to a URL
        chromeDriver.get("https://google.com");

        // Returns string of the application title.
        String title = chromeDriver.getTitle();
        System.out.println(title); // Will print Google

        //Close the browser entirely
        chromeDriver.quit();


    }
}
