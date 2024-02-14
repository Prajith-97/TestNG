import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class parallelTests {


    WebDriver driver;


    @Test
    void verifyLogo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\JavaIntellij\\JarFiles\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.wait(1000);
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void verifyTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\JavaIntellij\\JarFiles\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
//        driver.wait(1000);
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title);
    }

//    @AfterMethod
//    void teardown(){
//        driver.close();
//    }
}
