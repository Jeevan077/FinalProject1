package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;


public class LoginTest extends ProjectSpecificationMethod {

    @Test
    public void testLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("Jeevan05", "Jeevan@05");
        loginPage.clickLoginButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("SearchHotel"), "Should navigate to Search Hotel page.");
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("Jeev", "J@12");
        loginPage.clickLoginButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("index"), "Should stay on login page.");
    }
}
