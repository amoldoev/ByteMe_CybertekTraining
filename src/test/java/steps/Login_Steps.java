package steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MainPage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Login_Steps {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @When("User is on CybertekTraining Website")
    public void user_is_on_CybertekTraining_Website() {
        //User navigates to the login page
        Driver.getDriver().get(Config.getProperty("cybertekTrainingUrl"));
    }

    @When("User enters correct login credentials")
    public void user_enters_correct_login_credentials() {

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //User enters both username and passwords and hits submit button
        loginPage.getUserNameTextField.sendKeys(Config.getProperty("username"));
        loginPage.getPasswordTextField.sendKeys(Config.getProperty("password"));
        loginPage.getLoginButton.click();
    }

    @When("User is displayed as the current user of the CybertekTraining Website")
    public void user_is_displayed_as_the_current_user_of_the_CybertekTraining_Website() {

        Assert.assertTrue(mainPage.getCurrentPageUsername.getText().equals("Admin"));
    }
}