package Test;

import POM.LoginPageElements;
import POM.MyAccountPageElements;
import Utils.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInPageTest extends BaseDriver {
    LoginPageElements loginPageElements;
    MyAccountPageElements myAccountPageElements;

    @Test(priority = 1,dataProvider = "LogInData")
    public void loginPositiveTest(String userName, String password) {

        loginPageElements = new LoginPageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElements.logIn.click();
        loginPageElements.inputEmail.sendKeys(userName);
        loginPageElements.inputPassword.sendKeys(password);
        loginPageElements.loginButton.click();

        String actualWelcomeMessage = loginPageElements.welcomeMessage.getText();
        String expectedWelcomeMessage ="Welcome to our store";

        Assert.assertEquals(actualWelcomeMessage,expectedWelcomeMessage);


    }
    @Test(priority = 2,dataProvider = "LogInData2")
    public void loginNegativeTest2(String userName, String password) {

        loginPageElements = new LoginPageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElements.logIn.click();
        loginPageElements.inputEmail.sendKeys(userName);
        loginPageElements.inputPassword.sendKeys(password);
        loginPageElements.loginButton.click();

        String actualErrorMessage = loginPageElements.errorMessage.getText();
        String expectedErrorMessage ="Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

    }
    @Test(priority = 3,dataProvider = "LogInData3")
    public void loginNegativeTest3(String userName, String password) {

        loginPageElements = new LoginPageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElements.logIn.click();
        loginPageElements.inputEmail.sendKeys(userName);
        loginPageElements.inputPassword.sendKeys(password);
        loginPageElements.loginButton.click();

        String actualErrorMessage = loginPageElements.errorMessage.getText();
        String expectedErrorMessage ="Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }
    @Test(priority = 4,dataProvider = "LogInData4")
    public void loginNegativeTest4(String userName, String password) {

        loginPageElements = new LoginPageElements(driver);
        myAccountPageElements = new MyAccountPageElements(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPageElements.logIn.click();
        loginPageElements.inputEmail.sendKeys(userName);
        loginPageElements.inputPassword.sendKeys(password);
        loginPageElements.loginButton.click();

        String actualErrorMessage = loginPageElements.errorMessage.getText();
        String expectedErrorMessage ="Login was unsuccessful. Please correct the errors and try again.";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }

    @DataProvider(name = "LogInData") // Enter your correct email and correct password
    public Object [][] testDataProvider() {
        return new Object[][] {{"test1234@blahblah.com", "test12345"}};
    }
    @DataProvider(name = "LogInData2") // Enter your incorrect email and correct password
    public Object [][] testDataProvider2() {
        return new Object[][] { {"test128867@blahblah.com","test12345"} };
    }
    @DataProvider(name = "LogInData3") // Enter your correct email and incorrect password
    public Object [][] testDataProvider3() {
        return new Object[][] {{"test1234@blahblah.com", "toffee"}};
    }
    @DataProvider(name = "LogInData4") // Enter your incorrect email and incorrect password
    public Object [][] testDataProvider4() {
        return new Object[][]{{"test55@blahblah.com", "asdsad"}};
    }
}
