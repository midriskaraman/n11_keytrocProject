package testCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchBtnFunction extends BasePage {

    private By productSearchForm= By.id("searchData");
    public String searchText ="samsung";
    private By searchBtn = By.cssSelector(".searchBtn");


    public SearchBtnFunction(WebDriver driver) {
        super(driver);
    }

    public void Search() throws InterruptedException {
        Thread.sleep(5000);

        sendKeys(productSearchForm,searchText);
        element(searchBtn).click();


    }
}
