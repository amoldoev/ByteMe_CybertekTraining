package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllStudentsPage {

    public AllStudentsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

}
