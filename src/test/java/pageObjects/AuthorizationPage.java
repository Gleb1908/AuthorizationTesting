package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizationPage extends BasePage {
    private static final String LOGIN_FIELD_LOC = "//td//input[@type='text']";
    private static final String PASSWORD_FIELD_LOC = "//td//input[@type='password']";
    private static final String LOG_IN_BUTTON_LOC =  "//button[@id='button_submit_login_form']";
    private static final String LOGIN = "fominaelena";
    private static final String PASSWORD = "z0K6CTQR";

    public void clickLoginField() {
        WebDriverWait loginFieldWait = new WebDriverWait(webDriver, 10, 300);
        WebElement loginField = webDriver.findElement(By.xpath(LOGIN_FIELD_LOC));
        loginFieldWait.until(ExpectedConditions.visibilityOf(loginField));
        loginField.click();
    }

    public void clickPasswordField() {
        WebDriverWait passwordFieldWait = new WebDriverWait(webDriver, 10, 300);
        WebElement passwordField = webDriver.findElement(By.xpath(PASSWORD_FIELD_LOC));
        passwordFieldWait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.click();
    }

    public void clickLogInButton() {
        WebDriverWait logInButtonWait = new WebDriverWait(webDriver, 10, 300);
        WebElement logInButton = webDriver.findElement(By.xpath(LOG_IN_BUTTON_LOC));
        logInButtonWait.until(ExpectedConditions.visibilityOf(logInButton));
        logInButton.click();
    }

    public void waitUntilLoginFieldVisible() {
        WebDriverWait loginFieldVisibleWait = new WebDriverWait(webDriver, 10, 300);
        WebElement loginField = webDriver.findElement(By.xpath(LOGIN_FIELD_LOC));
        loginFieldVisibleWait.until(ExpectedConditions.visibilityOf(loginField));
    }

    public void waitUntilPasswordFieldVisible() {
        WebDriverWait passwordFieldVisibleWait = new WebDriverWait(webDriver, 10, 300);
        WebElement passwordField = webDriver.findElement(By.xpath(PASSWORD_FIELD_LOC));
        passwordFieldVisibleWait.until(ExpectedConditions.visibilityOf(passwordField));
    }

    public void writeLogin() {
        WebElement loginField = webDriver.findElement(By.xpath(LOGIN_FIELD_LOC));
        loginField.findElement(By.xpath(LOGIN_FIELD_LOC)).sendKeys(LOGIN);
    }

    public void writePassword() {
        WebElement passwordField = webDriver.findElement(By.xpath(PASSWORD_FIELD_LOC));
        passwordField.findElement(By.xpath(PASSWORD_FIELD_LOC)).sendKeys(PASSWORD);
    }

}
