package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddStudentFrom extends CommonForm{

    @FindBy(xpath = "//label[.='Admission No']")
    public WebElement getAdmissionNumber;

    @FindBy(xpath = "//label[.='Major']")
    public WebElement getMajorField;

    @FindBy(xpath = "//label[.='Section']")
    public WebElement getSectionField;

    @FindBy(xpath = "//div//label[.='Company Name']/preceding-sibling::input")
    public WebElement getCompanyNameTextField;

    @FindBy(xpath = "//div//label[.='Title']/preceding-sibling::input")
    public WebElement getTitleTextField;

    @FindBy(xpath = "//div//label[.='Start Date']/preceding-sibling::input")
    public WebElement getStartDateTextField;

    @FindBy(xpath = "//div//label[.='City']/preceding-sibling::input")
    public WebElement getCityTextField;

    @FindBy(xpath = "//div//label[.='Street (123 N. California, Apt 1)']/preceding-sibling::input")
    public WebElement getStreetTextField;

    @FindBy(xpath = "//div//label[.='ZipCode']/preceding-sibling::input")
    public WebElement getZipCodeTextField;

    @FindBy(xpath = "//div//label[.='State']/preceding-sibling::input")
    public WebElement getStateTextField;



}

