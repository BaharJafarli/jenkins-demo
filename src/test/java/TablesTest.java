import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesTest {
    WebDriver driver;

    @Test
    public void TablesMethod(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        List<WebElement> dues = driver.findElements(By.cssSelector("#table1 tbody tr td:nth-child(4)"));
        double sum = 0;
        for (WebElement due : dues) {
            String text = due.getText().replace("$", "");
            sum+= Double.parseDouble(text);
        }

        System.out.println(sum);
    }
}
