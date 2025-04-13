package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import base.ProjectSpecificationMethod;

public class BookHotelPage extends ProjectSpecificationMethod {
    private WebDriver driver;

    @FindBy(id = "first_name")
    private WebElement firstNameField;

    @FindBy(id = "last_name")
    private WebElement lastNameField;

    @FindBy(id = "address")
    private WebElement addressField;

    @FindBy(id = "cc_num")
    private WebElement creditCardField;
    
    @FindBy(id = "cc_type")
    private WebElement creditcardtype;

    @FindBy(id = "cc_exp_month")
    private WebElement expMonthDropdown;

    @FindBy(id = "cc_exp_year")
    private WebElement expYearDropdown;

    @FindBy(id = "cc_cvv")
    private WebElement cvvNumber;
    
    @FindBy(id = "book_now")
    private WebElement bookNowButton;

    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterBookingDetails(String firstName, String lastName, String address, String creditCard, String cardtype) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        addressField.sendKeys(address);
        creditCardField.sendKeys(creditCard);
        creditcardtype.sendKeys(cardtype);
    }

    public void selectExpirationDate(String expMonth, String expYear) {
        expMonthDropdown.sendKeys(expMonth);
        expYearDropdown.sendKeys(expYear);
    }
    
    public void entercvvnumber(String cvvnum) {
    	cvvNumber.sendKeys(cvvnum);
    }

    public void clickBookNowButton() {
        bookNowButton.click();
    }
}
