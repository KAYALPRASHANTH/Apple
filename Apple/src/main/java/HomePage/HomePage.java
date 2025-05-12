package HomePage;

import AppleMacBookAir.MacPage;
import AppleTV4K.SearchResultPage;
import BasePage.BasePage;
import org.openqa.selenium.By;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class HomePage extends BasePage {

    // Buying Apple TV 4K

    private By searchButton = By.xpath("//a[@id='globalnav-menubutton-link-search']");
    private By searchInputFeild = By.xpath("//input[@class='globalnav-searchfield-input']");

    public SearchResultPage clickSearch(String text){
        scrollIntoView(searchButton);
        clickJS(searchButton);
        scrollIntoView(searchInputFeild);
        clickJS(searchInputFeild);
        set(searchInputFeild , text);
        submit(searchInputFeild);
        return new SearchResultPage();
    }
    // Buying Apple MackBook Air M4

    private By macField = By.xpath("//a[@aria-label='Mac']");

    public MacPage clickMac(){
        click(macField);
        return new MacPage();
    }

}
