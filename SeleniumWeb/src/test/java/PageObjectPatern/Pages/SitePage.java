package PageObjectPatern.Pages;

import PageObjectPatern.Configuration.WebDriverSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SitePage extends WebDriverSetup {

    private static final String LOGIN_BUTTON_XPATH = "//button[contains(@class, 'md-login')]";
    private static final String USER_TEXTBOX = "//input[@name='User']";
    private static final String PASSWORD_TEXTBOX = "//input[@type='password']";
    private static final String NAVBAR_XPATH = "//md-card[@ui-sref='auth.projects']";
    private static final String TOAST_ERROR_XPATH = "//div[contains(@class, 'toast-error')]";
    private static final String FIELD_XPATH = "//p[contains(@class, 'validation-invalid')]";
    private static final String MENU_BTN = "//sidebar-button[contains(@class, ng-isolate-scope)]";
    private static final String LOGOUT_BTN = "//a[contains(@id ,'logout')]";

    @FindBy(xpath = LOGIN_BUTTON_XPATH)
    private WebElement loginButton;

    @FindBy (xpath = USER_TEXTBOX)
    private WebElement userTextbox;

    @FindBy (xpath = PASSWORD_TEXTBOX)
    private  WebElement passwordTextbox;


    @FindBy (xpath = NAVBAR_XPATH)
    private WebElement navigationBar;

    @FindBy (xpath = TOAST_ERROR_XPATH)
    private WebElement toastError;

    @FindBy (xpath = FIELD_XPATH)
    private WebElement fieldFill;

    @FindBy (xpath = MENU_BTN)
    private WebElement menuBtn;

    @FindBy (xpath = LOGOUT_BTN)
    private WebElement logoutBtn;

       public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement userTextbox() {
        return userTextbox;
    }

    public WebElement passwordTextbox() {
        return passwordTextbox;
    }

    public WebElement navigationBar() {
        return navigationBar;
    }

    public WebElement getToast() {
           return toastError;
    }

    public WebElement getFieldFill(){
           return fieldFill;
    }

    public WebElement getMenuBtn(){
           return menuBtn;
    }

    public WebElement getLogoutBtn(){
           return logoutBtn;
    }


}
