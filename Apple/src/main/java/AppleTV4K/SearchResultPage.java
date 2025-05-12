package AppleTV4K;

import HomePage.HomePage;
import org.openqa.selenium.By;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class SearchResultPage extends HomePage {

    private By productField = By.xpath("//a[@class='rf-serp-productname-link'][text()='Apple TV 4K']");

    public ProductPage clickProduct(){
        scrollIntoView(productField);
        clickJS(productField);
        return  new ProductPage();
    }

}
