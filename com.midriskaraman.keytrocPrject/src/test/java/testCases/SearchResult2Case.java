package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunctions.SearchResult2Function;
import utils.BaseTest;

@Listeners({Listener.class})
public class SearchResult2Case extends BaseTest {

    @Test(priority = 3)
    public void SearchResultTwoPage() throws InterruptedException {
        SearchResult2Function searchResult2Function = new SearchResult2Function(driver);
        searchResult2Function.SearchResult2Page();
    }

}
