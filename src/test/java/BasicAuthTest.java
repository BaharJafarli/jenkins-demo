import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthTest {
    WebDriver driver;

    @Test
    public void BasicAuthTest(){
        driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
       String text = driver.findElement(By.cssSelector("div.example p")).getText();
        Assert.assertTrue(text.contains("Congratulations!"));
    }

}
