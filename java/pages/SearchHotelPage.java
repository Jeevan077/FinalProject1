package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.ProjectSpecificationMethod;

public class SearchHotelPage extends ProjectSpecificationMethod {
    private WebDriver driver;

    @FindBy(id = "location")
    private WebElement locationDropdown;

    @FindBy(id = "hotels")
    private WebElement hotelsDropdown;

    @FindBy(id = "room_type")
    private WebElement roomTypeDropdown;

    @FindBy(xpath="//input[@id='Submit']")
    private WebElement searchButton;

    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectHotelDetails(String location, String hotel, String roomType) {
        locationDropdown.sendKeys(location);
        hotelsDropdown.sendKeys(hotel);
        roomTypeDropdown.sendKeys(roomType);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}

