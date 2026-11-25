import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class ChangeFile {
    WebDriver driver;

    @Test
    public void ChangeMethod(){
        driver = new ChromeDriver();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", "C:\\Downloads");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);

    }
}
