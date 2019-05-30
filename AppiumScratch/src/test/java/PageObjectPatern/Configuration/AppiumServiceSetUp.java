package PageObjectPatern.Configuration;

import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.URL;

public class AppiumServiceSetUp {

    private static AppiumDriverLocalService service;

    public static URL getServiceUrl() {
        return service.getUrl();
    }

    public void startService() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    public void tearDown() {
        service.stop();
    }

}

