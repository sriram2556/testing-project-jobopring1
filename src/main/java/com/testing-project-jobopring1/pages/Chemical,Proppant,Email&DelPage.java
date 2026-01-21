package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class ChemicalProppantEmailDelPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "mainMenu")
    private WebElement mainMenu;
    @FindBy(id = "jobsSection")
    private WebElement jobsSection;
    @FindBy(id = "currentJob")
    private WebElement currentJob;
    @FindBy(id = "wellDropdown")
    private WebElement wellDropdown;
    @FindBy(id = "stageDropdown")
    private WebElement stageDropdown;
    @FindBy(id = "chemicalSetupButton")
    private WebElement chemicalSetupButton;
    @FindBy(id = "chemicalSetupScreen")
    private WebElement chemicalSetupScreen;
    @FindBy(id = "proppantSetupButton")
    private WebElement proppantSetupButton;
    @FindBy(id = "proppantSetupScreen")
    private WebElement proppantSetupScreen;
    @FindBy(id = "emailSetupButton")
    private WebElement emailSetupButton;
    @FindBy(id = "emailSetupScreen")
    private WebElement emailSetupScreen;
    @FindBy(id = "chemicalDropdown")
    private WebElement chemicalDropdown;
    @FindBy(id = "designConcentrationInput")
    private WebElement designConcentrationInput;
    @FindBy(id = "designedVolumeInput")
    private WebElement designedVolumeInput;
    @FindBy(id = "addChemicalButton")
    private WebElement addChemicalButton;
    @FindBy(id = "lastEntryButton")
    private WebElement lastEntryButton;
    @FindBy(id = "validationMessage")
    private WebElement validationMessage;

    public ChemicalProppantEmailDelPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToMainMenu() {
        try {
            elementUtils.clickElement(mainMenu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToJobsSection() {
        try {
            elementUtils.clickElement(jobsSection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCurrentJob() {
        try {
            elementUtils.clickElement(currentJob);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void chooseWell(String wellOption) {
        try {
            elementUtils.selectOptionInDropdown(wellDropdown, wellOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStage(String stageOption) {
        try {
            elementUtils.selectOptionInDropdown(stageDropdown, stageOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickChemicalSetup() {
        try {
            elementUtils.clickElement(chemicalSetupButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isChemicalSetupScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(chemicalSetupScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void verifyJobWellStageDisplayed() {
        // Implementation for verifying Job, Well, and Stage
    }

    public void clickProppantSetup() {
        try {
            elementUtils.clickElement(proppantSetupButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isProppantSetupScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(proppantSetupScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickEmailSetup() {
        try {
            elementUtils.clickElement(emailSetupButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEmailSetupScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(emailSetupScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectChemicalFromDropdown(String chemicalName) {
        try {
            elementUtils.selectOptionInDropdown(chemicalDropdown, chemicalName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDesignConcentration(String designConcentration) {
        try {
            elementUtils.clearAndSendKeys(designConcentrationInput, designConcentration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDesignedVolume(String designedVolume) {
        try {
            elementUtils.clearAndSendKeys(designedVolumeInput, designedVolume);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksAddChemicalButton() {
        try {
            elementUtils.clickElement(addChemicalButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksSaveButtonForLastEntry() {
        try {
            elementUtils.clickElement(lastEntryButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(validationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void leaveVendorNameFieldEmpty() {
        try {
            WebElement vendorNameField = driver.findElement(By.id("vendorName"));
            ElementUtils.clearAndSendKeys(vendorNameField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPONumber(String poNumber) {
        try {
            WebElement poField = driver.findElement(By.id("poNumber"));
            ElementUtils.clearAndSendKeys(poField, poNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hasDropdownLoadingErrors() {
        try {
            WebElement dropdown = driver.findElement(By.id("vendorDropdown"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(dropdown), "Dropdown loading error.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isProppantAdded() {
        try {
            WebElement proppantList = driver.findElement(By.id("proppantList"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(proppantList), "Proppant is not added.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getDesignConcentration() {
        String concentration = "";
        try {
            WebElement designConcentrationField = driver.findElement(By.id("designConcentration"));
            concentration = ElementUtils.getElementText(designConcentrationField);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return concentration;
    }

    public void enterFields(String fieldName, String value) {
        try {
            WebElement field = driver.findElement(By.id(fieldName));
            ElementUtils.clearAndSendKeys(field, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendorType(String vendorType) {
        try {
            WebElement vendorTypeDropdown = driver.findElement(By.id("vendorTypeDropdown"));
            ElementUtils.selectOptionInDropdown(vendorTypeDropdown, vendorType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void refreshPage() {
        try {
            driver.navigate().refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areErrorMessagesDisplayed() {
        boolean displayed = false;
        try {
            WebElement errorMessage = driver.findElement(By.id("errorMessages"));
            displayed = ElementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return displayed;
    }

    public void isFirstChemicalSaved() {
        try {
            WebElement firstChemicalField = driver.findElement(By.id("firstChemical"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(firstChemicalField), "First chemical is not saved.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyEnteredDetails(String expectedDetails) {
        try {
            String actualDetails = driver.findElement(By.id("detailsDisplay")).getText();
            Assert.assertEquals(actualDetails, expectedDetails, "Entered details do not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksSaveAndNew() {
        try {
            WebElement saveAndNewButton = driver.findElement(By.id("saveAndNewButton"));
            ElementUtils.clickElement(saveAndNewButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isFormResetForNewEntry() {
        boolean reset = false;
        try {
            WebElement formElement = driver.findElement(By.id("form"));
            reset = formElement.getAttribute("reset").equals("true");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reset;
    }

    public void isLastEntrySaved() {
        try {
            WebElement lastEntry = driver.findElement(By.id("lastEntry"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(lastEntry), "Last entry is not saved.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isChemicalAdded() {
        try {
            WebElement chemicalList = driver.findElement(By.id("chemicalList"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(chemicalList), "Chemical is not added.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getVolume() {
        String volume = "";
        try {
            WebElement volumeField = driver.findElement(By.id("volume"));
            volume = ElementUtils.getElementText(volumeField);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return volume;
    }

    public boolean isVendorRequiredErrorDisplayed() {
        boolean displayed = false;
        try {
            WebElement vendorError = driver.findElement(By.id("vendorError"));
            displayed = ElementUtils.isElementDisplayed(vendorError);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return displayed;
    }

    public boolean isFifthProppantErrorDisplayed() {
        boolean displayed = false;
        try {
            WebElement fifthProppantError = driver.findElement(By.id("fifthProppantError"));
            displayed = ElementUtils.isElementDisplayed(fifthProppantError);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return displayed;
    }

    public void enterTotalDesignVolume(String volume) {
        try {
            WebElement totalVolumeField = driver.findElement(By.id("totalDesignVolume"));
            ElementUtils.clearAndSendKeys(totalVolumeField, volume);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isVendorSaved() {
        boolean saved = false;
        try {
            WebElement vendorSavedMessage = driver.findElement(By.id("vendorSavedMessage"));
            saved = ElementUtils.isElementDisplayed(vendorSavedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return saved;
    }

    public void enterLastEntry(String entry) {
        try {
            WebElement lastEntryField = driver.findElement(By.id("lastEntryField"));
            ElementUtils.clearAndSendKeys(lastEntryField, entry);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInRequiredFields() {
        try {
            WebElement requiredField = driver.findElement(By.id("requiredField"));
            ElementUtils.clearAndSendKeys(requiredField, "Some Value");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickMeetingIDField() {
        try {
            WebElement meetingIDField = driver.findElement(By.id("meetingIDField"));
            ElementUtils.clickElement(meetingIDField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterBOLNumber(String bolNumber) {
        try {
            WebElement bolNumberField = driver.findElement(By.id("bolNumber"));
            ElementUtils.clearAndSendKeys(bolNumberField, bolNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInventoryType(String inventoryType) {
        try {
            WebElement inventoryTypeDropdown = driver.findElement(By.id("inventoryTypeDropdown"));
            ElementUtils.selectOptionInDropdown(inventoryTypeDropdown, inventoryType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterVendorName(String vendorName) {
        try {
            WebElement vendorNameField = driver.findElement(By.id("vendorName"));
            ElementUtils.clearAndSendKeys(vendorNameField, vendorName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hasValidationErrors() {
        boolean hasErrors = false;
        try {
            WebElement validationErrors = driver.findElement(By.id("validationErrors"));
            hasErrors = ElementUtils.isElementDisplayed(validationErrors);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hasErrors;
    }

    public boolean isOnChemicalDeliveryTrackingScreen() {
        boolean isOnScreen = false;
        try {
            String currentUrl = driver.getCurrentUrl();
            isOnScreen = currentUrl.contains("chemicalDeliveryTracking");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOnScreen;
    }

    public boolean isMeetingIDPersisted() {
        boolean isPersisted = false;
        try {
            WebElement meetingID = driver.findElement(By.id("meetingID"));
            isPersisted = ElementUtils.isElementDisplayed(meetingID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isPersisted;
    }

    public boolean isDeliveryRecordCreated() {
        boolean isCreated = false;
        try {
            WebElement deliveryRecordMessage = driver.findElement(By.id("deliveryRecordMessage"));
            isCreated = ElementUtils.isElementDisplayed(deliveryRecordMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isCreated;
    }

    public void clicksAddVendorButton() {
        try {
            WebElement addVendorButton = driver.findElement(By.id("addVendorButton"));
            ElementUtils.clickElement(addVendorButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksAddProppantButton() {
        try {
            WebElement addProppantButton = driver.findElement(By.id("addProppantButton"));
            ElementUtils.clickElement(addProppantButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterDesignConcentrationValue(String concentrationValue) {
        try {
            WebElement designConcentrationField = driver.findElement(By.id("designConcentrationField"));
            ElementUtils.clearAndSendKeys(designConcentrationField, concentrationValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isVendorNameErrorDisplayed() {
        boolean displayed = false;
        try {
            WebElement vendorNameError = driver.findElement(By.id("vendorNameError"));
            displayed = ElementUtils.isElementDisplayed(vendorNameError);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return displayed;
    }

    public void clicksAddDeliveryRecordButton() {
        try {
            WebElement addDeliveryRecordButton = driver.findElement(By.id("addDeliveryRecordButton"));
            ElementUtils.clickElement(addDeliveryRecordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectVendorFromDropdown(String vendor) {
        try {
            WebElement vendorDropdown = driver.findElement(By.id("vendorDropdown"));
            ElementUtils.selectOptionInDropdown(vendorDropdown, vendor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveChemicalNameFieldEmpty() {
        try {
            WebElement chemicalNameField = driver.findElement(By.id("chemicalName"));
            ElementUtils.clearAndSendKeys(chemicalNameField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveDesignedVolumeFieldEmpty() {
        try {
            WebElement designedVolumeField = driver.findElement(By.id("designedVolume"));
            ElementUtils.clearAndSendKeys(designedVolumeField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMeetingID(String meetingID) {
        try {
            WebElement meetingIDField = driver.findElement(By.id("meetingID"));
            ElementUtils.clearAndSendKeys(meetingIDField, meetingID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDeliveryRecordAddedSuccessfully() {
        boolean added = false;
        try {
            WebElement successMessage = driver.findElement(By.id("deliveryRecordSuccessMessage"));
            added = ElementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return added;
    }

    public boolean isEntryAddedToList() {
        boolean added = false;
        try {
            WebElement entryList = driver.findElement(By.id("entryList"));
            added = ElementUtils.isElementDisplayed(entryList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return added;
    }

    public void enterBOLQuantity(String quantity) {
        try {
            WebElement bolQuantityField = driver.findElement(By.id("bolQuantity"));
            ElementUtils.clearAndSendKeys(bolQuantityField, quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterReceivedQuantity(String quantity) {
        try {
            WebElement receivedQuantityField = driver.findElement(By.id("receivedQuantity"));
            ElementUtils.clearAndSendKeys(receivedQuantityField, quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEntryPersisted() {
        boolean persisted = false;
        try {
            WebElement persistedEntry = driver.findElement(By.id("persistedEntry"));
            persisted = ElementUtils.isElementDisplayed(persistedEntry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persisted;
    }

    public void attemptToAddFifthProppant() {
        try {
            WebElement addFifthProppantButton = driver.findElement(By.id("addFifthProppant"));
            ElementUtils.clickElement(addFifthProppantButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksAddChemicalButtonAgain() {
        try {
            WebElement addChemicalButton = driver.findElement(By.id("addChemicalButton"));
            ElementUtils.clickElement(addChemicalButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveVendorFieldEmpty() {
        try {
            WebElement vendorField = driver.findElement(By.id("vendorField"));
            ElementUtils.clearAndSendKeys(vendorField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterUOM(String uom) {
        try {
            WebElement uomField = driver.findElement(By.id("uom"));
            ElementUtils.clearAndSendKeys(uomField, uom);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDeliveryRecordAdded() {
        boolean added = false;
        try {
            WebElement deliveryRecord = driver.findElement(By.id("deliveryRecord"));
            added = ElementUtils.isElementDisplayed(deliveryRecord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return added;
    }

    public void clicksSaveButton() {
        try {
            WebElement saveButton = driver.findElement(By.id("saveButton"));
            ElementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectChemicalTypeFromDropdown(String chemicalType) {
        try {
            WebElement chemicalTypeDropdown = driver.findElement(By.id("chemicalTypeDropdown"));
            ElementUtils.selectOptionInDropdown(chemicalTypeDropdown, chemicalType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getDisplayedDesignedVolume() {
        String designedVolume = "";
        try {
            WebElement designedVolumeField = driver.findElement(By.id("displayedDesignedVolume"));
            designedVolume = ElementUtils.getElementText(designedVolumeField);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return designedVolume;
    }

    public boolean isSecondChemicalAdded() {
        boolean added = false;
        try {
            WebElement secondChemical = driver.findElement(By.id("secondChemical"));
            added = ElementUtils.isElementDisplayed(secondChemical);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return added;
    }

    public boolean areAllVendorsAdded() {
        boolean allAdded = false;
        try {
            WebElement vendorsList = driver.findElement(By.id("vendorsList"));
            allAdded = ElementUtils.isElementDisplayed(vendorsList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allAdded;
    }

    public String selectProppantName5() {
        String proppantName5 = "";
        try {
            WebElement proppantNameField = driver.findElement(By.id("proppantName5"));
            proppantName5 = ElementUtils.getElementText(proppantNameField);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proppantName5;
    }

    public String getDisplayedDesignConcentration() {
        String designConcentration = "";
        try {
            WebElement concentrationField = driver.findElement(By.id("displayedDesignConcentration"));
            designConcentration = ElementUtils.getElementText(concentrationField);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return designConcentration;
    }

    public boolean doesDropdownDisplayAllAvailableOptions() {
        boolean display = false;
        try {
            WebElement dropdown = driver.findElement(By.id("availableOptionsDropdown"));
            display = ElementUtils.isElementDisplayed(dropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return display;
    }

    public void verifyAllProppantsDisplayed() {
        try {
            WebElement proppantsTable = driver.findElement(By.id("proppantsTable"));
            Assert.assertTrue(ElementUtils.isElementDisplayed(proppantsTable), "Not all proppants are displayed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectPOFromDropdown(String po) {
        try {
            WebElement poDropdown = driver.findElement(By.id("poDropdown"));
            ElementUtils.selectOptionInDropdown(poDropdown, po);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFromDropdown(String dropdownId, String option) {
        try {
            WebElement dropdown = driver.findElement(By.id(dropdownId));
            ElementUtils.selectOptionInDropdown(dropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAcidAdditivesEntryAdded() {
        boolean added = false;
        try {
            WebElement acidAdditivesEntry = driver.findElement(By.id("acidAdditivesEntry"));
            added = ElementUtils.isElementDisplayed(acidAdditivesEntry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return added;
    }

    public void selectChemical(String chemical) {
        try {
            WebElement chemicalDropdown = driver.findElement(By.id("chemicalDropdown"));
            ElementUtils.selectOptionInDropdown(chemicalDropdown, chemical);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}