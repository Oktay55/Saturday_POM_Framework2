package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {
    public LoginPageElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="a[class='ico-login']")
    public WebElement logIn;

    @FindBy(id ="Email")
    public WebElement inputEmail;

    @FindBy(id="Password")
    public WebElement inputPassword;

    @FindBy(css="input[value='Log in']")
    public WebElement loginButton;

    @FindBy(css="h2[class='topic-html-content-header']")
    public WebElement welcomeMessage;

    @FindBy(xpath ="//span[text()='Login was unsuccessful. Please correct the errors and try again.']")
    public WebElement errorMessage;








}
