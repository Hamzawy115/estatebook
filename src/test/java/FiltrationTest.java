import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DiscoverPage;
import pages.HomePage;

public class FiltrationTest extends TestBase {
    @Test(priority = 1)
    public void testOfTypeFilter() {
        var filterByType = homePage.clickDiscoverBtn()
                .clickTypeExpend()
                .pickApartment()
                .pickDuplex()
                .clickApplyTypeButton();
        Assert.assertTrue(filterByType.checkBuildingType("Apartment", "Duplex"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 2)
    public void testOfTypeFilter1() {
        var filterByType = homePage.clickDiscoverBtn()
                .clickTypeExpend()
                .pickServicedApartment()
                .pickTriplex()
                .clickApplyTypeButton();
        Assert.assertTrue(filterByType.checkBuildingType("Apartment", "Duplex"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 3)
    public void testOfTypeFilter2() {
        var filterByType = homePage.clickDiscoverBtn()
                .clickTypeExpend()
                .pickServicedApartment()
                .pickTriplex()
                .clickApplyTypeButton();
        Assert.assertTrue(filterByType.checkBuildingType("Serviced Apartment", "Triplex"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 4)
    public void testOfPriceFilter() {
        var filterByPrice = homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .enterMinAndMaxPrice("5000000", "20000000")
                .clickApplyPriceButton();
        Assert.assertTrue(filterByPrice.checkPriceOfBuilding("5000000", "20000000"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 5)
    public void testOfSortPriceFromLowToHigh() {
        var filterByPriceAndSort = homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .enterMinAndMaxPrice("5000000", "20000000")
                .clickApplyPriceButton()
                .clickSortButton()
                .pickPriceLowToHigh();
        Assert.assertTrue(filterByPriceAndSort.checkSearchResultsOfSortPriceLowToHigh(DiscoverPage.priceOfBuildingText, 5000000, 20000000));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 6)
    public void testOfSortPriceFromHighToLow() {
        var filterByPriceAndSort = homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .enterMinAndMaxPrice("5000000", "20000000")
                .clickApplyPriceButton()
                .clickSortButton()
                .pickPriceHighToLow();
        Assert.assertTrue(filterByPriceAndSort.checkSearchResultsOfSortPriceHighToLow(DiscoverPage.priceOfBuildingText, 5000000, 20000000));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 7)

    public void testOfSortDownPaymentFromHighToLow() {
        var filterByPriceAndSort = homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .enterMinAndMaxPrice("5000000", "20000000")
                .clickApplyPriceButton()
                .clickSortButton()
                .pickPriceHighToLow();
        Assert.assertTrue(filterByPriceAndSort.checkSearchResultsOfSortPriceHighToLow(DiscoverPage.priceOfBuildingText, 5000000, 20000000));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 8)

    public void testOfDownPayment() {
        var filterDownPayment = homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .clickDownPayment()
                .enterMinAndMaxDownPayment("100000", "300000")
                .clickApplyPriceButton();
        Assert.assertTrue(filterDownPayment.checkSearchResultsInt(DiscoverPage.getDownPaymenText, 100000, 300000));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 9)
    public void testOfSortDownpaymentFromLowToHigh() {
        var filterByDownPaymentAndSort = homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .clickDownPayment()
                .enterMinAndMaxDownPayment("100000", "300000")
                .clickApplyPriceButton()
                .clickSortButton()
                .pickDownPaymentLowToHigh();
        Assert.assertTrue(filterByDownPaymentAndSort.checkSearchResultsOfSortPriceLowToHigh(DiscoverPage.getDownPaymenText, 100000, 300000));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 10)
    public void testOfSortDownpaymentFromHighToLow() {
        var filterByDownPaymentAndSort = homePage.clickDiscoverBtn()
                .clickPriceExpend()
                .clickDownPayment()
                .enterMinAndMaxDownPayment("100000", "300000")
                .clickApplyPriceButton()
                .clickSortButton()
                .pickDownPaymentHighToLow();
        Assert.assertTrue(filterByDownPaymentAndSort.checkSearchResultsOfSortPriceHighToLow(DiscoverPage.getDownPaymenText, 100000, 300000));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test(priority = 11)
    public void logIn(){
        homePage.clickLoginBtn().enterEmail().enterPassword().clickSubmitBtn();
    }
    /*@Test(priority = 3)
    public void testOfAreaFilter() {
        var filterByPrice = homePage.clickDiscoverBtn()
                .clickAreaExpend()
                .fillMinAreaField("100")
                .fillMaxAreaField("500")
                .clickApplyAreaButton();
        //Assert.assertTrue(filterByPrice.checkAreaOfBuilding("100", "500"));
    }*/
}