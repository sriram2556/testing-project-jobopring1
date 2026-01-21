package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateNewJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "jobTitleField")
    private WebElement jobTitleField;
    @FindBy(id = "jobDescriptionField")
    private WebElement jobDescriptionField;
    @FindBy(id = "departmentDropdown")
    private WebElement departmentDropdown;
    @FindBy(id = "locationField")
    private WebElement locationField;
    @FindBy(id = "employmentTypeDropdown")
    private WebElement employmentTypeDropdown;
    @FindBy(id = "createJobOpeningButton")
    private WebElement createJobOpeningButton;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;
    @FindBy(id = "newJobOpeningListing")
    private WebElement newJobOpeningListing;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "jobOpeningsModule")
    private WebElement jobOpeningsModule;

    public CreateNewJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillJobTitle(String jobTitle) {
        elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
    }

    public void fillJobDescription(String jobDescription) {
        elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
    }

    public void selectDepartment(String department) {
        elementUtils.clickElement(departmentDropdown);
        elementUtils.selectOptionInDropdown(departmentDropdown, department);
    }

    public void fillLocation(String location) {
        elementUtils.clearAndSendKeys(locationField, location);
    }

    public void selectEmploymentType(String employmentType) {
        elementUtils.clickElement(employmentTypeDropdown);
        elementUtils.selectOptionInDropdown(employmentTypeDropdown, employmentType);
    }

    ublic void clickCreateJobOpening() {
        elementUtils.clickElement(createJobOpeningButton);
    }

    public void isErrorMessageDisplayed(String expectedMessage) {
        String actualMessage = elementUtils.getElementText(errorMessage);
        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match!");
    }

    public void isNewJobOpeningDisplayed() {
        boolean isDisplayed = elementUtils.isElementDisplayed(newJobOpeningListing);
        Assert.assertTrue("New Job Opening is not displayed!", isDisplayed);
    }

    public void clickAddJobOpening() {
        elementUtils.clickElement(addJobOpeningButton);
    }

    public void clickSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public void clickCancelButton() {
        elementUtils.clickElement(cancelButton);
    }

    public void clickJobOpeningsModule() {
        elementUtils.clickElement(jobOpeningsModule);
    }

    public void areBothJobOpeningsCreatedSuccessfully() {
        // Logic to verify both job openings are created successfully
    }

    public void isJobOpeningDetailsCorrect() {
        // Logic to verify the job opening details
    }

    public void fillDetailsForSecondJobOpening() {
        // Logic to fill details for the second job opening
    }

    public void leaveRequiredFieldsEmpty() {
        // Logic to leave required fields empty
    }

    public void selectValidDepartment(String department) {
        // Logic to select a valid department
        selectDepartment(department);
    }

    public void clickJobOpeningsModuleFromMainMenu() {
        clickJobOpeningsModule();
    }

    public void clickSaveForSecondJobOpening() {
        clickSaveButton();
    }

    public boolean isButtonVisible(String button) {
        // Logic to check if the button is visible
        return elementUtils.isElementDisplayed(driver.findElement(By.id(button)));
    }

    public void fillOtherRequiredFields() {
        // Logic to fill other required fields
    }

    public void createJobOpening(String jobTitle, String jobDescription, String location, String salary, String companyName, String department, String jobType, String experience) {
        fillJobTitle(jobTitle);
        fillJobDescription(jobDescription);
        fillLocation(location);
        // Additional logic for salary, company name, department, job type, and experience
    }

    public boolean areErrorMessagesDisplayed() {
        // Logic to check if error messages are displayed
        return elementUtils.isElementDisplayed(errorMessage);
    }

    public void makeChangesWithoutSaving() {
        // Logic to make changes without saving
    }

    public boolean isJobOpeningsListDisplayed() {
        return elementUtils.isElementDisplayed(newJobOpeningListing);
    }

    public void enterSalary(String salary) {
        // Logic to enter salary
    }

    public boolean isCreateNewJobOpeningFormDisplayed() {
        return elementUtils.isElementDisplayed(jobTitleField);
    }

    public void navigateToCreateJobOpeningPage() {
        clickJobOpeningsModule();
        // Additional navigation logic if needed
    }

    public void selectDepartmentFromFilter(String department) {
        // Logic to select department from filter
        selectDepartment(department);
    }

    public void fillCompanyName(String companyName) {
        // Logic to fill company name
    }

    public boolean isWarningMessageDisplayed() {
        // Logic to check if warning message is displayed
        return false; // Placeholder return
    }

    public boolean areJobOpeningsFiltered() {
        // Logic to check if job openings are filtered
        return true; // Placeholder return
    }

    public void clickAddJobOpeningButton() {
        clickAddJobOpening();
    }

    public void enterDescription(String description) {
        fillJobDescription(description);
    }

    public boolean isOnCreateNewJobOpeningForm() {
        return isCreateNewJobOpeningFormDisplayed();
    }

    public boolean doFieldsMatchData() {
        // Logic to check if fields match data
        return true; // Placeholder return
    }

    ublic void clickYes() {
        // Logic to click yes
    }

    public boolean isRedirectedToJobOpeningsListing() {
        return isJobOpeningsListDisplayed();
    }

    public boolean areBothJobOpeningsDisplayed() {
        // Logic to verify if both job openings are displayed
        return true; // Placeholder return
    }

    public boolean areRequiredFieldsPresent() {
        // Logic to check if required fields are present
        return true; // Placeholder return
    }

    public boolean isAddJobOpeningButtonVisible() {
        return isButtonVisible("addJobOpeningButton");
    }

    public void fillSalary(String salary) {
        enterSalary(salary);
    }

    public void leaveOptionalFieldsEmpty() {
        // Logic to leave optional fields empty
    }

    public void fillOtherRequiredFieldsWith(String jobLocation) {
        fillLocation(jobLocation);
        // Additional logic for other required fields
    }

    public boolean enterInput(String input) {
        // Logic to enter input
        return true; // Placeholder return
    }

    public boolean isOnJobOpeningsListingPage() {
        return isJobOpeningsListDisplayed();
    }

    public void login() {
        // Logic to perform login
    }

    public void selectFromDropdown(String dropdownValue) {
        // Logic to select from dropdown
    }

    public void clickEditButton() {
        // Logic to click edit button
    }

    public void clickOnNewlyCreatedJobOpening() {
        // Logic to click on newly created job opening
    }

    public void clickFilterOptions() {
        // Logic to click filter options
    }

    public boolean attemptNavigateToAnotherModule() {
        // Logic to attempt navigation to another module
        return true; // Placeholder return
    }

    public boolean isJobOpeningCreated() {
        // Logic to check if job opening is created
        return true; // Placeholder return
    }

    public void modifyJobDescription() {
        // Logic to modify the job description
    }

    public boolean areRelevantJobOpeningsDisplayed() {
        // Logic to check if relevant job openings are displayed
        return true; // Placeholder return
    }

    public void clickApplyFilters() {
        // Logic to click apply filters
    }

    public boolean isJobOpeningUpdated() {
        // Logic to check if the job opening is updated
        return true; // Placeholder return
    }
}