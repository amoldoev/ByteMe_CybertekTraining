package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class CommonForm {

    @FindBy(xpath = "//div//label[.='Firstname']/preceding-sibling::input")
    public WebElement getFirstNameTextField;

    @FindBy(xpath = "//div//label[.='Lastname']/preceding-sibling::input")
    public WebElement getLastNameTextField;

    @FindBy(xpath = "//div//label[.='Email']/preceding-sibling::input")
    public WebElement getEmailTextField;

    @FindBy(xpath = "//div//label[.='Joining Date']/following-sibling::i")
    public WebElement getJoiningDate;

    @FindBy(xpath = "//div//label[.='Password']/preceding-sibling::input")
    public WebElement getPasswordTextField;

    @FindBy(xpath = "//div//label[.='Confirm Password']/preceding-sibling::input")
    public WebElement getConfirmPasswordTextField;

    @FindBy(xpath = "//div//label[.='Subject']/preceding-sibling::input")
    public WebElement getSubjectTextField;

    @FindBy(xpath = "//div//label[.='Mobile number']/preceding-sibling::input")
    public WebElement getMobileNumberTextField;

    @FindBy(xpath = "//div//label[.='Gender']/preceding-sibling::select")
    public WebElement getGenderDropDownMenu;

    @FindBy(xpath = "//div//label[.='Birth Date']/preceding-sibling::input")
    public WebElement getBirthDate;

    @FindBy(xpath = "//div//label[.='Batch']/preceding-sibling::select")
    public WebElement getBatchDropDownMenu;

    @FindBy(xpath = "//div//label[.='Section']/preceding-sibling::input")
    public WebElement getSectionTextField;

    //This web-element operates with text-area
    @FindBy(xpath = "//div//label[.='Premanent Address']/preceding-sibling::textarea")
    public WebElement getPermanentAddressTextArea;




    @FindBy(xpath = "//button[.='Submit']")
    public WebElement getSubmitButton;

    @FindBy(css = ".profile-widget")
    public List<WebElement> listOfUsers;
}

