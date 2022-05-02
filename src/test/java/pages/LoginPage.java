package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

public class LoginPage {

    private By usernameFieldLocator= By.id("user-name");
    private By passwordFieldLocator=By.id("password");
    private By loginButtonLocator=By.xpath("//input[@value='Login']");

    public void typeUsername(WebDriver driver,String text){
        Utils.waitForElement(driver,usernameFieldLocator);
        WebElement usernameField=driver.findElement(usernameFieldLocator);
        usernameField.sendKeys(text);
    }


    public void typePassword(WebDriver driver,String text){
        Utils.waitForElement(driver,passwordFieldLocator);
        WebElement passwordField=driver.findElement(passwordFieldLocator);
        passwordField.sendKeys(text);
    }

    public void clickOnLoginButton(WebDriver driver){
        Utils.waitForElement(driver,loginButtonLocator);
        WebElement loginButton=driver.findElement(loginButtonLocator);
        loginButton.click();
    }
}
