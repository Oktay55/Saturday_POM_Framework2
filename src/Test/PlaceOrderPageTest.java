package Test;

import POM.HomePageElements;
import POM.LoginPageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlaceOrderPageTest extends BaseDriver {

    HomePageElements homePageElements;
    LoginPageElements loginPageElements;
    MyAccountPageElements myAccountPageElements;

    @Test(priority = 1,dataProvider = "PlaceOrderData")
    public void placeOrderTest(String userName, String password) {

        loginPageElements = new LoginPageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);
        homePageElements = new HomePageElements(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        loginPageElements.logIn.click();
        loginPageElements.inputEmail.sendKeys(userName);
        loginPageElements.inputPassword.sendKeys(password);
        loginPageElements.loginButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");


        homePageElements.laptopSelectButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(homePageElements.laptopSelectButton));
        homePageElements.addToCart.click();
        homePageElements.shoppingCart.click();


        Select country = new Select(myAccountPageElements.countryDropDown);
        country.selectByVisibleText("United States");
        Select state = new Select(myAccountPageElements.stateDropDown);
        state.selectByVisibleText("Florida");

        myAccountPageElements.zipcodeInput.sendKeys("33573");
        myAccountPageElements.agreeButton.click();
        myAccountPageElements.checkoutButton.click();

        Select select = new Select(myAccountPageElements.selectAddressDropDown);
        select.selectByVisibleText("New Address");


        Select country2 = new Select(myAccountPageElements.countryDropDown2);
        country2.selectByVisibleText("United States");
        Select state2 = new Select(myAccountPageElements.stateDropDown2);
        state2.selectByVisibleText("Florida");
        myAccountPageElements.cityInput.sendKeys("Tampa");
        myAccountPageElements.addressInput.sendKeys("55 Ace Road");
        myAccountPageElements.zipcodeInput2.sendKeys("33573");
        myAccountPageElements.phoneNumberInput.sendKeys("(634)-445-0102");
        myAccountPageElements.continueButton.click();
        myAccountPageElements.continueButton2.click();

        myAccountPageElements.nextDayRadioButton.click();
        myAccountPageElements.continueButton3.click();


        myAccountPageElements.checkPayRadioButton.click();
        myAccountPageElements.continueButton4.click();


        myAccountPageElements.continueButton5.click();


        myAccountPageElements.confirmOrderButton.click();

        String actualMessage = myAccountPageElements.successMessage.getText();
        String expectedMessage = "Your order has been successfully processed!";

        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @DataProvider(name = "PlaceOrderData")
    public Object [][] testDataProvider() {
        return new Object[][]{{"cimbom@test.com", "test12345"}};
    }
}
