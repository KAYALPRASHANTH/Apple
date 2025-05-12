package AppleMacBookAir;

import org.openqa.selenium.By;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class ProductView extends MacPage{

    private By Buyfield = By.xpath("//a[@aria-label='Buy, MacBook Air'][@class='button button-reduced compare-button']");

    public ProductChoosePage clickBuy(){
        scrollIntoView(Buyfield);
        clickJS(Buyfield);
        return new ProductChoosePage();
    }
}
