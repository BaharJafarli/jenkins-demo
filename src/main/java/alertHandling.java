import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertHandling {
        WebDriver driver;

        @Test
        public void AlertMethod() throws InterruptedException {
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(By.linkText("JavaScript Alerts")).click();
            driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
            Alert alert = driver.switchTo().alert();
            Thread.sleep(5000);
            alert.accept();

        }
    }

