import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {
    WebDriver driver;

    @Test
    public void FileMethod(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\b.jafarli\\Downloads\\textfile.txt");
        driver.findElement(By.id("file-submit")).click();

    }
}
