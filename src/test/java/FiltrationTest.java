import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DiscoverPage;

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
            Thread.sleep(8000);
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
        Assert.assertTrue(filterByPriceAndSort.checkSearchResultsOfSort(DiscoverPage.priceOfBuildingText, 5000000, 20000000));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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