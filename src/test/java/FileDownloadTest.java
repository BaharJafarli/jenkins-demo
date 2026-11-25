import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertTrue;

public class FileDownloadTest {
    WebDriver driver;
    Path downloadDir;

    @BeforeMethod
    public void setUp() throws IOException {
        downloadDir = Files.createTempDirectory("downloads");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadDir.toAbsolutePath().toString());

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
    }

    @Test
    public void fileMethod() throws IOException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("File Download")).click();
        driver.findElement(By.linkText("textfile.txt")).click();

        Path file = downloadDir.resolve("textfile.txt");
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(d -> Files.exists(file));

        assertTrue(Files.exists(file), "Файл не скачался");
        assertTrue(Files.size(file) > 0, "Файл пустой");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}