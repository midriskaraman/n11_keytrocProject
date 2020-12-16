package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

import java.util.concurrent.TimeUnit;

public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Başarılı");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Başarısız");
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test Atladı");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String ExpectedTitle = "n11.com - Hayat Sana Gelir";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectedTitle);
        System.out.println("\n"+" n11 anasayfa açıldı ");
    }

    public void onFinish(ITestContext iTestContext) {
       // driver.quit();

    }
}
