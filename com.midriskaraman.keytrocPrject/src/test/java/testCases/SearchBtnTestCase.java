package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.SearchBtnFunction;
import utils.BaseTest;


@Listeners({Listener.class})
public class SearchBtnTestCase extends BaseTest {


    @Test(priority = 2)
    public void SearchYap() throws InterruptedException {
        SearchBtnFunction searchBtnFunction = new SearchBtnFunction(driver);

        searchBtnFunction.Search();

    }

}
