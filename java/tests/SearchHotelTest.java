package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;
import pages.SearchHotelPage;

public class SearchHotelTest extends ProjectSpecificationMethod {

    @Test
    public void testSearchHotel() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("Jeevan05", "Jeevan@05");
        loginPage.clickLoginButton();

        SearchHotelPage searchHotelPage = new SearchHotelPage(driver);
        searchHotelPage.selectHotelDetails("London", "Hotel Sunshine", "Standard");
        searchHotelPage.clickSearchButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("SelectHotel"), "Should navigate to Select Hotel page.");
    }
}
