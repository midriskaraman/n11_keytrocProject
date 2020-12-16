package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;


    public BasePage(WebDriver driver) {
        wait = new WebDriverWait(driver,30);
        this.driver =driver;
        PageFactory.initElements(driver,this);

    }
    public WebElement element(By Locator){
        actions = new Actions(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
    }



    public void sendKeys(By Locator,String value){
        element(Locator).sendKeys(value);

    }

}
