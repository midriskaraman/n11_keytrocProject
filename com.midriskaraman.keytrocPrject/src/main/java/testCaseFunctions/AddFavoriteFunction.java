package testCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BasePage;

public class AddFavoriteFunction extends BasePage {

    private By addfavoriteBtn = By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/section/div[2]/ul/li[3]/div/div[1]/span");
    private By accountMenu = By.className("myAccountHolder customMenuItem hasMenu withLocalization");
    private By favoriteList = By.linkText("Favorilerim / Listelerim");
    private By listItemTitle = By.linkText("Favorilerim (1)");
    private By deleteFav = By.className("deleteProFromFavorites");
    private By favDeleted = By.linkText("Ürününüz listeden silindi.");

    public AddFavoriteFunction(WebDriver driver) {
        super(driver);
    }


    public void favoriteFunction() throws InterruptedException {
        Thread.sleep(5000);
        element(addfavoriteBtn).click();
        actions.moveToElement(element(accountMenu));
        wait.until(ExpectedConditions.elementToBeClickable(element(favoriteList)));
        element(favoriteList).click();

        boolean check =false;
        WebElement favoriteProductCheck = element(listItemTitle);
        if (favoriteProductCheck.getText().equals("Favorilerim (1)")){
            check = true;
            System.out.println("ürün favorilere eklendi");
            wait.until(ExpectedConditions.elementToBeClickable(favoriteProductCheck));
            favoriteProductCheck.click();

        }
        assert check;
        element(deleteFav).click();
        driver.switchTo().alert().getText();
        String favoriteProductDeleted = element(favDeleted).getText();
        System.out.println("ürün favorilerden kaldırıldı"+ favoriteProductDeleted);
        driver.switchTo().alert().accept();



    }
}
