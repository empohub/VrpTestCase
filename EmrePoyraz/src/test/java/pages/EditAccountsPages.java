package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EditAccountsPages extends CommonMethods {
    @FindBy(xpath="//a[@data-refid='recordId'][1]")
    public WebElement EditNameLabel;

    @FindBy(xpath="//lightning-formatted-text[@data-output-element-id='output-field'][1]")
    public WebElement EditAccountNameBox;


    @FindBy(xpath = "//button[@title='Edit Account Name']")
    public WebElement EditPencil;

    @FindBy(xpath = "//label[text()='Account Name']/following-sibling::div/input")
    public WebElement AccountNameBox;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement EditSaveBtn;

    public EditAccountsPages(){
        PageFactory.initElements(driver, this);
    }
}
