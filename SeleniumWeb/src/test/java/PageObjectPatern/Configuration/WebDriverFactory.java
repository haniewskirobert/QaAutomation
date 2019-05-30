package PageObjectPatern.Configuration;

import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {

    /**
     * Gets driver created by this factory.
     *
     * @return created driver
     */
    public abstract WebDriver getDriver();

}
