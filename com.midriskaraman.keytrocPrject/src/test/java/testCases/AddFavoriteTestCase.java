package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.AddFavoriteFunction;
import utils.BaseTest;


@Listeners({Listener.class})
public class AddFavoriteTestCase extends BaseTest {


    @Test(priority = 4)
    public void addFavoriteTest() throws InterruptedException {
        AddFavoriteFunction addFavoriteFunction = new AddFavoriteFunction(driver);
        addFavoriteFunction.favoriteFunction();
    }
}
