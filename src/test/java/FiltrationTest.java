import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrationTest extends TestBase{


    @Test
    public void validateapartmentFilteration(){
        var filterByPage =
        homePage.clickDiscoverBtn()
                .clickTypeOfBuilding()
                .clickTypeOfBuilding()
                .enterPrice("5000000","10000000");

   /*     var projectListPage = filterByPage.searchForProjectsOrUnits2("The Brooks New Cairo");

         Assert.assertTrue(projectListPage.checkBuildingType("Apartment" , "Standalone Villa"));*/

        //  Assert.assertFalse(projectListPage.checkPriceOfBuilding("5000000", "40000000"));

    }

}
