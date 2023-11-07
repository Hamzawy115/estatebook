package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static utils.CustomMethods.*;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // --------------------- filter by type HomePage---------------------

    private final By typeOfBuildingBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[3]/div/div/div/div/div[1]/button/span");
    private final By apartmentBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/label");
    private final By duplexBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/label");
    private final By triplexBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[2]/label");
    private final By servicedApartment = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/label");
    private final By restBtnType = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/button[1]");
    private final By applyTypeBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[3]/div/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/button[2]");
    private final By priceBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div/button/span");
    private final By minPriceField = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div/div/button/input");
    private final By maxPriceField = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div/button/input");
    private final By restBtnPrice = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div[2]/div/div[2]/button[1]");
    private final By applyPriceBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[4]/div/div/div/div/div[2]/div/div[2]/button[2]");
    private final By searchIconBtn = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[5]/button[2]/svg/path");
    private final By searchBar = By.xpath("/html/body/main/section[1]/div[1]/div/div[2]/div[2]/div/div/input");
   /* private final By chaletBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][3]");
    private final By familyHouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][4]");
    private final By quattroBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][5]");
    private final By loftBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][6]");
    private final By cabinBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][8]");
    private final By studioBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][9]");
    private final By penthouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][11]");
    private final By townHouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][12]");
    private final By twinHouseBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][13]");
    private final By standAlonVillaBtn = By.xpath("//div[contains(@class,'tabs_')][1]//div[contains(@class,'rounded-lg')][14]");
     private final By searchBar = By.xpath("//div[1]//div/div[2]/div/input");
*/

    // --------------------- filter buttons in discover page ---------------------

    private final By typeOfBuildingBtnDiscover = By.xpath("/html/body/main/div/div[1]/div[2]/div/div/div/div/button/svg[2]/path");
    private final By apartmentBtnDiscover = By.xpath("/html/body/main/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[7]/label");
    private final By duplexBtnDiscover = By.xpath("/html/body/main/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[10]/label");
    private final By triplexBtnDiscover = By.xpath("/html/body/main/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[2]/label");
    private final By servicedApartmentDiscover = By.xpath("/html/body/main/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/ul/li[1]/label");
    private final By restBtnTypeDiscover = By.xpath("/html/body/main/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/button[1]");
    private final By getApplyTypeBtnDiscover = By.xpath("/html/body/main/div/div[1]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/button[2]");
    private final By areaBtn = By.xpath("/html/body/main/div/div[1]/div[3]/div/div/div/button");
    private final By areaFromField = By.xpath("/html/body/main/div/div[1]/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/input");
    private final By areaToField = By.xpath("/html/body/main/div/div[1]/div[3]/div/div/div[2]/div/div[1]/div[2]/div[2]/input");
    private final By areaApplyBtn = By.xpath("/html/body/main/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div/button[2]");
    private final By areaRestBtn = By.xpath("/html/body/main/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div/button[1]");
    private final By searchIconBtnDiscover = By.xpath("/html/body/main/div/div[1]/div[6]/button[2]/svg");
    private final By discoverBtn = By.xpath("/html/body/header/div/div[1]/nav/a[1]/span");
    private final By cardTypeApartment1 = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[1]/a/div[1]/div[3]/div/div/p");
    private final By cardTypeApartment2 = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[2]/a/div[1]/div[3]/div[1]/div/p");
    private final By cardTypeApartment3 = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[3]/a/div[1]/div[3]/div/div/p");
    private final By cardTypeDuplex1 = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[1]/a/div[1]/div[3]/div/div/p");
    private final By cardTypeDuplex2 = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[2]/a/div[1]/div[3]/div/div/p");
    private final By cardTypeDuplex3 = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[3]/a/div[1]/div[3]/div/div/p");
    private final By cardTypeTriplex = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div/a/div[1]/div[3]/div/div/p");

    // --------------------- Type Filtration ---------------------
    //--------------------- new actions in discover page ---------------------

    public HomePage clickDiscoverBtn() {

        findElementPresence(driver, discoverBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }

    public HomePage searchBtnHomePage() {
        findElementPresence(driver, searchIconBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public HomePage searchBtnDiscover() {
        findElementPresence(driver, searchIconBtnDiscover).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public HomePage clickTypeOfBuilding() {
        findElementPresence(driver, typeOfBuildingBtn).click();
        findElementPresence(driver, apartmentBtn).click();
        findElementPresence(driver, applyTypeBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }

    public HomePage clickTypeOfBuildingDiscoverPage() {
        findElementPresence(driver, typeOfBuildingBtnDiscover).click();
        findElementPresence(driver, apartmentBtnDiscover).click();
        findElementPresence(driver, getApplyTypeBtnDiscover).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }

    public HomePage enterPrice(String minPrice, String maxPrice) {
        findElementPresence(driver, priceBtn).sendKeys(minPrice);
        findElementPresence(driver, minPriceField).sendKeys(minPrice);
        findElementPresence(driver, maxPriceField).sendKeys(maxPrice);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public HomePage clickPriceBtn() {
        findElementPresence(driver, applyPriceBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;

    }

    public HomePage enterArea(String minArea, String maxArea) {
        findElementPresence(driver, areaBtn).click();
        findElementPresence(driver, areaFromField).sendKeys(minArea);
        findElementPresence(driver, areaToField).sendKeys(maxArea);

        return this;
    }

    public HomePage clickAreaApplyBtn() {
        findElementPresence(driver, areaApplyBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;

    }


    public projectListPage searchForProjectsOrUnits(String projectOrUnit) {
        findElementPresence(driver, searchBar).sendKeys(projectOrUnit, Keys.ENTER);
        findElementPresence(driver, searchIconBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new projectListPage(driver);
    }


}
