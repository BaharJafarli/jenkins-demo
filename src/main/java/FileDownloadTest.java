import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileDownloadTest {
    WebDriver driver;

    @Test
    public void FileMethod(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("File Download")).click();
        driver.findElement(By.linkText("textfile.txt")).click();

    }

}
