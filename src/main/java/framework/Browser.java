package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    private static Browser browser;
    private WebDriver webDriver;

    private Browser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");

        webDriver = new ChromeDriver(chromeOptions);
    }

    public static Browser getInstance() {
        if (browser == null) {
            browser = new Browser();
        }
        return browser;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void quit() {
        Browser.getInstance().getWebDriver().quit();
        browser = null;
    }
}