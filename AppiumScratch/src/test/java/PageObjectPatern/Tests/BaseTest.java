package PageObjectPatern.Tests;

import PageObjectPatern.Configuration.AndroidDriverSetUp;
import PageObjectPatern.Configuration.AppiumServiceSetUp;
import PageObjectPatern.Pages.launchActivityPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    private static AppiumServiceSetUp appiumServiceSetUp = new AppiumServiceSetUp();
    protected launchActivityPage launchActivityPage;

    public BaseTest() {
        initPages();
    }

    @BeforeAll
    public static void startService() {
        appiumServiceSetUp.startService();
        AndroidDriverSetUp.setUpDriver();
        AndroidDriverSetUp.getDriver().resetApp();
    }

    @AfterAll
    public static void tearDown() {
        AndroidDriverSetUp.getDriver().closeApp();
        appiumServiceSetUp.tearDown();
    }

    private void initPages() {

        launchActivityPage = new launchActivityPage();

    }
}
