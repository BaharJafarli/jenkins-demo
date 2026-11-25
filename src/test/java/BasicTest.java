import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BasicTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void basicAuthTest() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();

        assertTrue(driver.getCurrentUrl().contains("basic_auth"),
                "URL должен содержать basic_auth");
        assertEquals(driver.findElement(By.tagName("h3")).getText(), "Basic Auth");
        assertTrue(driver.findElement(By.cssSelector("div.example p")).getText()
                        .contains("Congratulations"),
                "Нет сообщения об успешной авторизации");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}