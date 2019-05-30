package PageObjectPatern.Configuration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;


public class AndroidDriverSetUp extends AppiumServiceSetUp {

    private static AndroidDriver<AndroidElement> driver;

    public static void setUpDriver() {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../apps");
        File app = null;
        try {
            app = new File(appDir.getCanonicalPath(), "myTest.apk");
        } catch (IOException e) {
            e.printStackTrace();
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.MyTest.app.package");
        capabilities.setCapability("appActivity", "md50252f187319a073d52ae253169c089a4.SplashScreen");
        driver = new AndroidDriver<AndroidElement>(getServiceUrl(), capabilities);
    }

    public static AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }
}
