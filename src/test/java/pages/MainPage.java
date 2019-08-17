package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

    public MainPage() {

            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//div[@id = 'sidebar']//ul/li[3]/a")
        public static WebElement getTeachersLink;

        @FindBy(linkText = "All Teachers")
        public static WebElement getAllTeachers;

        @FindBy(linkText = "Add Teacher")
        public static WebElement getAddTeacherLink;

        @FindBy(xpath = "//div[@id = 'sidebar']//ul/li[4]/a")
        public static WebElement getStudentsLink;

        @FindBy(linkText = "All Students")
        public static WebElement getAllStudents;

        @FindBy(linkText = "Add Student")
        public static WebElement getAddStudentLink;

        @FindBy(xpath = "//a//span[.='Admin']")
        public WebElement getCurrentPageUsername;
    }