package AppleMacBookAir;

import org.openqa.selenium.By;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoView;

public class ProductChoosePage extends ProductView{

    private By requiredSpecField = By.xpath("//button[@data-autom='proceed-13inch-good']");

    public ProductSpecView clickSelect(){
        scrollIntoView(requiredSpecField);
        clickJS(requiredSpecField);
        return new ProductSpecView();
    }
}
