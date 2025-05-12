package AppleMacBookAir;

import CheckOut.ViewBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class ProductSpecView extends ProductChoosePage {

    private By specChangeField = By.xpath("//input[@class='form-selector-input'][@id='hard_drivesolid_state_drive_aos_phantom_z1h7_065_ch60_2']");
    private By addToCart = By.xpath("//form//button[@class='button button-block']");

    public ViewBag clickadd() {
        scrollIntoView(specChangeField);
        clickJS(specChangeField);
        click();
        return new ViewBag();
    }
    public void click(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        clickJS(addToCart);
    }
}
