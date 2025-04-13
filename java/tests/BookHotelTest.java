package tests;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.BookHotelPage;
import pages.LoginPage;
import pages.SearchHotelPage;
import pages.SelectHotelPage;

public class BookHotelTest extends ProjectSpecificationMethod {

	@Test
	public void TestBookHotel() {
		
		LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("Jeevan05", "Jeevan@05");
        loginPage.clickLoginButton();

        SearchHotelPage searchHotelPage = new SearchHotelPage(driver);
        searchHotelPage.selectHotelDetails("London", "Hotel Sunshine", "Standard");
        searchHotelPage.clickSearchButton();
        
        SelectHotelPage selecthotelpage =new SelectHotelPage(driver);
        selecthotelpage.selectHotel();
        selecthotelpage.clickContinueButton();
        
        BookHotelPage Bookhotelpage = new BookHotelPage(driver);
        Bookhotelpage.enterBookingDetails("Jeevan", "R", "Middle Street London", "1234567812345678", "VISA");
        Bookhotelpage.selectExpirationDate("April", "2027");
        Bookhotelpage.entercvvnumber("055");
        Bookhotelpage.clickBookNowButton();

	}

}
