package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.HomeSteps;
import steps.LoginSteps;

public class Test {

    WebDriver driver;
    private LoginSteps loginSteps=new LoginSteps();
    private HomeSteps homeSteps=new HomeSteps();


    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @org.junit.jupiter.api.Test
    public void test(){
        loginSteps.login(driver,"standard_user","secret_sauce");
        homeSteps.printInfo(driver);
    }

    @AfterEach
    public void cleanup(){
        driver.quit();
    }
}
