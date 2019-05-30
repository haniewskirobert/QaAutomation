package PageObjectPatern.Actions;

import PageObjectPatern.Configuration.WebDriverSetup;
import PageObjectPatern.Utilities.WaitUtilites;
import org.openqa.selenium.WebElement;

public class SiteActions extends WebDriverSetup {

    private WaitUtilites waitUtilites = new WaitUtilites();

    public void performClick(WebElement webElementToClick) {
        try {
            waitUtilites.WaitToElemetVisibility(webElementToClick);
            if (webElementToClick.isEnabled()) {
                webElementToClick.click();
            } else {
                throw new Exception("Element is not clickable");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    public void clearAndSendText (WebElement fieldToFill, String textToFill) {
        fieldToFill.clear();
        fieldToFill.sendKeys(textToFill);
    }
}
