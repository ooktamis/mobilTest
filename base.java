import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class base {
    public static AndroidDriver driver;
    public static DesiredCapabilities dc;

    public static void urlBase(String baseUrl) throws MalformedURLException {
        URL url = new URL(baseUrl);
        starting(url);
    }

    public static void starting(URL url) {
        dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android"); // Android Emulator

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");

        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");


        driver = new AndroidDriver(url, dc);
    }

    public static void calculator(String sayi1, String sayi2) throws InterruptedException {

        Thread.sleep(5000);

        driver.findElementById("com.android.calculator2:id/digit_"+sayi1).click();

        WebElement plus = driver.findElementById("com.android.calculator2:id/op_add");
        plus.click();
        WebElement three = driver.findElementById("com.android.calculator2:id/digit_"+sayi2);
        three.click();
        WebElement equalTo = driver.findElementById("com.android.calculator2:id/eq");
        equalTo.click();
        WebElement results = driver.findElementById("com.android.calculator2:id/result");

        System.out.println("==="+results.getText()+"===");

    }


}