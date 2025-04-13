package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.ProjectSpecificationMethod;

public class BookedItineraryPage extends ProjectSpecificationMethod{
    private WebDriver driver;

    @FindBy(xpath = "//input[@value='Logout']")
    private WebElement logoutButton;

    public BookedItineraryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogout() {
        logoutButton.click();
    }
}
