import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoTask {
    WebDriver driver;

    @Test
    public void Alerts(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Assert.assertEquals("https://the-internet.herokuapp.com/", driver.getCurrentUrl());
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        Assert.assertEquals("https://the-internet.herokuapp.com/javascript_alerts", driver.getCurrentUrl());
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Welcome");
        prompt.accept();
        WebElement result = driver.findElement(By.id("result"));
        String text = result.getText();
        Assert.assertEquals("You entered: Hello", text);
        driver.quit();

    }

}
