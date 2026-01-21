package com.testing-project-jobopring1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testing-project-jobopring1.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload icon")
public void the_user_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("a success confirmation message is displayed to the user")
public void a_success_confirmation_message_is_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@Then("the upload should complete and confirm success")
public void the_upload_should_complete_and_confirm_success() {
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@When("the recruiter browses and selects a valid candidate profile file of 2MB")
public void the_recruiter_browses_and_selects_a_valid_candidate_profile_file_of_2MB() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("valid_2MB_profile.pdf");
}
@When("the user browses and selects a valid candidate profile file with a long filename {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_a_long_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}
@When("the user browses and selects a valid candidate profile file in {string} format")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_in_format(String fileFormat) {
uploadNewCandidateProfilePage.selectCandidateProfileFile("valid_candidate_profile" + fileFormat);
}
@When("the user browses and selects a valid candidate profile file with UTF-8 encoding {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_UTF_8_encoding(String file) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(file);
}
@When("the user browses and selects a valid candidate profile file with a .doc extension {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_a_doc_extension(String fileExtension) {
uploadNewCandidateProfilePage.selectCandidateProfileFile("valid_candidate_profile" + fileExtension);
}
@When("the user browses and selects a valid candidate profile file with text in Spanish {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_text_in_spanish(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the user browses and selects an unsupported file type {string}")
public void the_user_browses_and_selects_an_unsupported_file_type(String fileType) {
uploadNewCandidateProfilePage.selectCandidateProfileFile("invalid_file" + fileType);
}
@Then("the system should display an error message indicating the file type is not supported")
public void the_system_should_display_an_error_message_indicating_the_file_type_is_not_supported() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user browses and selects a file that exceeds the size limit")
public void the_user_browses_and_selects_a_file_that_exceeds_the_size_limit() {
uploadNewCandidateProfilePage.selectCandidateProfileFile("large_file.pdf");
}
@Then("the system should display an error message indicating the file exceeds the maximum size limit")
public void the_system_should_display_an_error_message_indicating_the_file_exceeds_the_maximum_size_limit() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the recruiter does not select any file")
public void the_recruiter_does_not_select_any_file() {
uploadNewCandidateProfilePage.clearFileSelection();
}
@Then("an error message is displayed indicating that no file was selected")
public void an_error_message_is_displayed_indicating_that_no_file_was_selected() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user simulates a network failure during the upload process")
public void the_user_simulates_a_network_failure_during_the_upload_process() {
uploadNewCandidateProfilePage.simulateNetworkFailure();
}
@Then("the user should see an error message indicating a network failure occurred")
public void the_user_should_see_an_error_message_indicating_a_network_failure_occurred() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the upload process times out")
public void the_upload_process_times_out() {
uploadNewCandidateProfilePage.simulateTimeout();
}
@Then("an error message is displayed indicating the upload process timed out")
public void an_error_message_is_displayed_indicating_the_upload_process_timed_out() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user browses and selects a corrupted candidate profile file {string}")
public void the_user_browses_and_selects_a_corrupted_candidate_profile_file(String corruptedFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(corruptedFile);
}
@Then("an error message is displayed indicating the file is corrupted and cannot be uploaded")
public void an_error_message_is_displayed_indicating_the_file_is_corrupted_and_cannot_be_uploaded() {
uploadNewCandidateProfilePage.isErrorMessageDisplayed();
}
@When("the user browses and selects a valid candidate profile file with special characters in the filename {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_special_characters_in_the_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}
@Then("the upload process completes successfully")
public void the_upload_process_completes_successfully() {
uploadNewCandidateProfilePage.isUploadSuccessful();
}
@When("the user browses and selects a valid candidate profile file with a very short filename {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_with_a_very_short_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}
@When("the recruiter browses and selects a valid candidate profile file with spaces in the filename {string}")
public void the_recruiter_browses_and_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}

@Given("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectValidCandidateProfileFile();
}
@When("i clickElement on the upload icon")
public void i_click_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@Then("a success confirmation message is displayed to the recruiter")
public void a_success_confirmation_message_is_displayed_to_the_recruiter() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("does not select any file")
public void does_not_select_any_file() {
uploadNewCandidateProfilePage.doesNotSelectAnyFile();
}
@When("i browse select a valid candidate profile file with a .doc extension")
public void i_browse_select_a_valid_candidate_profile_file_with_a_doc_extension() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileWithDocExtension();
}
@When("the user browses selects a valid candidate profile file with a very short filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_very_short_filename() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileWithVeryShortFilename();
}
@Then("the upload process does not initiate")
public void the_upload_process_does_not_initiate() {
uploadNewCandidateProfilePage.isUploadProcessInitiated();
}
@Then("the upload process does not complete successfully")
public void the_upload_process_does_not_complete_successfully() {
uploadNewCandidateProfilePage.isUploadProcessCompletedSuccessfully();
}
@Then("i observe the system's response")
public void i_observe_the_systems_response() {
uploadNewCandidateProfilePage.observeSystemResponse();
}
@When("the user browses selects a corrupted candidate profile file")
public void the_user_browses_selects_a_corrupted_candidate_profile_file() {
uploadNewCandidateProfilePage.browseAndSelectCorruptedCandidateProfileFile();
}
@When("the user browses selects a valid candidate profile file with a long filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_a_long_filename() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileWithLongFilename();
}
@When("i browse select a valid candidate profile file with text in spanish")
public void i_browse_select_a_valid_candidate_profile_file_with_text_in_spanish() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileWithTextInSpanish();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadCloudIcon();
}
@Then("the upload process should complete")
public void the_upload_process_should_complete() {
uploadNewCandidateProfilePage.isUploadProcessCompleted();
}
@Then("i wait for the upload process to complete")
public void i_wait_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@When("the user browses selects a valid candidate profile file with special characters in the filename")
public void the_user_browses_selects_a_valid_candidate_profile_file_with_special_characters_in_the_filename() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileWithSpecialCharacters();
}
@When("i clickElement on the upload button")
public void i_click_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Then("a success confirmation message should be displayed to the user")
public void a_success_confirmation_message_should_be_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the recruiter clicks on the upload button")
public void the_recruiter_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.recruiterClicksUploadButton();
}
@When("the recruiter browses selects a valid candidate profile file with spaces in the filename")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_with_spaces_in_the_filename() {
uploadNewCandidateProfilePage.recruiterBrowsesSelectsCandidateProfileFileWithSpaces();
}
@Then("the upload process should not complete successfully")
public void the_upload_process_should_not_complete_successfully() {
uploadNewCandidateProfilePage.isUploadProcessCompletedSuccessfully();
}
@When("i browse select a valid candidate profile file with utf-8 encoding")
public void i_browse_select_a_valid_candidate_profile_file_with_utf_8_encoding() {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFileWithUtf8Encoding();
}
@When("the user browses selects the {string} candidate profile file")
public void the_user_browses_selects_the_candidate_profile_file(String fileName) {
uploadNewCandidateProfilePage.browseAndSelectCandidateProfileFile(fileName);
}
}