package CheckOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GuestLogIn extends CheckOutPage{

    private By guestLogfield = By.xpath("//button[@id='signIn.guestLogin.guestLogin']");

    public AddressPage clickGuestLog(){
        waitClick();
        return new AddressPage();
    }

    public void waitClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(2));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(guestLogfield));
        button.click();
    }
}
