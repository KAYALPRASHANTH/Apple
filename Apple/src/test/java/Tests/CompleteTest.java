package Tests;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompleteTest extends BaseTest {

    @Test
    public void test(){
        String SearchProduct = "Apple TV";
        String PinCode = "560096";
        var appleTV4K = homePage.clickSearch(SearchProduct);
        appleTV4K.clickProduct().clickBuy().clickAddToBag();
        var appleMacAir = homePage.clickMac().clickMacAir().clickBuy().clickSelect().clickadd();
        var checkOut = checkOutPage.clickViewBag().clickCheckOut().clickGuestLog().enterAddressPin(PinCode).clickCheckOut();
        String Actual = detailsPage.getValues();
        String Expected = "Where should we send your order?";
        Assert.assertEquals(Actual ,Expected, "Test doesn't end in Details Page");
    }
}
        