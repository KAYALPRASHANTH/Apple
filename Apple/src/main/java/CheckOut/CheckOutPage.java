package CheckOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class CheckOutPage extends ViewBag{

    private By checkoutField = By.xpath("//button[@id='shoppingCart.actions.checkout']");

    public GuestLogIn clickCheckOut(){
        waitClick();
        return new GuestLogIn();
    }
    public void waitClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(2));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(checkoutField));
        scrollIntoView(checkoutField);
        clickJS(checkoutField);
    }
}
