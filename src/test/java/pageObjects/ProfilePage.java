package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage{

    private static final String PERSONAL_ACCOUNT_PAGE_NAME_LOC = "//div[@class='avatar-full-name']";
    private static final String EXPECTED_AVATAR_NAME = "Фомина Елена Сергеевна";

    public void waitUntilAvatarNameVisible() {
        WebDriverWait avatarNameFieldVisibleWait = new WebDriverWait(webDriver, 10, 300);
        WebElement avatarNameField = webDriver.findElement(By.xpath(PERSONAL_ACCOUNT_PAGE_NAME_LOC));
        avatarNameFieldVisibleWait.until(ExpectedConditions.visibilityOf(avatarNameField));
    }

    public String getTextFromAvatar() {
        WebElement avatarName = webDriver.findElement(By.xpath(PERSONAL_ACCOUNT_PAGE_NAME_LOC));
        return avatarName.getText().toLowerCase();
    }

    public String getExpectedAvatarName() {
        return EXPECTED_AVATAR_NAME.toLowerCase();
    }

}
