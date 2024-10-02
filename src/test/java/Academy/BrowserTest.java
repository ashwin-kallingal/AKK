package Academy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue; // Ensure this import is present

public class BrowserTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Hello Guys");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\Academy\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void getData() {
        System.out.println("Starting the test...");
        driver.get("https://ashwinkallingalqa.azurewebsites.net/webapp/"); // Ensure the URL starts with https://
        String text = driver.findElement(By.cssSelector("h1")).getText();
        System.out.println("Text found: " + text);
        assertTrue("Text does not match!", text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Use quit() instead of close() for better cleanup
        }
    }
}
