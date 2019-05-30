package PageObjectPatern.Tests;

import PageObjectPatern.Actions.SiteActions;
import PageObjectPatern.Configuration.WebDriverSetup;
import PageObjectPatern.Pages.SitePage;
import PageObjectPatern.Utilities.WaitUtilites;
import PageObjectPatern.Valdators.SiteValidators;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SiteTest {

    private static WebDriverSetup webDriverSetup = new WebDriverSetup();
    private SitePage sitePage;
    private SiteActions siteAction;
    private SiteValidators siteValidatorls;
    private WaitUtilites waitUtilites;

    public SiteTest() {
        sitePage = new SitePage();
        siteAction = new SiteActions();
        siteValidatorls = new SiteValidators();
        waitUtilites = new WaitUtilites();
    }

    @BeforeAll()
    public static void beforeAll() {
        webDriverSetup.openBrowser();
    }

    @AfterAll
    static void cleanUp(){
        webDriverSetup.closeBrowser();
    }

    @Test
    public void firstSiteTest() {

        siteValidatorls.validatePresentText(sitePage.getLoginButton(), "LOGIN");
        siteAction.performClick(sitePage.getLoginButton());
    }

    @Test
    public void logCorrect(){
       // SitePage sitePage = new SitePage(); /** usunięte bo wyżej jest **/
        siteAction.clearAndSendText(sitePage.userTextbox(),"TestAccount");
        siteAction.clearAndSendText(sitePage.passwordTextbox(),"TestPassword");
        siteAction.performClick(sitePage.getLoginButton());
        waitUtilites.WaitToElemetVisibility(sitePage.navigationBar());
        siteValidatorls.validateVisibility(sitePage.navigationBar());
    }

    @Test
    public void logEmpty()  {
        siteAction.clearAndSendText(sitePage.userTextbox(),"");
        siteAction.clearAndSendText(sitePage.passwordTextbox(),"");
        siteAction.performClick(sitePage.getLoginButton());
        waitUtilites.WaitToElemetVisibility(sitePage.getFieldFill());
        siteValidatorls.validateVisibility(sitePage.getFieldFill());
    }


}
