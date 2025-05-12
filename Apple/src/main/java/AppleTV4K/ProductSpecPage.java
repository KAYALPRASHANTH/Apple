package AppleTV4K;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class ProductSpecPage extends  ProductPage{

    private By requiredSpecField = By.xpath("//input[@name='dimensionConnection'][@value='wifitv64gb']");
    private By scrollField= By.xpath("//button[@class='button button-block']");
    private By addToBag = By.xpath("//form//button[@class='button button-block']");
    public void clickAddToBag(){
        scrollIntoView(requiredSpecField);
        clickJS(requiredSpecField);
        scrollIntoView(scrollField);
        waitClick();
    }
    public void waitClick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToBag));
        clickJS(addToBag);
    }
}
