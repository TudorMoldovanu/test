package steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomeSteps {
    private HomePage homePage=new HomePage();

    public void printInfo(WebDriver driver){
        homePage.printTitle(driver);
        homePage.printNumberOfProducts(driver);
    }
}
