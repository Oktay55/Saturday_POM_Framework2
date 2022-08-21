package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageElements {

    public MyAccountPageElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "billing-address-select")
    public WebElement selectAddressDropDown;

    @FindBy(id = "CountryId")
    public WebElement countryDropDown;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement countryDropDown2;

    @FindBy(id = "StateProvinceId")
    public WebElement stateDropDown;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    public WebElement stateDropDown2;

    @FindBy(id = "ZipPostalCode")
    public WebElement zipcodeInput;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public WebElement zipcodeInput2;

    @FindBy(id = "termsofservice")
    public WebElement agreeButton;

    @FindBy(css = "button[name='checkout']")
    public WebElement checkoutButton;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement cityInput;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement addressInput;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneNumberInput;

    @FindBy(css = "input[onclick='Billing.save()']")
    public WebElement continueButton;

    @FindBy(css = "input[onclick='Shipping.save()']")
    public WebElement continueButton2;

    @FindBy(id = "shippingoption_1")
    public WebElement nextDayRadioButton;

    @FindBy(css = "input[onclick='ShippingMethod.save()']")
    public WebElement continueButton3;

    @FindBy(id = "paymentmethod_1")
    public WebElement checkPayRadioButton;

    @FindBy(css = "input[onclick='PaymentMethod.save()']")
    public WebElement continueButton4;

    @FindBy(css = "input[onclick='PaymentInfo.save()']")
    public WebElement continueButton5;

    @FindBy(css = "input[onclick='ConfirmOrder.save()']")
    public WebElement confirmOrderButton;

//    @FindBy(css = "div[class='title']")
//    public WebElement successMessage;  Your order has been successfully processed!

    @FindBy(css = "div.title>strong")
    public WebElement successMessage;













}
