import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesTest {
    WebDriver driver;

    @Test
    public void getElement(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        /*driver.findElement(By.linkText("Checkboxes")).click();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'JS Alert')]")).click();
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        System.out.println(tags.size());
         */



    }
}
