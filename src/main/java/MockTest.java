import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectionKey;

public class MockTest {
    WebDriver driver;

    @Test
    public void MockMethod(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
        WebElement input = driver.findElement(By.cssSelector("#input-example input"));
        input.sendKeys("Hello");
        String value = input.getAttribute("value");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        select.selectByIndex(1);
        select.selectByValue("1");
        select.getFirstSelectedOption().getText();
        driver.navigate().refresh();
    }
}
