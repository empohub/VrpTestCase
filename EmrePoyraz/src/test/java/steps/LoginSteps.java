package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
    @Given("user is navigated to salesforce application")
    public void user_is_navigated_to_salesforce_application() throws InterruptedException {
        openBrowserAndLauchApplication();
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() throws InterruptedException {
        sendText(login.usernameBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordBox, ConfigReader.getPropertyValue("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginBtn);
    }



    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
       Assert.assertEquals(driver.getCurrentUrl(),"https://vrp46.lightning.force.com/lightning/page/home");


    }
}
