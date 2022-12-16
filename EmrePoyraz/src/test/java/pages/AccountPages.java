package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AccountPages extends CommonMethods {

    @FindBy(xpath = "//span[text()='Accounts'][1]")
    public WebElement Accountsbtn;

    @FindBy(xpath="//div[@title = 'New']")
    public WebElement Newbtn;

    @FindBy(xpath="//input[@role='combobox'][1]")
    public WebElement NameBox;

    @FindBy(xpath="//input[@type='tel'][1]")
    public WebElement PhoneBox;

    @FindBy(xpath="//button[@title= 'Save']")
    public WebElement Savebtn;

    @FindBy(xpath="//lightning-formatted-text[@data-output-element-id='output-field'][1]")
    public WebElement AccountNameBox;;



    public AccountPages(){
        PageFactory.initElements(driver, this);
    }


}
