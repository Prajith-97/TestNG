import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class mobile {


    @Test
    public void openPcloudy() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("pCloudy_Username", "itsupport@g10x.com");
        capabilities.setCapability("pCloudy_ApiKey", "tprqb2mvkp4bhj4z2nmpwndr");
        capabilities.setCapability("pCloudy_DurationInMinutes", 10);
        capabilities.setCapability("newCommandTimeout", 600);
        capabilities.setCapability("launchTimeout", 90000);
        capabilities.setCapability("pCloudy_DeviceFullName", "SAMSUNG_GalaxyS10_Android_9.0.0_01e83");
        capabilities.setCapability("platformVersion", "9.0.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setBrowserName("Chrome");
        capabilities.setCapability("pCloudy_WildNet", "false");
        capabilities.setCapability("pCloudy_EnableVideo", "false");
        capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
        capabilities.setCapability("pCloudy_EnableDeviceLogs", "false");
        AndroidDriver driver = new AndroidDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
//    WebDriver driver = new AndroidDriver("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
//    AndroidDriver driver = new AndroidDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub", capabilities));

//    public mobile() throws MalformedURLException {
//    }

    }
}
