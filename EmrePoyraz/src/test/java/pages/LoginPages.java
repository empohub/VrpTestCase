package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPages extends CommonMethods {

    @FindBy(id="username")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(id="Login")
    public WebElement loginBtn;


    public LoginPages(){
        PageFactory.initElements(driver, this);
    }
}
