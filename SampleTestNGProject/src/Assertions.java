import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assertions {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String browser, String app) throws InterruptedException {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\JavaIntellij\\JarFiles\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(app);
            driver.wait(1000);
        }
    }

    @Test
    void verifyLogo(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void verifyTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title);
    }

    @AfterClass
    void teardown(){
        driver.close();
    }
}
