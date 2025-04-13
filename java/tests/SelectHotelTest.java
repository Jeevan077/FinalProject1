package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;

public class SelectHotelTest extends ProjectSpecificationMethod {

	@Test
	public void testSelectHotel () {
		
		LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("Jeevan05", "Jeevan@05");
        loginPage.clickLoginButton();

        SearchHotelPage searchHotelPage = new SearchHotelPage(driver);
        searchHotelPage.selectHotelDetails("London", "Hotel Sunshine", "Standard");
        searchHotelPage.clickSearchButton();
        
        SelectHotelPage selecthotelpage =new SelectHotelPage(driver);
        selecthotelpage.selectHotel();
        selecthotelpage.clickContinueButton();
        
        Assert.assertTrue(driver.getCurrentUrl().contains("BookAHotel"), "Should navigate to Select Book Hotel page.");
        

	}

}
