package CheckOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class AddressPage extends GuestLogIn{

    private By pincodeEnterField = By.xpath("//input[@id='checkout.fulfillment.deliveryTab.delivery.deliveryLocation.address.postalCode']");
    private By applyField = By.xpath("//button[@aria-label='Apply pin code']");
    private By checkBoxField = By.xpath("//input[@type='checkbox']");

    public ConfrimPage enterAddressPin(String text){
        waitClick();
        set(pincodeEnterField ,text);
        clickJS(checkBoxField);
        clickJS(applyField);
        return new ConfrimPage();
    }
    public void waitClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(2));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(pincodeEnterField));
        button.click();
    }
}
