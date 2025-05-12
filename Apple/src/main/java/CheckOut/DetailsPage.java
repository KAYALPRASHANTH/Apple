package CheckOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class DetailsPage extends ConfrimPage{

    //Here have To Give details like name address but my test complete here.

    private By getField = By.xpath("//h1[text()='Where should we send your order?']");

    public String  getValues(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(2));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(getField));
        return element.getText();
        //return find(getField).getText();
    }
}
