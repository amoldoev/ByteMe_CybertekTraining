package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//form//input[@type= 'text']")
    public WebElement getUserNameTextField;

    @FindBy(xpath = "//form//input[@type = 'password']")
    public WebElement getPasswordTextField;

    @FindBy(xpath = "//form//button")
    public WebElement getLoginButton;
}