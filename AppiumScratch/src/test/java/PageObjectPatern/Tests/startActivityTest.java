package PageObjectPatern.Tests;

import PageObjectPatern.Configuration.AndroidDriverSetUp;
import org.junit.jupiter.api.Test;

public class startActivityTest extends BaseTest {

    @Test
    public void testFindElementsByAccessibilityId() {

        launchActivityPage.getVerificationCode();
        launchActivityPage.getVerificationCode().sendKeys("test123");
        AndroidDriverSetUp.getDriver().hideKeyboard();
        launchActivityPage.getSubmitVerificationCodeBtn().click();
    }

}
