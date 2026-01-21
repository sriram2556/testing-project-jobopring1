package com.testing-project-jobopring1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testing-project-jobopring1.pages.CreateNewJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateNewJobOpening extends DriverFactory {
CreateNewJobOpeningPage createNewJobOpeningPage = new CreateNewJobOpeningPage(driver);
@Given("the user is logged into the application")
public void the_user_is_logged_into_the_application() {
driver = DriverFactory.getDriver();
createNewJobOpeningPage.login();
}
@When("the user clicks on the {string} module from the main menu")
public void the_user_clicks_on_the_module_from_the_main_menu(String module) {
createNewJobOpeningPage.clicks(module);
}
@Then("the Job Opening page should be displayed with an {string} button visible")
public void the_job_opening_page_should_be_displayed_with_an_button_visible(String button) {
createNewJobOpeningPage.isButtonVisible(button);
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String button) {
createNewJobOpeningPage.clicks(button);
}
@Then("the Create New Job Opening form should be displayed")
public void the_create_new_job_opening_form_should_be_displayed() {
createNewJobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("all required fields are present")
public void all_required_fields_are_present() {
createNewJobOpeningPage.areRequiredFieldsPresent();
}
@Given("the user is on the Create Job Opening Page")
public void the_user_is_on_the_create_job_opening_page() {
createNewJobOpeningPage.navigateToCreateJobOpeningPage();
}
@When("I fill in the Job Title field with {string}")
public void i_fill_in_the_job_title_field_with(String jobTitle) {
createNewJobOpeningPage.fillJobTitle(jobTitle);
}
@When("I fill in the Job Description field with {string}")
public void i_fill_in_the_job_description_field_with(String jobDescription) {
createNewJobOpeningPage.fillJobDescription(jobDescription);
}
@When("I select {string} from the Department dropdown")
public void i_select_from_the_department_dropdown(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("I fill in the Location field with {string}")
public void i_fill_in_the_location_field_with(String location) {
createNewJobOpeningPage.fillLocation(location);
}
@When("I select {string} as Employment Type")
public void i_select_as_employment_type(String employmentType) {
createNewJobOpeningPage.selectEmploymentType(employmentType);
}
@When("I click the {string} button")
public void i_click_the_button(String button) {
createNewJobOpeningPage.clicks(button);
}
@Then("a new job opening is created successfully")
public void a_new_job_opening_is_created_successfully() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@Then("the user is redirected to the Job Openings listing page")
public void the_user_is_redirected_to_the_job_openings_listing_page() {
createNewJobOpeningPage.isOnJobOpeningsListingPage();
}
@Then("the newly created job opening is displayed in the listing")
public void the_newly_created_job_opening_is_displayed_in_the_listing() {
createNewJobOpeningPage.isNewJobOpeningDisplayed();
}
@When("the user leaves all required fields empty")
public void the_user_leaves_all_required_fields_empty() {
createNewJobOpeningPage.leaveRequiredFieldsEmpty();
}
@Then("the system displays error messages for each required field that is empty")
public void the_system_displays_error_messages_for_each_required_field_that_is_empty() {
createNewJobOpeningPage.areErrorMessagesDisplayed();
}
@Then("the user remains on the Create New Job Opening form")
public void the_user_remains_on_the_create_new_job_opening_form() {
createNewJobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@When("I modify the Job Description field")
public void i_modify_the_job_description_field() {
createNewJobOpeningPage.modifyJobDescription();
}
@Then("the job opening is updated successfully")
public void the_job_opening_is_updated_successfully() {
createNewJobOpeningPage.isJobOpeningUpdated();
}
@When("the user clicks the {string} button on the Create New Job Opening form")
public void the_user_clicks_the_button_on_the_create_new_job_opening_form(String button) {
createNewJobOpeningPage.clicks(button);
}
@Then("no new job opening should be created")
public void no_new_job_opening_should_be_created() {
createNewJobOpeningPage.isJobOpeningCreated();
}
@When("I click on the newly created job opening")
public void i_click_on_the_newly_created_job_opening() {
createNewJobOpeningPage.clickOnNewlyCreatedJobOpening();
}
@Then("the job opening details are displayed correctly")
public void the_job_opening_details_are_displayed_correctly() {
createNewJobOpeningPage.areJobOpeningDetailsCorrect();
}
@When("the user clicks on the filter options")
public void the_user_clicks_on_the_filter_options() {
createNewJobOpeningPage.clickFilterOptions();
}
@When("the user selects a Department from the filter dropdown")
public void the_user_selects_a_department_from_the_filter_dropdown() {
createNewJobOpeningPage.selectDepartmentFromFilter();
}
@When("the user clicks the Apply Filters button")
public void the_user_clicks_the_apply_filters_button() {
createNewJobOpeningPage.clickApplyFilters();
}
@Then("job openings are filtered based on the selected criteria")
public void job_openings_are_filtered_based_on_the_selected_criteria() {
createNewJobOpeningPage.areJobOpeningsFiltered();
}
@Then("only relevant job openings are displayed in the listing")
public void only_relevant_job_openings_are_displayed_in_the_listing() {
createNewJobOpeningPage.areRelevantJobOpeningsDisplayed();
}
@When("I enter {string} as the Job Title")
public void i_enter_as_the_job_title(String jobTitle) {
createNewJobOpeningPage.fillJobTitle(jobTitle);
}
@When("I enter {string} as the Company Name")
public void i_enter_as_the_company_name(String companyName) {
createNewJobOpeningPage.fillCompanyName(companyName);
}
@When("I enter {string} as the Location")
public void i_enter_as_the_location(String location) {
createNewJobOpeningPage.fillLocation(location);
}
@When("I enter {string} as the Job Description")
public void i_enter_as_the_job_description(String description) {
createNewJobOpeningPage.fillJobDescription(description);
}
@When("I enter {string} as the Salary")
public void i_enter_as_the_salary(String salary) {
createNewJobOpeningPage.fillSalary(salary);
}
@Then("the system displays an error message indicating the Job Title is invalid")
public void the_system_displays_an_error_message_indicating_the_job_title_is_invalid() {
assertErrorMessage("Job Title is invalid");
}
@Then("the system displays an error message indicating the Job Description is too long")
public void the_system_displays_an_error_message_indicating_the_job_description_is_too_long() {
assertErrorMessage("Job Description is too long");
}
@Then("the system displays an error message indicating the selected Department is invalid")
public void the_system_displays_an_error_message_indicating_the_selected_department_is_invalid() {
assertErrorMessage("Selected Department is invalid");
}
@Then("the system displays an error message indicating the Job Title already exists")
public void the_system_displays_an_error_message_indicating_the_job_title_already_exists() {
assertErrorMessage("Job Title already exists");
}
@Then("the system displays an error message indicating invalid data type")
public void the_system_displays_an_error_message_indicating_invalid_data_type() {
assertErrorMessage("Invalid data type");
}
@Then("the system displays an error message indicating the location is invalid")
public void the_system_displays_an_error_message_indicating_the_location_is_invalid() {
assertErrorMessage("Location is invalid");
}
private void assertErrorMessage(String expectedMessage) {
createNewJobOpeningPage.isErrorMessageDisplayed(expectedMessage);
}

@Given("I enter {string} as job location")
public void i_enter_as_job_location(String jobLocation) {
createNewJobOpeningPage.enterJobLocation(jobLocation);
}
@When("I quickly clickElement add job opening again")
public void i_quickly_click_add_job_opening_again() {
createNewJobOpeningPage.clickAddJobOpening();
}
@When("the user fills in {string} as company name")
public void the_user_fills_in_as_company_name(String companyName) {
createNewJobOpeningPage.fillCompanyName(companyName);
}
@When("I create a new job opening with valid details for {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
public void i_create_a_new_job_opening_with_valid_details(String jobTitle, String jobDescription, String location, String salary, String companyName, String department, String jobType, String experience) {
createNewJobOpeningPage.createJobOpening(jobTitle, jobDescription, location, salary, companyName, department, jobType, experience);
}
@When("the user enters {string} in the description field")
public void the_user_enters_in_the_description_field(String description) {
createNewJobOpeningPage.enterDescription(description);
}
@When("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String dropdownValue) {
createNewJobOpeningPage.selectFromDropdown(dropdownValue);
}
@When("the user fills in other required fields with valid data")
public void the_user_fills_in_other_required_fields_with_valid_data() {
createNewJobOpeningPage.fillOtherRequiredFields();
}
@When("the user clicks on the newly created job opening")
public void the_user_clicks_on_the_newly_created_job_opening() {
createNewJobOpeningPage.clickOnNewlyCreatedJobOpening();
}
@When("I clickElement the save button")
public void i_click_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@When("I fill in the job title field with a valid title {string}")
public void i_fill_in_the_job_title_field_with_a_valid_title(String jobTitle) {
createNewJobOpeningPage.fillJobTitle(jobTitle);
}
@When("I leave optional fields empty")
public void i_leave_optional_fields_empty() {
createNewJobOpeningPage.leaveOptionalFieldsEmpty();
}
@When("I enter {string} as job title")
public void i_enter_as_job_title(String jobTitle) {
createNewJobOpeningPage.fillJobTitle(jobTitle);
}
@When("the user fills in the job description field with {string}")
public void the_user_fills_in_the_job_description_field_with(String jobDescription) {
createNewJobOpeningPage.fillJobDescription(jobDescription);
}
@Then("both job openings are displayed in the listing")
public void both_job_openings_are_displayed_in_the_listing() {
createNewJobOpeningPage.areBothJobOpeningsDisplayed();
}
@When("the user attempts to navigate to another module")
public void the_user_attempts_to_navigate_to_another_module() {
createNewJobOpeningPage.attemptNavigateToAnotherModule();
}
@When("the user clicks the cancel button on the create new job opening form")
public void the_user_clicks_the_cancel_button_on_the_create_new_job_opening_form() {
createNewJobOpeningPage.clickCancelButton();
}
@When("I fill in the job description field with a valid description {string}")
public void i_fill_in_the_job_description_field_with_a_valid_description(String description) {
createNewJobOpeningPage.fillJobDescription(description);
}
@Then("the user is redirected to the job openings listing page after each save")
public void the_user_is_redirected_to_the_job_openings_listing_page_after_each_save() {
createNewJobOpeningPage.isRedirectedToJobOpeningsListing();
}
@When("I enter {string} as salary")
public void i_enter_as_salary(String salary) {
createNewJobOpeningPage.enterSalary(salary);
}
@When("the user fills in {string} as location")
public void the_user_fills_in_as_location(String location) {
createNewJobOpeningPage.fillLocation(location);
}
@Then("the system displays a warning message about unsaved changes")
public void the_system_displays_a_warning_message_about_unsaved_changes() {
createNewJobOpeningPage.isWarningMessageDisplayed();
}
@Then("the newly created job opening should be displayed in the list")
public void the_newly_created_job_opening_should_be_displayed_in_the_list() {
createNewJobOpeningPage.isNewJobOpeningDisplayed();
}
@When("I clickElement save")
public void i_click_save() {
createNewJobOpeningPage.clickSave();
}
@When("the user selects {string} from the department dropdown")
public void the_user_selects_from_the_department_dropdown(String department) {
createNewJobOpeningPage.selectDepartment(department);
}
@When("the user fills in other required fields with {string}")
public void the_user_fills_in_other_required_fields_with(String data) {
createNewJobOpeningPage.fillOtherRequiredFieldsWith(data);
}
@When("the user clicks on the job openings module")
public void the_user_clicks_on_the_job_openings_module() {
createNewJobOpeningPage.clickJobOpeningsModule();
}
@When("the user clicks on the job openings module from the main menu")
public void the_user_clicks_on_the_job_openings_module_from_the_main_menu() {
createNewJobOpeningPage.clickJobOpeningsModuleFromMainMenu();
}
@When("I clickElement the edit button")
public void i_click_the_edit_button() {
createNewJobOpeningPage.clickEditButton();
}
@When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String jobTitle) {
createNewJobOpeningPage.fillJobTitle(jobTitle);
}
@Then("all fields match the data entered during creation")
public void all_fields_match_the_data_entered_during_creation() {
createNewJobOpeningPage.doFieldsMatchData();
}
@When("I enter {string} as job description")
public void i_enter_as_job_description(String jobDescription) {
createNewJobOpeningPage.fillJobDescription(jobDescription);
}
@When("the user makes changes to the form without saving")
public void the_user_makes_changes_to_the_form_without_saving() {
createNewJobOpeningPage.makeChangesWithoutSaving();
}
@When("I enter {string}")
public void i_enter(String input) {
createNewJobOpeningPage.enterInput(input);
}
@Then("the user should observe the list of job openings")
public void the_user_should_observe_the_list_of_job_openings() {
createNewJobOpeningPage.isJobOpeningsListDisplayed();
}
@When("the user fills in {string} as salary")
public void the_user_fills_in_as_salary(String salary) {
createNewJobOpeningPage.fillSalary(salary);
}
@When("I fill in details for the second job opening")
public void i_fill_in_details_for_the_second_job_opening() {
createNewJobOpeningPage.fillDetailsForSecondJobOpening();
}
@Then("the job opening details should be correct match the entered data")
public void the_job_opening_details_should_be_correct_match_the_entered_data() {
createNewJobOpeningPage.isJobOpeningDetailsCorrect();
}
@When("the user enters {string} in the company field")
public void the_user_enters_in_the_company_field(String company) {
createNewJobOpeningPage.fillCompanyField(company);
}
@Then("the job opening page should be displayed with an add job opening button visible")
public void the_job_opening_page_should_be_displayed_with_an_add_job_opening_button_visible() {
createNewJobOpeningPage.isAddJobOpeningButtonVisible();
}
@Then("the user should be redirected back to the job openings listing page")
public void the_user_should_be_redirected_back_to_the_job_openings_listing_page() {
createNewJobOpeningPage.isRedirectedToJobOpeningsListingPage();
}
@When("the user clicks on the add job opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createNewJobOpeningPage.clickAddJobOpeningButton();
}
@When("I enter {string} as the description")
public void i_enter_as_the_description(String description) {
createNewJobOpeningPage.enterDescription(description);
}
@Then("the user remains on the create new job opening form until they confirm to leave")
public void the_user_remains_on_the_create_new_job_opening_form_until_they_confirm_to_leave() {
createNewJobOpeningPage.isOnCreateNewJobOpeningForm();
}
@When("the user enters {string} in the location field")
public void the_user_enters_in_the_location_field(String location) {
createNewJobOpeningPage.fillLocationField(location);
}
@When("I select a valid department {string}")
public void i_select_a_valid_department(String department) {
createNewJobOpeningPage.selectValidDepartment(department);
}
@When("the user fills in {string} as job description")
public void the_user_fills_in_as_job_description(String jobDescription) {
createNewJobOpeningPage.fillJobDescription(jobDescription);
}
@Then("updated job opening details are displayed in the listing")
public void updated_job_opening_details_are_displayed_in_the_listing() {
createNewJobOpeningPage.isUpdatedJobOpeningDetailsDisplayed();
}
@When("I clickElement save for the second job opening")
public void i_click_save_for_the_second_job_opening() {
createNewJobOpeningPage.clickSaveForSecondJobOpening();
}
@When("the user clicks the save button")
public void the_user_clicks_the_save_button() {
createNewJobOpeningPage.clickSaveButton();
}
@Then("both job openings are created successfully")
public void both_job_openings_are_created_successfully() {
createNewJobOpeningPage.areBothJobOpeningsCreatedSuccessfully();
}
}