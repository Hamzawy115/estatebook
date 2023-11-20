package pages;

import org.openqa.selenium.*;

import java.util.List;

import static utils.CustomMethods.findDuplicationIndex;
import static utils.CustomMethods.findElementPresence;

public class DiscoverPage {


    private WebDriver driver;

    public DiscoverPage(WebDriver driver) {
        this.driver = driver;
    }


    // --------------------- new locators in discover page ---------------------
    // --------------------- locators of type filter ---------------------

    private final By typeExpandBtn = By.xpath("//button[contains(@class,'rounded-md p-4')]");

    //private final By filterTypeOption = By.xpath("//li[contains(@class,'text-xs')][contains(@role,'none')]");
    private final By applyFilterTypeBtn = By.xpath("//button[contains(@class,'500 bg-p')]");


    // --------------------- locators of area filter ---------------------

    private final By areaExpandBtn = By.xpath("//button[contains(@class,'rounded-md p-4')]");

    private final By minAndMaxAreaFields = By.xpath("//input[contains(@class,'w-full border-none')]");

    private final By applyAreaBtn = By.xpath("/html/body/main/div/div[1]/div[3]/div/div/div[2]/div/div[2]/div/button[2]");


    // --------------------- locators of beds & baths filter ---------------------

    private final By bedsAndBathsExpendBtn = By.xpath("//button[contains(@class,'rounded-md p-4')]");

    private final By applyBedsAndBathsBtn = By.xpath("//button[contains(@class,'rounded-lg bg-emerald-500')]");


    // --------------------- locators of price filter ---------------------

    private final By priceExpandBtn = By.xpath("//button[contains(@class,'rounded-md p-4')]");

    private final By minAndMaxPriceFields = By.xpath("//input[contains(@class,'pointer-events-auto')]");

    private final By applyPriceBtn = By.xpath("//button[contains(@class,'500 bg-primary')]");

    // --------------------- locators of type & price filters ---------------------

    private final By typeOfBuildingText = By.xpath("//p[contains(@class, 'text-primary-green')]");
    //private final By priceOfBuildingText = By.xpath("//h2[contains(@class, 'line-clamp-1 space-x-1 text-lg font-bold')]");
    private final By priceOfBuildingText = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[1]/a/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/p");

    private final By areaLocate = By.xpath("/html/body/main/div/div[4]/div[1]/div/div[3]/div[1]/a/div[2]/div/div[2]/div[2]/div/div/div[3]/p/span[1]");

    // --------------------- loop on all discover list ---------------------
    public boolean checkSearchResults(By elementName, String firstInput, String secondInput) {
        boolean buildingText = false;
        List<WebElement> reterndList = driver.findElements(elementName);
        for (int i = 0; i < reterndList.size(); i++) {
            String webElementType = reterndList.get(i).getText();
            if (webElementType.equalsIgnoreCase(firstInput)
                    || webElementType.equalsIgnoreCase(secondInput)) {

                buildingText = true;
            } else {
                buildingText = false;
                break;
            }

        }
        System.out.println("No. of returned unites : " + reterndList.size());
        return buildingText;
    }

    public boolean checkSearchResultsSingle(By elementName, String firstInput) {
        boolean buildingText = false;
        List<WebElement> reterndList = driver.findElements(elementName);
        for (int i = 0; i < reterndList.size(); i++) {
            String webElementType = reterndList.get(i).getText();
            if (webElementType.equalsIgnoreCase(firstInput)
            ) {

                buildingText = true;
            } else {
                buildingText = false;
                break;
            }

        }
        System.out.println("No. of returned unites : " + reterndList.size());
        return buildingText;
    }


    public boolean checkSearchResultsInt1(By elementName, int firstInput, int secondInput) {
        boolean buildingText = false;
        List<WebElement> reterndList = driver.findElements(elementName);
        for (int i = 0; i < reterndList.size(); i++) {
            int webElementType = Integer.parseInt(reterndList.get(i).getText());
            if (webElementType >= firstInput && webElementType <= secondInput) {
                buildingText = true;
            } else {
                buildingText = false;
                break;
            }

        }
        return buildingText;
    }

    public boolean checkSearchResultsInt(By elementName, int firstInput, int secondInput) {
        boolean buildingText = false;
        List<WebElement> returnedList = driver.findElements(elementName);

        for (WebElement webElement : returnedList) {
            String webElementText = webElement.getText();

            String numericString = webElementText.replaceAll("[^\\d]", "");

            try {
                int webElementType = Integer.parseInt(numericString);

                if (webElementType >= firstInput && webElementType <= secondInput) {
                    buildingText = true;
                } else {
                    buildingText = false;
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error parsing integer: " + e.getMessage());
                buildingText = false;
                break;
            }
        }

        return buildingText;
    }



  /*  public boolean checkSearchResultsInt1(By elementName, int firstInput, int secondInput) {
        boolean buildingText = false;
        List<WebElement> returnedList = driver.findElements(elementName);

        for (int i = 0; i < returnedList.size(); i++) {
            // Get the text from the web element
            String webElementText = returnedList.get(i).getText();

            // Remove non-numeric characters from the text
            String numericString = webElementText.replaceAll("[^\\d]", "");

            try {
                // Convert the cleaned string to an integer
                int webElementType = Integer.parseInt(numericString);

                // Check the condition
                if (webElementType >= firstInput && webElementType <= secondInput) {
                    buildingText = true;
                } else {
                    buildingText = false;
                    break;
                }
            } catch (NumberFormatException e) {
                // Handle the exception if parsing fails
                System.err.println("Error parsing integer: " + e.getMessage());
                buildingText = false;
                break;
            }
        }

        return buildingText;
    }*/

    public boolean checkBuildingType(String buildingType1, String buildingType2) {
        return checkSearchResults(typeOfBuildingText, buildingType1, buildingType2);
    }

    public boolean checkBuildingTypeSingle(String buildingType1) {
        return checkSearchResultsSingle(typeOfBuildingText, buildingType1);
    }

    public boolean checkPriceOfBuilding(String fromPrice, String toPrice) {

        return checkSearchResultsInt(priceOfBuildingText, Integer.parseInt(fromPrice), Integer.parseInt(toPrice));

    }

    public boolean checkAreaOfBuilding(String fromArea, String toArea) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return checkSearchResultsInt1(areaLocate, Integer.parseInt(fromArea), Integer.parseInt(toArea));

    }


    // --------------------- Actions of type filter ---------------------

    public DiscoverPage clickTypeExpend() {
        findDuplicationIndex(driver, typeExpandBtn, 0).click();
        return this;
    }


    public DiscoverPage pickServicedApartment() {
        pickFilterTypeOption(1).click();
        return this;
    }

    public DiscoverPage pickTriplex() {
        pickFilterTypeOption(2).click();
        return this;
    }

    public DiscoverPage pickLoft() {
        pickFilterTypeOption(6).click();
        return this;
    }

    public DiscoverPage pickApartment() {
        pickFilterTypeOption(7).click();
        return this;
    }

    public DiscoverPage pickCabin() {
        pickFilterTypeOption(8).click();
        return this;
    }


    public DiscoverPage pickStudio() {
        pickFilterTypeOption(9).click();
        return this;
    }

    public DiscoverPage pickDuplex() {
        pickFilterTypeOption(10).click();
        return this;
    }

    public DiscoverPage pickPenthouse() {
        pickFilterTypeOption(11).click();
        return this;
    }

    public DiscoverPage pickTwinHouse() {
        pickFilterTypeOption(13).click();
        return this;
    }


    public DiscoverPage clickApplyTypeButton() {
        findElementPresence(driver, applyFilterTypeBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    private WebElement pickFilterTypeOption(int filterTypeIndex) {
        return findElementPresence(driver, By.xpath("//li[contains(@class,'text-xs')][contains(@role,'none')]" + "[" + filterTypeIndex + "]"));
    }


    // --------------------- Actions of area filter ---------------------


    public DiscoverPage clickAreaExpend() {
        findDuplicationIndex(driver, areaExpandBtn, 1).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return this;
    }


    public DiscoverPage fillMinAreaField(String minArea) {
//        findElement(minAndMaxAreaFields,0).sendKeys(Keys.chord(Keys.CONTROL,Keys.chord("a",Keys.chord(Keys.BACK_SPACE,"200"))));
//        findElement(minAndMaxAreaFields,0).sendKeys("200");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value = '" + minArea + "';", findDuplicationIndex(driver, minAndMaxAreaFields, 0));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }


    public DiscoverPage fillMaxAreaField(String maxArea) {
//        findElement(minAndMaxAreaFields,1).sendKeys(Keys.chord(Keys.CONTROL,Keys.chord("a",Keys.BACK_SPACE)));
//        findElement(minAndMaxAreaFields,1).sendKeys("500");


        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value = '" + maxArea + "';", findDuplicationIndex(driver, minAndMaxAreaFields, 1));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }


    public DiscoverPage enterMinAndMaxArea(String minArea, String maxArea) {
        // findDuplicationIndex(driver, minAndMaxAreaFields, 0).clear();
        findDuplicationIndex(driver, minAndMaxAreaFields, 0).sendKeys(minArea);
        // findDuplicationIndex(driver, minAndMaxAreaFields, 1).clear();
        findDuplicationIndex(driver, minAndMaxAreaFields, 1).sendKeys(maxArea);
        return this;

    }

    public DiscoverPage clickApplyAreaButton() {
        findElementPresence(driver, applyAreaBtn).click();
        return this;

    }


    // --------------------- Actions of beds & baths filter ---------------------

    public DiscoverPage clickBedsAndBathsExpend() {
        findDuplicationIndex(driver, bedsAndBathsExpendBtn, 2).click();
        return this;
    }

    public DiscoverPage pick2BedAnd1Bath() {
        pickFilterBedsAndBathsOption(3).click();
        pickFilterBedsAndBathsOption(8).click();
        return this;
    }

    public DiscoverPage clickApplyRoomsButton() {
        findElementPresence(driver, applyBedsAndBathsBtn).click();
        return this;
    }


    private WebElement pickFilterBedsAndBathsOption(int filterRoomsIndex) {
        return findElementPresence(driver, By.xpath("//div[contains(@class,'inline-flex items-center gap-2')]" + "[" + filterRoomsIndex + "]"));
    }

    // --------------------- Actions of price filter ---------------------

    public DiscoverPage clickPriceExpend() {
        findDuplicationIndex(driver, priceExpandBtn, 3).click();
        return this;
    }

    public DiscoverPage enterMinAndMaxPrice(String minPrice, String maxPrice) {
        findDuplicationIndex(driver, minAndMaxPriceFields, 0).sendKeys(minPrice, Keys.ENTER);
        findDuplicationIndex(driver, minAndMaxPriceFields, 1).sendKeys(maxPrice, Keys.ENTER);
        return this;
    }


    public DiscoverPage clickApplyPriceButton() {
        findElementPresence(driver, applyPriceBtn).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }


}
