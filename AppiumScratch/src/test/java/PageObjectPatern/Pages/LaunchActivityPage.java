package PageObjectPatern.Pages;


import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class launchActivityPage extends BasePage {

    @AndroidFindBy(className = "android.widget.EditText")
    private AndroidElement verificationCode;
    @AndroidFindBy(id = "submitVerificationCodeBtn")
    private AndroidElement submitVerificationCodeBtn;


    public launchActivityPage() {
        super();
    }

    public AndroidElement getVerificationCode() {
        return verificationCode;
    }

    public AndroidElement getSubmitVerificationCodeBtn() {
        return submitVerificationCodeBtn;
    }
}
