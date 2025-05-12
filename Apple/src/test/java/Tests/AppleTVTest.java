package Tests;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class AppleTVTest extends BaseTest {

    @Test
    public void test1(){
        String SearchProduct = "Apple TV";
        String PinCode = "560096";
        var appleTV4K = homePage.clickSearch(SearchProduct);
        appleTV4K.clickProduct().clickBuy().clickAddToBag();
        var checkOut = checkOutPage.clickViewBag().clickCheckOut().clickGuestLog().enterAddressPin(PinCode);
        checkOut.clcikcontinue();
    }
}
