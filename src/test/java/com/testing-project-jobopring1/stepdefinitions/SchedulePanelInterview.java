package com.testing-project-jobopring1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testing-project-jobopring1.pages.SchedulePanelInterviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SchedulePanelInterview extends DriverFactory {
SchedulePanelInterviewPage schedulePanelInterviewPage = new SchedulePanelInterviewPage(driver);
@Given("the recruiter is on the Schedule Interview section")
public void the_recruiter_is_on_the_schedule_interview_section() {
schedulePanelInterviewPage.navigateToScheduleInterviewSection();
}
@When("the recruiter clicks on Create Interview")
public void the_recruiter_clicks_on_create_interview() {
schedulePanelInterviewPage.clicksCreateInterview();
}
@When("the recruiter selects {string} from the dropdown")
public void the_recruiter_selects_from_the_dropdown(String jobOpening) {
schedulePanelInterviewPage.selectJobOpening(jobOpening);
}
@When("the recruiter selects {string} from the available options")
public void the_recruiter_selects_from_the_available_options(String location) {
schedulePanelInterviewPage.selectLocation(location);
}
@When("the recruiter enters the Candidate's email address {string} and selects the candidate")
public void the_recruiter_enters_the_candidates_email_address_and_selects_the_candidate(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmail(candidateEmail);
}
@When("the recruiter chooses the {string}")
public void the_recruiter_chooses_the(String panelOption) {
schedulePanelInterviewPage.choosePanelOption(panelOption);
}
@When("the recruiter selects {string} and {string}")
public void the_recruiter_selects_and(String interviewDate, String startTime) {
schedulePanelInterviewPage.selectInterviewDateAndStartTime(interviewDate, startTime);
}
// DUPLICATE: @When("the recruiter selects {string} and {string}")
public void the_recruiter_selects_and(String attendees, String interviewRound) {
schedulePanelInterviewPage.selectAttendeesAndInterviewRound(attendees, interviewRound);
}
@When("the recruiter selects {string}")
public void the_recruiter_selects(String interviewProvider) {
schedulePanelInterviewPage.selectInterviewProvider(interviewProvider);
}
@When("the recruiter clicks on Next")
public void the_recruiter_clicks_on_next() {
schedulePanelInterviewPage.clicksNext();
}
@When("the recruiter attaches {string}")
public void the_recruiter_attaches(String requiredFiles) {
schedulePanelInterviewPage.attachFiles(requiredFiles);
}
@When("the recruiter clicks on Confirm and Send")
public void the_recruiter_clicks_on_confirm_and_send() {
schedulePanelInterviewPage.clicksConfirmAndSend();
}
@Then("the system displays a confirmation message for the scheduled interview")
public void the_system_displays_a_confirmation_message_for_the_scheduled_interview() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@Then("all optional fields are saved and displayed correctly in the interview details")
public void all_optional_fields_are_saved_and_displayed_correctly_in_the_interview_details() {
schedulePanelInterviewPage.areOptionalFieldsDisplayedCorrectly();
}
@Then("notifications are sent to all participants with the additional information included")
public void notifications_are_sent_to_all_participants_with_the_additional_information_included() {
schedulePanelInterviewPage.areNotificationsSent();
}
@Then("the interview appears in the calendar of all attendees with all details")
public void the_interview_appears_in_the_calendar_of_all_attendees_with_all_details() {
schedulePanelInterviewPage.isInterviewInCalendar();
}
@Then("the candidate receives an email notification with all details")
public void the_candidate_receives_an_email_notification_with_all_details() {
schedulePanelInterviewPage.isEmailNotificationReceived();
}
@Then("the recruiter can view the scheduled interview in their dashboard with all information")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard_with_all_information() {
schedulePanelInterviewPage.isInterviewVisibleInDashboard();
}
@When("the recruiter selects a scheduled panel interview to edit")
public void the_recruiter_selects_a_scheduled_panel_interview_to_edit() {
schedulePanelInterviewPage.selectScheduledInterviewToEdit();
}
@When("the recruiter clicks on Edit Interview")
public void the_recruiter_clicks_on_edit_interview() {
schedulePanelInterviewPage.clicksEditInterview();
}
@When("the recruiter makes changes to the Interview Date, Start Time, or Attendees")
public void the_recruiter_makes_changes_to_the_interview_date_start_time_or_attendees() {
schedulePanelInterviewPage.makeChangesToInterviewDetails();
}
@When("the recruiter clicks on Save Changes")
public void the_recruiter_clicks_on_save_changes() {
schedulePanelInterviewPage.clicksSaveChanges();
}
@Then("the system displays a confirmation message indicating that the interview has been updated")
public void the_system_displays_a_confirmation_message_indicating_that_the_interview_has_been_updated() {
schedulePanelInterviewPage.isUpdateConfirmationMessageDisplayed();
}
@Then("the updated interview details are reflected in the system")
public void the_updated_interview_details_are_reflected_in_the_system() {
schedulePanelInterviewPage.isUpdatedInterviewDetailsReflected();
}
@Then("notifications are sent to all attendees regarding the changes")
public void notifications_are_sent_to_all_attendees_regarding_the_changes() {
schedulePanelInterviewPage.areChangeNotificationsSent();
}
@Then("the candidate receives an email notification with updated interview details")
public void the_candidate_receives_an_email_notification_with_updated_interview_details() {
schedulePanelInterviewPage.isUpdatedEmailNotificationReceived();
}
@Then("the recruiter can view the updated interview in their dashboard")
public void the_recruiter_can_view_the_updated_interview_in_their_dashboard() {
schedulePanelInterviewPage.isUpdatedInterviewVisibleInDashboard();
}
@When("the recruiter selects a scheduled panel interview to cancel")
public void the_recruiter_selects_a_scheduled_panel_interview_to_cancel() {
schedulePanelInterviewPage.selectScheduledInterviewToCancel();
}
@When("the recruiter clicks on Cancel Interview")
public void the_recruiter_clicks_on_cancel_interview() {
schedulePanelInterviewPage.clicksCancelInterview();
}
@When("the recruiter confirms the cancellation")
public void the_recruiter_confirms_the_cancellation() {
schedulePanelInterviewPage.confirmCancellation();
}
@Then("the system displays a confirmation message indicating that the interview has been canceled")
public void the_system_displays_a_confirmation_message_indicating_that_the_interview_has_been_canceled() {
schedulePanelInterviewPage.isCancellationConfirmationMessageDisplayed();
}
@Then("the interview is removed from the scheduled interviews list")
public void the_interview_is_removed_from_the_scheduled_interviews_list() {
schedulePanelInterviewPage.isInterviewInScheduledList();
}
@Then("notifications are sent to all attendees regarding the cancellation")
public void notifications_are_sent_to_all_attendees_regarding_the_cancellation() {
schedulePanelInterviewPage.areCancellationNotificationsSent();
}
@Then("the candidate receives an email notification about the cancellation")
public void the_candidate_receives_an_email_notification_about_the_cancellation() {
schedulePanelInterviewPage.isCancellationEmailNotificationReceived();
}
@When("the user leaves the Job Opening field empty")
public void the_user_leaves_the_job_opening_field_empty() {
schedulePanelInterviewPage.leaveJobOpeningFieldEmpty();
}
@Then("the system displays an error message indicating that the Job Opening must be selected")
public void the_system_displays_an_error_message_indicating_that_the_job_opening_must_be_selected() {
schedulePanelInterviewPage.isJobOpeningErrorMessageDisplayed();
}
@Then("the user remains on the scheduling page")
public void the_user_remains_on_the_scheduling_page() {
schedulePanelInterviewPage.isOnSchedulingPage();
}
@Then("no interview is scheduled")
public void no_interview_is_scheduled() {
schedulePanelInterviewPage.isInterviewScheduled();
}
@When("the user leaves the Candidate field empty")
public void the_user_leaves_the_candidate_field_empty() {
schedulePanelInterviewPage.leaveCandidateFieldEmpty();
}
@Then("the system displays an error message indicating that a Candidate must be selected")
public void the_system_displays_an_error_message_indicating_that_a_candidate_must_be_selected() {
schedulePanelInterviewPage.isCandidateErrorMessageDisplayed();
}
@When("the user leaves the Interview Date field empty")
public void the_user_leaves_the_interview_date_field_empty() {
schedulePanelInterviewPage.leaveInterviewDateFieldEmpty();
}
@Then("the system displays an error message indicating that an Interview Date must be selected")
public void the_system_displays_an_error_message_indicating_that_an_interview_date_must_be_selected() {
schedulePanelInterviewPage.isInterviewDateErrorMessageDisplayed();
}
@When("the user leaves the Start Time field empty")
public void the_user_leaves_the_start_time_field_empty() {
schedulePanelInterviewPage.leaveStartTimeFieldEmpty();
}
@Then("the system displays an error message indicating that a Start Time must be selected")
public void the_system_displays_an_error_message_indicating_that_a_start_time_must_be_selected() {
schedulePanelInterviewPage.isStartTimeErrorMessageDisplayed();
}
@When("the user leaves the Attendees field empty")
public void the_user_leaves_the_attendees_field_empty() {
schedulePanelInterviewPage.leaveAttendeesFieldEmpty();
}
@Then("the system displays an error message indicating that at least one Attendee must be selected")
public void the_system_displays_an_error_message_indicating_that_at_least_one_attendee_must_be_selected() {
schedulePanelInterviewPage.isAttendeeErrorMessageDisplayed();
}
@When("the user selects an Interview Date {string} and Start Time {string} that overlaps with an existing interview")
public void the_user_selects_an_interview_date_and_start_time_that_overlaps_with_an_existing_interview(String interviewDate, String startTime) {
schedulePanelInterviewPage.selectOverlappingInterviewDateAndStartTime(interviewDate, startTime);
}
@Then("the system displays an error message indicating that the interview time overlaps with an existing interview")
public void the_system_displays_an_error_message_indicating_that_the_interview_time_overlaps_with_an_existing_interview() {
schedulePanelInterviewPage.isOverlappingInterviewErrorMessageDisplayed();
}
@When("the user enters an invalid email format for the Candidate {string}")
public void the_user_enters_an_invalid_email_format_for_the_candidate(String email) {
schedulePanelInterviewPage.enterInvalidCandidateEmail(email);
}
@Then("the system displays an error message indicating that the email format is invalid")
public void the_system_displays_an_error_message_indicating_that_the_email_format_is_invalid() {
schedulePanelInterviewPage.isInvalidEmailFormatErrorMessageDisplayed();
}
@When("the user enters a candidate email address {string}")
public void the_user_enters_a_candidate_email_address(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmail(candidateEmail);
}
@Then("the system accepts the email address without errors")
public void the_system_accepts_the_email_address_without_errors() {
schedulePanelInterviewPage.isEmailAccepted();
}
@Then("the interview can be scheduled successfully")
public void the_interview_can_be_scheduled_successfully() {
schedulePanelInterviewPage.isInterviewScheduledSuccessfully();
}
@Then("notifications are sent to all participants")
public void notifications_are_sent_to_all_participants() {
schedulePanelInterviewPage.areNotificationsSentToParticipants();
}

@Given("I schedule a panel interview with multiple attendees")
public void i_schedule_a_panel_interview_with_multiple_attendees() {
driver = DriverFactory.getDriver();
}
// DUPLICATE: @When("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String option) {
schedulePanelInterviewPage.selectFromDropdown(option);
}
@When("the user chooses the panel interview option")
public void the_user_chooses_the_panel_interview_option() {
schedulePanelInterviewPage.choosePanelInterviewOption();
}
@When("the user selects a job opening")
public void the_user_selects_a_job_opening() {
schedulePanelInterviewPage.selectJobOpening();
}
@When("the user selects {string}")
public void the_user_selects(String option) {
schedulePanelInterviewPage.selectOption(option);
}
@When("the user selects attendees {string} interview round {string}")
public void the_user_selects_attendees_interview_round(String attendees, String round) {
schedulePanelInterviewPage.selectAttendeesAndRound(attendees, round);
}
@Then("the email should include a calendar invite for the interview")
public void the_email_should_include_a_calendar_invite_for_the_interview() {
schedulePanelInterviewPage.isCalendarInviteIncluded();
}
@When("the user selects the interview date")
public void the_user_selects_the_interview_date() {
schedulePanelInterviewPage.selectInterviewDate();
}
@When("the recruiter selects the interview date {string}")
public void the_recruiter_selects_the_interview_date(String date) {
schedulePanelInterviewPage.recruiterSelectsInterviewDate(date);
}
@When("I select the minimum number of attendees as {string}")
public void i_select_the_minimum_number_of_attendees_as(String minAttendees) {
schedulePanelInterviewPage.selectMinimumAttendees(minAttendees);
}
@When("the user selects the cidate")
public void the_user_selects_the_cidate() {
schedulePanelInterviewPage.selectCidate();
}
@When("I enter {string} select the cidate")
public void i_enter_select_the_cidate(String cidate) {
schedulePanelInterviewPage.enterAndSelectCidate(cidate);
}
@When("the user selects a location")
public void the_user_selects_a_location() {
schedulePanelInterviewPage.selectLocation();
}
@When("the user clicks on create interview")
public void the_user_clicks_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
@When("the user selects a job opening from the dropdown")
public void the_user_selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.selectJobOpeningFromDropdown();
}
@When("the user selects the {string} {string}")
public void the_user_selects_the(String firstOption, String secondOption) {
schedulePanelInterviewPage.selectOptions(firstOption, secondOption);
}
@When("the user clicks on confirm send")
public void the_user_clicks_on_confirm_send() {
schedulePanelInterviewPage.clickConfirmSend();
}
@When("I select {string} {string}")
public void i_select(String firstOption, String secondOption) {
schedulePanelInterviewPage.select(firstOption, secondOption);
}
@When("the recruiter enters {string}")
public void the_recruiter_enters(String input) {
schedulePanelInterviewPage.recruiterEnters(input);
}
@Then("all attendees receive notifications")
public void all_attendees_receive_notifications() {
schedulePanelInterviewPage.areAllAttendeesNotified();
}
@When("the user selects {string} from the available options")
public void the_user_selects_from_the_available_options(String option) {
schedulePanelInterviewPage.selectFromAvailableOptions(option);
}
@When("the user selects {string} from the cidates")
public void the_user_selects_from_the_cidates(String cidate) {
schedulePanelInterviewPage.selectFromCidates(cidate);
}
@When("the recruiter selects the maximum number of attendees {string}")
public void the_recruiter_selects_the_maximum_number_of_attendees(String maxAttendees) {
schedulePanelInterviewPage.recruiterSelectsMaximumAttendees(maxAttendees);
}
@When("I select {string}")
public void i_select(String option) {
schedulePanelInterviewPage.select(option);
}
@When("I choose the {string}")
public void i_choose_the(String option) {
schedulePanelInterviewPage.choose(option);
}
@When("I clickElement on next")
public void i_click_on_next() {
schedulePanelInterviewPage.clickNext();
}
@When("the user enters {string} as the cidate's email address")
public void the_user_enters_as_the_cidate_email_address(String email) {
schedulePanelInterviewPage.enterCidateEmail(email);
}
@Then("the recruiter can view the scheduled interview in their dashboard")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard() {
schedulePanelInterviewPage.isInterviewVisibleInDashboard();
}
@When("the user enters the cidate's email address selects the cidate")
public void the_user_enters_the_cidate_email_address_selects_the_cidate() {
schedulePanelInterviewPage.enterAndSelectCidateEmail();
}
@When("the recruiter selects the start time {string}")
public void the_recruiter_selects_the_start_time(String startTime) {
schedulePanelInterviewPage.recruiterSelectsStartTime(startTime);
}
@When("the user enters the cidate's email address")
public void the_user_enters_the_cidate_email_address() {
schedulePanelInterviewPage.enterCidateEmailAddress();
}
@Then("the email should contain the correct interview date, start time, location")
public void the_email_should_contain_the_correct_interview_date_start_time_location() {
schedulePanelInterviewPage.isEmailContentCorrect();
}
@When("the user selects {string} as the location")
public void the_user_selects_as_the_location(String location) {
schedulePanelInterviewPage.selectLocation(location);
}
@When("the recruiter selects the cidate")
public void the_recruiter_selects_the_cidate() {
schedulePanelInterviewPage.recruiterSelectsCidate();
}
@Then("each attendee should receive an email notification with the interview details")
public void each_attendee_should_receive_an_email_notification_with_the_interview_details() {
schedulePanelInterviewPage.areAttendeesNotifiedWithDetails();
}
@When("I clickElement on confirm send")
public void i_click_on_confirm_send() {
schedulePanelInterviewPage.clickConfirmSend();
}
@When("the user enters {string}")
public void the_user_enters(String input) {
schedulePanelInterviewPage.enter(input);
}
@Then("the system displays an error message indicating that the interview date cannot be in the past")
public void the_system_displays_an_error_message_indicating_that_the_interview_date_cannot_be_in_the_past() {
schedulePanelInterviewPage.isErrorMessageDisplayed();
}
@When("the user selects {string} {string}")
public void the_user_selects(String firstOption, String secondOption) {
schedulePanelInterviewPage.select(firstOption, secondOption);
}
@Then("the cidate receives an email notification with interview details")
public void the_cidate_receives_an_email_notification_with_interview_details() {
schedulePanelInterviewPage.isCidateNotifiedWithDetails();
}
@When("the user enters the cidate's email address {string}")
public void the_user_enters_the_cidate_email_address(String email) {
schedulePanelInterviewPage.enterCidateEmailAddress(email);
}
@When("the user clicks on next")
public void the_user_clicks_on_next() {
schedulePanelInterviewPage.clickNext();
}
@When("the user selects the interview date start time")
public void the_user_selects_the_interview_date_start_time() {
schedulePanelInterviewPage.selectInterviewDateAndStartTime();
}
@Then("the interview appears in the calendar of all attendees")
public void the_interview_appears_in_the_calendar_of_all_attendees() {
schedulePanelInterviewPage.isInterviewInAllAttendeesCalendar();
}
@When("the user chooses the {string} option")
public void the_user_chooses_the_option(String option) {
schedulePanelInterviewPage.chooseOption(option);
}
@When("the user fills in optional fields with {string} {string}")
public void the_user_fills_in_optional_fields_with(String field1, String field2) {
schedulePanelInterviewPage.fillOptionalFields(field1, field2);
}
@When("the user selects a location from the available options")
public void the_user_selects_a_location_from_the_available_options() {
schedulePanelInterviewPage.selectLocationFromAvailableOptions();
}
@When("I attach {string}")
public void i_attach(String file) {
schedulePanelInterviewPage.attachFile(file);
}
@When("the user enters {string} selects the cidate")
public void the_user_enters_selects_the_cidate(String cidate) {
schedulePanelInterviewPage.enterAndSelectCidate(cidate);
}
@When("the user attaches required files")
public void the_user_attaches_required_files() {
schedulePanelInterviewPage.attachRequiredFiles();
}
@When("I clickElement on create interview")
public void i_click_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
}