package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import utils.CommonMethods;

public class CreateAccountSteps extends CommonMethods {

    @And("user clicks on Accounts button")
    public void userClicksOnAccountsButton() {
       //click(Account.Accountsbtn);
        driver.get("https://vrp46.lightning.force.com/lightning/o/Account/list?filterName=Recent");
    }

    @And("user clics on new button")
    public void userClicsOnNewButton() {
        click(Account.Newbtn);
    }

    @And("user enter {string},{string} details")
    public void userEnterDetails(String Name, String Phone) {
        sendText(Account.NameBox,Name);
        sendText(Account.PhoneBox,Phone);
    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        click(Account.Savebtn);
    }

    @Then("user verify your account has been created {string}")
    public void userVerifyYourAccountHasBeenCreated(String Name) {
        Assert.assertEquals(Account.AccountNameBox.getText(),Name);
    }



}
