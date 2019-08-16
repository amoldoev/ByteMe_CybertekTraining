package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddTeacherForm extends CommonForm {

    public AddTeacherForm()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div//label[.='Department']/preceding-sibling::select")
    public WebElement getDepartmentDropDownMenu;

    @FindBy(xpath = "//div//label[.='Salary']/preceding-sibling::input")
    public WebElement getSalaryTextField;

}

