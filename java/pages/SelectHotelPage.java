package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.ProjectSpecificationMethod;

public class SelectHotelPage extends ProjectSpecificationMethod{
    private WebDriver driver;

    @FindBy(id = "radiobutton_0")
    private WebElement selectHotelRadioButton;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public SelectHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectHotel() {
        selectHotelRadioButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
