package PageObjectPatern.Utilities;

import PageObjectPatern.Configuration.WebDriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilites {
    
    public void simpleWait() {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void waitToElemetVisibility(WebElement webElement) {

        WebDriverWait wait = new WebDriverWait(WebDriverSetup.driver, 20);
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }


}
