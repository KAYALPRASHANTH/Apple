package AppleMacBookAir;

import HomePage.HomePage;
import org.openqa.selenium.By;

import static Utilities.JSUtility.clickJS;

public class MacPage extends HomePage {

    private By macAirField = By.xpath("//span[@class='chapternav-label'][text()='MacBook Air']");

    public ProductView clickMacAir(){
        clickJS(macAirField);
        return new ProductView();
    }
}
