package Tests;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

public class AppleMacTest extends BaseTest {
    @Test
    public void test2(){
        String PinCode = "560096";
        var appleMacAir = homePage.clickMac().clickMacAir().clickBuy().clickSelect().clickadd();
        var checkOut = checkOutPage.clickViewBag().clickCheckOut().clickGuestLog().enterAddressPin(PinCode);
        checkOut.clcikcontinue();
    }
}
