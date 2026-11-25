import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {
    WebDriver driver;

    @Test
    public void BasicTest(){
     driver = new ChromeDriver();
     driver.get("https://admin:admin@the-internet.herokuapp.com/");
     driver.findElement(By.linkText("Basic Auth")).click();
    }

}
