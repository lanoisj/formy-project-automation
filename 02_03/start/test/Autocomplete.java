import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/soolin/Downloads/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("268 Webster Ave, Syracuse, NY");
        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        driver.quit();
    }
}
