package PageObjectPatern.Valdators;

import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SiteValidators {

    public void validateVisibility(WebElement we) {
        assertTrue(we.isDisplayed());
    }

    public void validatePresentText(WebElement we, String textToValidate) {
        assertEquals(textToValidate, we.getText());
    }
}
