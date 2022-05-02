package steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage=new LoginPage();

    public void login(WebDriver driver, String username, String password){
        loginPage.typeUsername(driver,username);
        loginPage.typePassword(driver,password);
        loginPage.clickOnLoginButton(driver);
    }

}
