package testCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BasePage;

import java.util.List;


public class SearchResult2Function extends BasePage {

    private By searchResultTags =By.cssSelector("#p-373142209");
    private By productTree = By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/section/div[2]/ul/li[3]");
    private By resultTagList = By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div[5]/a");

    public SearchResult2Function(WebDriver driver) {
        super(driver);
    }

    public void SearchResult2Page() throws InterruptedException {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element(searchResultTags));
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(resultTagList);
        boolean check = false;
        for (WebElement elem :elements) {
            if (elem.getText().equals("2")) {
                check = true;
                wait.until(ExpectedConditions.elementToBeClickable(elem));
                elem.click();
                break;
            }
        }
        assert check;
        Thread.sleep(5000);


        js.executeScript("arguments[0].scrollIntoView();",element(productTree));



    }
}
