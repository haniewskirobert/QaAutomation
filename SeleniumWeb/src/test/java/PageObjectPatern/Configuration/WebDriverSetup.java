package PageObjectPatern.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class WebDriverSetup {
    public static WebDriver driver;
    public WebDriverSetup() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Opens browser, maximize it and go to app url.
     */
    public void openBrowser() {
        WebDriverFactory factory = new DefaultWebDriverFactory();
        driver = factory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://mytestdomain.it");
    }

    /**
     * Quit browser.
     */
    public void closeBrowser() {
        driver.quit();
    }
}

