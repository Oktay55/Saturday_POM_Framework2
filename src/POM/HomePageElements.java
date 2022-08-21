package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    public HomePageElements(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div[data-productid='31']")
    public WebElement laptopSelectButton;

    @FindBy(id = "add-to-cart-button-31")
    public WebElement addToCart;

    @FindBy(xpath = "//span[text()='Shopping cart']")
    public WebElement shoppingCart;















}
