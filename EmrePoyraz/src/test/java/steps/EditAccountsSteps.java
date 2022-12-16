package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.CommonMethods;

public class EditAccountsSteps extends CommonMethods {


    @And("user cliks on NameLabel")
    public void userCliksOnNameLabel() {
        click(Edit.EditNameLabel);
    }

    @And("user cliks on Name Pencil for edit name")
    public void userCliksOnNamePencilForEditName() {
        click(Edit.EditPencil);
    }

    @And("user send new Account Name {string}")
    public void userSendNewAccountName(String EditName) {
        sendText(Edit.AccountNameBox,EditName);
    }


    @And("user click Save Button")
    public void userClickSaveButton() {
        click(Edit.EditSaveBtn);
    }

    @Then("verify it was edit {string}")
    public void verifyItWasEdit(String EditName) {
        System.out.println("accualy name: "+ Edit.EditAccountNameBox.getText());
        System.out.println("expected name: "+ EditName);
        Assert.assertEquals(Edit.EditAccountNameBox.getText(),EditName);
    }
}
