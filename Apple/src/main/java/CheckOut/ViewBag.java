package CheckOut;

import AppleMacBookAir.ProductSpecView;
import org.openqa.selenium.By;

public class ViewBag extends ProductSpecView {

    private By viewField = By.xpath("//button[@class='button button-block button-super']");

    public CheckOutPage clickViewBag(){
        click(viewField);
        return new CheckOutPage();
    }
}
