package steps;

import pages.AccountPages;
import pages.EditAccountsPages;
import pages.LoginPages;

public class PagesInitializers {
    public static LoginPages login;
    public static AccountPages Account;
    public static EditAccountsPages Edit;


    public static void initializePageObjects(){
        login = new LoginPages();
        Account= new AccountPages();
        Edit = new EditAccountsPages();

    }
}
