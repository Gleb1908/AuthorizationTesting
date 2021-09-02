package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.AuthorizationPage;
import pageObjects.ProfilePage;

public class TestAuthorizationCheck extends BaseTest {

    @Test

    public void testAuthorizationCheck() {

        AuthorizationPage authorizationPage = new AuthorizationPage();

        authorizationPage.waitUntilLoginFieldVisible();
        authorizationPage.clickLoginField();
        authorizationPage.writeLogin();
        authorizationPage.waitUntilPasswordFieldVisible();
        authorizationPage.clickPasswordField();
        authorizationPage.writePassword();
        authorizationPage.clickLogInButton();

        ProfilePage profilePage = new ProfilePage();

        profilePage.waitUntilAvatarNameVisible();
        Assertions.assertTrue(profilePage.getTextFromAvatar().equalsIgnoreCase(profilePage.getExpectedAvatarName()));

    }

}
