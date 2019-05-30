package PageObjectPatern.Pages;


import PageObjectPatern.Configuration.AndroidDriverSetUp;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends AndroidDriverSetUp {

    public BasePage() {

        PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverSetUp.getDriver()), this);
    }
}
