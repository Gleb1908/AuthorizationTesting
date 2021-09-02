package tests;

import framework.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static final String AUTHORIZATION_PAGE_URL = "https://lmslite47vr.demo.mirapolis.ru/mira";

    @BeforeEach
    public void setUp(){

        WebDriver webDriver = Browser.getInstance().getWebDriver();
        webDriver.get(AUTHORIZATION_PAGE_URL);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown(){
        Browser.getInstance().quit();
    }

}
