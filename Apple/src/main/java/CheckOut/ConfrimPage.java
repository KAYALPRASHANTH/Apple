package CheckOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class ConfrimPage extends AddressPage{

    private By continueShopField = By.xpath("//button[@id='rs-checkout-continue-button-bottom']");

    public DetailsPage clcikcontinue(){

        waitClick();
        return new DetailsPage();
    }
    public void waitClick(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(continueShopField));
        scrollIntoView(continueShopField);
        clickJS(continueShopField);
    }
}
