package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllTeachersPage {

    public AllTeachersPage()
    {
        PageFactory.initElements(Driver.getDriver() , this);
    }


    @FindBy(xpath = "(//div[@class='form-group custom-mt-form-group'])[2]/input")
    public WebElement teacherNameTextField;

    @FindBy(xpath = "//a[@class='btn btn-success btn-block mt-4 mb-2']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='dropdown profile-action']")
    public WebElement options;

    @FindBy(xpath = "//a[@data-target='#delete_employee']")
    public WebElement delete;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement secondDelete;

}
