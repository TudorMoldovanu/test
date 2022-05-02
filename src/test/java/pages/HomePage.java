package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Utils;

import java.util.List;

public class HomePage {

    private By titleLocator=By.xpath("//span[@class='title']");
    private By listLocator=By.xpath("//div[@class='inventory_item']");

    public void printTitle(WebDriver driver){
        Utils.waitForElement(driver,titleLocator);
        WebElement title=driver.findElement(titleLocator);
        System.out.println(title.getText());
    }

    public void printNumberOfProducts(WebDriver driver){
        Utils.waitForElement(driver,listLocator);
        List<WebElement> products=driver.findElements(listLocator);
        System.out.println(products.size());
    }
}
