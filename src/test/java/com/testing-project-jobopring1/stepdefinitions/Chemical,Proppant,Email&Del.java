package com.testing-project-jobopring1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testing-project_jobopring1.pages.ChemicalProppantEmailDelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ChemicalProppantEmailDel extends DriverFactory {
ChemicalProppantEmailDelPage chemicalProppantEmailDelPage = new ChemicalProppantEmailDelPage(driver);
@Given("the user is on the main menu")
public void the_user_is_on_the_main_menu() {
// Implementation to ensure the user is on the main menu
chemicalProppantEmailDelPage.navigateToMainMenu();
}
@When("I navigate to the Jobs section from the main menu")
public void i_navigate_to_the_jobs_section_from_the_main_menu() {
chemicalProppantEmailDelPage.navigateToJobsSection();
}
@And("I select a current Job from the list")
public void i_select_a_current_job_from_the_list() {
chemicalProppantEmailDelPage.selectCurrentJob();
}
@And("I choose a Well associated with the Job")
public void i_choose_a_well_associated_with_the_job() {
chemicalProppantEmailDelPage.chooseWell();
}
@And("I select a Stage for the Job")
public void i_select_a_stage_for_the_job() {
chemicalProppantEmailDelPage.selectStage();
}
@And("I click on the Chemical Setup option")
public void i_click_on_the_chemical_setup_option() {
chemicalProppantEmailDelPage.clickChemicalSetup();
}
@Then("the user is redirected to the Chemical Setup screen")
public void the_user_is_redirected_to_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.isChemicalSetupScreenDisplayed();
}
@And("the selected Job, Well, and Stage are displayed correctly on the Chemical Setup screen")
public void the_selected_job_well_and_stage_are_displayed_correctly_on_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayed();
}
@When("I click on the Proppant Setup option")
public void i_click_on_the_proppant_setup_option() {
chemicalProppantEmailDelPage.clickProppantSetup();
}
@Then("the user is redirected to the Proppant Setup screen")
public void the_user_is_redirected_to_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.isProppantSetupScreenDisplayed();
}
@And("the selected Job, Well, and Stage are displayed correctly on the Proppant Setup screen")
public void the_selected_job_well_and_stage_are_displayed_correctly_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayed();
}
@When("I click on the Email Setup option")
public void i_click_on_the_email_setup_option() {
chemicalProppantEmailDelPage.clickEmailSetup();
}
@Then("the user is redirected to the Email Setup screen")
public void the_user_is_redirected_to_the_email_setup_screen() {
chemicalProppantEmailDelPage.isEmailSetupScreenDisplayed();
}
@And("the selected Job, Well, and Stage are displayed correctly on the Email Setup screen")
public void the_selected_job_well_and_stage_are_displayed_correctly_on_the_email_setup_screen() {
chemicalProppantEmailDelPage.verifyJobWellStageDisplayed();
}
@Given("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String buttonName) {
chemicalProppantEmailDelPage.clickButton(buttonName);
}
@When("the user selects {string} from the chemical dropdown")
public void the_user_selects_from_the_chemical_dropdown(String chemicalName) {
chemicalProppantEmailDelPage.selectChemicalFromDropdown(chemicalName);
}
@When("the user enters a design concentration value of {string}")
public void the_user_enters_a_design_concentration_value_of(String designConcentration) {
chemicalProppantEmailDelPage.enterDesignConcentration(designConcentration);
}
@When("the user enters a designed volume of {string}")
public void the_user_enters_a_designed_volume_of(String designedVolume) {
chemicalProppantEmailDelPage.enterDesignedVolume(designedVolume);
}
@When("the user refreshes the page")
public void the_user_refreshes_the_page() {
chemicalProppantEmailDelPage.refreshPage();
}
@Then("the Acid & Additives entry should be added to the list")
public void the_acid_additives_entry_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.isAcidAdditivesEntryAdded();
}
@And("the entry should persist after the page refresh")
public void the_entry_should_persist_after_the_page_refresh() {
chemicalProppantEmailDelPage.isEntryPersisted();
}
@And("the correct design concentration {string} should be displayed")
public void the_correct_design_concentration_should_be_displayed(String designConcentration) {
Assert.assertEquals(designConcentration, chemicalProppantEmailDelPage.getDisplayedDesignConcentration());
}
@And("the correct designed volume {string} should be displayed")
public void the_correct_designed_volume_should_be_displayed(String designedVolume) {
Assert.assertEquals(designedVolume, chemicalProppantEmailDelPage.getDisplayedDesignedVolume());
}
@And("no validation errors should occur during the process")
public void no_validation_errors_should_occur_during_the_process() {
chemicalProppantEmailDelPage.hasValidationErrors();
}
@When("the user enters {string} as the total design volume")
public void the_user_enters_as_the_total_design_volume(String totalDesignVolume) {
chemicalProppantEmailDelPage.enterTotalDesignVolume(totalDesignVolume);
}
@Then("the Proppant {string} with volume {string} should be added to the list")
public void the_proppant_with_volume_should_be_added_to_the_list(String proppantName, String totalDesignVolume) {
chemicalProppantEmailDelPage.isProppantAdded(proppantName, totalDesignVolume);
}
@Then("all Proppants should display with correct names and design volumes")
public void all_proppants_should_display_with_correct_names_and_design_volumes() {
chemicalProppantEmailDelPage.verifyAllProppantsDisplayed();
}
@When("the user selects a vendor type {string}")
public void the_user_selects_a_vendor_type(String vendorType) {
chemicalProppantEmailDelPage.selectVendorType(vendorType);
}
@When("the user enters the vendor name {string}")
public void the_user_enters_the_vendor_name(String vendorName) {
chemicalProppantEmailDelPage.enterVendorName(vendorName);
}
@When("the user enters the PO number {string}")
public void the_user_enters_the_po_number(String poNumber) {
chemicalProppantEmailDelPage.enterPONumber(poNumber);
}
@Then("all vendors should be added to the list")
public void all_vendors_should_be_added_to_the_list() {
chemicalProppantEmailDelPage.areAllVendorsAdded();
}
@When("the user clicks on the Meeting ID field")
public void the_user_clicks_on_the_meeting_id_field() {
chemicalProppantEmailDelPage.clickMeetingIDField();
}
// DUPLICATE: @When("the user enters {string}")
public void the_user_enters(String meetingId) {
chemicalProppantEmailDelPage.enterMeetingID(meetingId);
}
@Then("the Meeting ID is updated successfully")
public void the_meeting_id_is_updated_successfully() {
chemicalProppantEmailDelPage.isMeetingIDUpdated();
}
@Then("the new Meeting ID persists after the page refresh")
public void the_new_meeting_id_persists_after_the_page_refresh() {
chemicalProppantEmailDelPage.isMeetingIDPersisted();
}
@When("the user selects a vendor from the dropdown")
public void the_user_selects_a_vendor_from_the_dropdown() {
chemicalProppantEmailDelPage.selectVendorFromDropdown();
}
@When("the user selects a PO from the dropdown")
public void the_user_selects_a_po_from_the_dropdown() {
chemicalProppantEmailDelPage.selectPOFromDropdown();
}
@When("the user selects a chemical type from the dropdown")
public void the_user_selects_a_chemical_type_from_the_dropdown() {
chemicalProppantEmailDelPage.selectChemicalTypeFromDropdown();
}
@When("the user enters the BOL number")
public void the_user_enters_the_bol_number() {
chemicalProppantEmailDelPage.enterBOLNumber();
}
@When("the user enters the received quantity")
public void the_user_enters_the_received_quantity() {
chemicalProppantEmailDelPage.enterReceivedQuantity();
}
@When("the user enters the UOM")
public void the_user_enters_the_uom() {
chemicalProppantEmailDelPage.enterUOM();
}
@When("the user enters the BOL quantity")
public void the_user_enters_the_bol_quantity() {
chemicalProppantEmailDelPage.enterBOLQuantity();
}
@When("the user selects the inventory type")
public void the_user_selects_the_inventory_type() {
chemicalProppantEmailDelPage.selectInventoryType();
}
@Then("the delivery record is added to the list")
public void the_delivery_record_is_added_to_the_list() {
chemicalProppantEmailDelPage.isDeliveryRecordAdded();
}
@Then("all entered details are displayed correctly")
public void all_entered_details_are_displayed_correctly() {
chemicalProppantEmailDelPage.verifyEnteredDetails();
}
@Then("the entry persists after the page refresh")
public void the_entry_persists_after_the_page_refresh() {
chemicalProppantEmailDelPage.isEntryPersisted();
}
@Then("an error message is displayed indicating that the total design volume must be positive")
public void an_error_message_is_displayed_indicating_that_the_total_design_volume_must_be_positive() {
chemicalProppantEmailDelPage.isErrorMessageDisplayed();
}
@Then("the system should not add the Proppant")
public void the_system_should_not_add_the_proppant() {
chemicalProppantEmailDelPage.isProppantAdded();
}
@Then("the system does not save the vendor")
public void the_system_does_not_save_the_vendor() {
chemicalProppantEmailDelPage.isVendorSaved();
}
@Then("an error message is displayed indicating that the vendor name is required")
public void an_error_message_is_displayed_indicating_that_the_vendor_name_is_required() {
chemicalProppantEmailDelPage.isVendorNameErrorDisplayed();
}
@Then("the system does not create the delivery record")
public void the_system_does_not_create_the_delivery_record() {
chemicalProppantEmailDelPage.isDeliveryRecordCreated();
}
@Then("an error message is displayed indicating that the vendor is required")
public void an_error_message_is_displayed_indicating_that_the_vendor_is_required() {
chemicalProppantEmailDelPage.isVendorRequiredErrorDisplayed();
}
@Then("an error message is displayed when attempting to add the fifth Proppant")
public void an_error_message_is_displayed_when_attempting_to_add_the_fifth_proppant() {
chemicalProppantEmailDelPage.isFifthProppantErrorDisplayed();
}

// DUPLICATE: @When("the user enters {string}")
public void the_user_enters(String entry) {
chemicalProppantEmailDelPage.enterLastEntry(entry);
}
@Then("the last entry should be saved successfully")
public void the_last_entry_should_be_saved_successfully() {
chemicalProppantEmailDelPage.isLastEntrySaved();
}
@When("the user clicks save & new")
public void the_user_clicks_save_new() {
chemicalProppantEmailDelPage.clicksSaveAndNew();
}
@Then("the user should remain on the chemical setup screen")
public void the_user_should_remain_on_the_chemical_setup_screen() {
chemicalProppantEmailDelPage.isOnChemicalSetupScreen();
}
// DUPLICATE: @When("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String option) {
chemicalProppantEmailDelPage.selectFromDropdown(option);
}
@When("the user clicks on the add chemical button")
public void the_user_clicks_on_the_add_chemical_button() {
chemicalProppantEmailDelPage.clicksAddChemicalButton();
}
// DUPLICATE: @When("the user selects {string}")
public void the_user_selects(String chemical) {
chemicalProppantEmailDelPage.selectChemical(chemical);
}
@When("the user clicks on the save button for the last entry")
public void the_user_clicks_on_the_save_button_for_the_last_entry() {
chemicalProppantEmailDelPage.clicksSaveButtonForLastEntry();
}
@When("the user clicks on the add chemical button again")
public void the_user_clicks_on_the_add_chemical_button_again() {
chemicalProppantEmailDelPage.clicksAddChemicalButtonAgain();
}
@When("the user selects proppant name 5 from the dropdown")
public void the_user_selects_proppant_name_5_from_the_dropdown() {
chemicalProppantEmailDelPage.selectProppantName5();
}
@Then("the first chemical should be saved successfully")
public void the_first_chemical_should_be_saved_successfully() {
chemicalProppantEmailDelPage.isFirstChemicalSaved();
}
@Then("appropriate error messages should be displayed for missing fields")
public void appropriate_error_messages_should_be_displayed_for_missing_fields() {
chemicalProppantEmailDelPage.areErrorMessagesDisplayed();
}
@When("the user leaves the vendor name field empty")
public void the_user_leaves_the_vendor_name_field_empty() {
chemicalProppantEmailDelPage.leaveVendorNameFieldEmpty();
}
@Then("the correct design concentration {string} volume {string} should be displayed")
public void the_correct_design_concentration_volume_should_be_displayed(String concentration, String volume) {
Assert.assertEquals(concentration, chemicalProppantEmailDelPage.getDesignConcentration());
Assert.assertEquals(volume, chemicalProppantEmailDelPage.getVolume());
}
@When("the user enters {string}, {string}, {string}, {string}")
public void the_user_enters(String field1, String field2, String field3, String field4) {
chemicalProppantEmailDelPage.enterFields(field1, field2, field3, field4);
}
@Then("no validation errors occur during the process")
public void no_validation_errors_occur_during_the_process() {
chemicalProppantEmailDelPage.hasValidationErrors();
}
@When("the user clicks on the add delivery record button")
public void the_user_clicks_on_the_add_delivery_record_button() {
chemicalProppantEmailDelPage.clicksAddDeliveryRecordButton();
}
@When("the user clicks on the add vendor button")
public void the_user_clicks_on_the_add_vendor_button() {
chemicalProppantEmailDelPage.clicksAddVendorButton();
}
@Then("the system should not add the chemical")
public void the_system_should_not_add_the_chemical() {
chemicalProppantEmailDelPage.isChemicalAdded();
}
@When("the user enters a design concentration value {string}")
public void the_user_enters_a_design_concentration_value(String concentrationValue) {
chemicalProppantEmailDelPage.enterDesignConcentrationValue(concentrationValue);
}
@When("the user enters a designed volume {string}")
public void the_user_enters_a_designed_volume(String volumeValue) {
chemicalProppantEmailDelPage.enterDesignedVolume(volumeValue);
}
@When("the user clicks on the save button")
public void the_user_clicks_on_the_save_button() {
chemicalProppantEmailDelPage.clicksSaveButton();
}
@Then("no errors occur during the loading of dropdown options")
public void no_errors_occur_during_the_loading_of_dropdown_options() {
chemicalProppantEmailDelPage.hasDropdownLoadingErrors();
}
@When("the user selects the vendor type {string}")
public void the_user_selects_the_vendor_type(String vendorType) {
chemicalProppantEmailDelPage.selectVendorType(vendorType);
}
@When("the user attempts to add a fifth proppant")
public void the_user_attempts_to_add_a_fifth_proppant() {
chemicalProppantEmailDelPage.attemptToAddFifthProppant();
}
@When("the user leaves the vendor field empty")
public void the_user_leaves_the_vendor_field_empty() {
chemicalProppantEmailDelPage.leaveVendorFieldEmpty();
}
@Then("the {string} entry should be added to the list")
public void the_entry_should_be_added_to_the_list(String entry) {
chemicalProppantEmailDelPage.isEntryAddedToList(entry);
}
@When("the user leaves the designed volume field empty")
public void the_user_leaves_the_designed_volume_field_empty() {
chemicalProppantEmailDelPage.leaveDesignedVolumeFieldEmpty();
}
@Then("there should be no validation errors during the process")
public void there_should_be_no_validation_errors_during_the_process() {
chemicalProppantEmailDelPage.hasValidationErrors();
}
@Then("the user remains on the email setup screen")
public void the_user_remains_on_the_email_setup_screen() {
chemicalProppantEmailDelPage.isOnEmailSetupScreen();
}
@When("the user clicks save")
public void the_user_clicks_save() {
chemicalProppantEmailDelPage.clicksSave();
}
@When("the user fills in the required fields")
public void the_user_fills_in_the_required_fields() {
chemicalProppantEmailDelPage.fillInRequiredFields();
}
@When("the user leaves the chemical name field empty")
public void the_user_leaves_the_chemical_name_field_empty() {
chemicalProppantEmailDelPage.leaveChemicalNameFieldEmpty();
}
@Then("the user remains on the chemical delivery tracking screen")
public void the_user_remains_on_the_chemical_delivery_tracking_screen() {
chemicalProppantEmailDelPage.isOnChemicalDeliveryTrackingScreen();
}
@When("the user clicks on the {string} dropdown")
public void the_user_clicks_on_the_dropdown(String dropdown) {
chemicalProppantEmailDelPage.clicksDropdown(dropdown);
}
@Then("the {string} dropdown displays all available {string}")
public void the_dropdown_displays_all_available(String dropdown, String options) {
chemicalProppantEmailDelPage.doesDropdownDisplayAllAvailableOptions(dropdown, options);
}
@Then("the second chemical should be added the form resets for new entry")
public void the_second_chemical_should_be_added_the_form_resets_for_new_entry() {
chemicalProppantEmailDelPage.isSecondChemicalAdded();
chemicalProppantEmailDelPage.isFormResetForNewEntry();
}
@When("the user clicks on the add proppant button")
public void the_user_clicks_on_the_add_proppant_button() {
chemicalProppantEmailDelPage.clicksAddProppantButton();
}
@Then("the user remains on the proppant setup screen")
public void the_user_remains_on_the_proppant_setup_screen() {
chemicalProppantEmailDelPage.isOnProppantSetupScreen();
}
@Then("the delivery record is added successfully")
public void the_delivery_record_is_added_successfully() {
chemicalProppantEmailDelPage.isDeliveryRecordAddedSuccessfully();
}
}