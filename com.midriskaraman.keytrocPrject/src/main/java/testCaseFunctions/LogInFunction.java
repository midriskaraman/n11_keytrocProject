package testCaseFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BasePage;


public class LogInFunction extends BasePage {

    private By cokkies = By.cssSelector("span.btn.btnBlack");
    private By btnSignIn = By.className("btnSignIn");
    private By email =By.cssSelector("#email");
    private By password =By.cssSelector("#password");
    private By loginButton = By.id("loginButton");
    public String userMail="seleniumtestdeneme@selenium.com";
    public String userPassword ="123asd321dsa";


    public LogInFunction(WebDriver driver) {
        super(driver);
    }

    public  void login() throws InterruptedException {
       element(cokkies).click();
       element(btnSignIn).click();
       sendKeys(email,userMail);
       Thread.sleep(5000);
       sendKeys(password,userPassword);
       Thread.sleep(5000);
       wait.until(ExpectedConditions.elementToBeClickable(element(loginButton)));
       element(loginButton).click();


    }

}
