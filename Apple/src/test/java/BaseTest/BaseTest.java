package BaseTest;

import BasePage.BasePage;
import CheckOut.CheckOutPage;
import CheckOut.DetailsPage;
import HomePage.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static Utilities.Utility.setUtilityDriver;

public class BaseTest {

    public static WebDriver driver;
    public static BasePage basePage;
    public static HomePage homePage;
    public static CheckOutPage checkOutPage;
    public static DetailsPage detailsPage;
    @BeforeClass
    public void startup(){
        driver = new EdgeDriver(); // or ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void setup(){
        driver.get("https://www.apple.com/in");
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
        checkOutPage = new CheckOutPage();
        detailsPage = new DetailsPage();
    }
    //@AfterClass
    public void TearDown(){
        driver.quit();
    }
}
