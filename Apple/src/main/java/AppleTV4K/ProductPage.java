package AppleTV4K;

import org.openqa.selenium.By;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class ProductPage extends SearchResultPage{

    private By Buyfield = By.xpath("//a[@class='button button-super']");

    public ProductSpecPage clickBuy(){
        scrollIntoView(Buyfield);
        clickJS(Buyfield);
        return new ProductSpecPage();
    }
}
