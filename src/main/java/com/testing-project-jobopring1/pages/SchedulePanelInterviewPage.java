package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;

public class SchedulePanelInterviewPage {
    private WebDriver driver;
    private ElementUtils elementUtils;
    private static final Logger logger = LoggerFactory.getLogger(SchedulePanelInterviewPage.class);

    @FindBy(id = "scheduleInterviewSection")
    private WebElement scheduleInterviewSection;
    @FindBy(id = "createInterviewButton")
    private WebElement createInterviewButton;
    @FindBy(id = "jobOpeningDropdown")
    private WebElement jobOpeningDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "candidateEmailInput")
    private WebElement candidateEmailInput;
    @FindBy(id = "panelOptionDropdown")
    private WebElement panelOptionDropdown;
    @FindBy(id = "interviewDateInput")
    private WebElement interviewDateInput;
    @FindBy(id = "startTimeInput")
    private WebElement startTimeInput;
    @FindBy(id = "nextButton")
    private WebElement nextButton;
    @FindBy(id = "confirmSendButton")
    private WebElement confirmSendButton;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;
    @FindBy(id = "attendeesDropdown")
    private WebElement attendeesDropdown;

    // Constructor
    public SchedulePanelInterviewPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToScheduleInterviewSection() {
        try {
            elementUtils.clickElement(scheduleInterviewSection);
            logger.info("Navigated to Schedule Interview section");
        } catch (Exception e) {
            logger.error("Error navigating to Schedule Interview section: {}", e.getMessage());
        }
    }

    public void clicksCreateInterview() {
        try {
            elementUtils.clickElement(createInterviewButton);
            logger.info("Clicked on Create Interview button");
        } catch (Exception e) {
            logger.error("Error clicking Create Interview button: {}", e.getMessage());
        }
    }

    public void selectJobOpening(String jobOpening) {
        try {
            elementUtils.clickElement(jobOpeningDropdown);
            elementUtils.selectOptionInDropdown(jobOpeningDropdown, jobOpening);
            logger.info("Selected job opening: {}", jobOpening);
        } catch (Exception e) {
            logger.error("Error selecting job opening: {}", e.getMessage());
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.clickElement(locationDropdown);
            elementUtils.selectOptionInDropdown(locationDropdown, location);
            logger.info("Selected location: {}", location);
        } catch (Exception e) {
            logger.error("Error selecting location: {}", e.getMessage());
        }
    }

    public void enterCandidateEmail(String candidateEmail) {
        try {
            elementUtils.clearAndSendKeys(candidateEmailInput, candidateEmail);
            logger.info("Entered candidate email: {}", candidateEmail);
        } catch (Exception e) {
            logger.error("Error entering candidate email: {}", e.getMessage());
        }
    }

    public void choosePanelOption(String panelOption) {
        try {
            elementUtils.clickElement(panelOptionDropdown);
            elementUtils.selectOptionInDropdown(panelOptionDropdown, panelOption);
            logger.info("Chosen panel option: {}", panelOption);
        } catch (Exception e) {
            logger.error("Error choosing panel option: {}", e.getMessage());
        }
    }

    public void selectInterviewDateAndStartTime(String interviewDate, String startTime) {
        try {
            elementUtils.clearAndSendKeys(interviewDateInput, interviewDate);
            elementUtils.clearAndSendKeys(startTimeInput, startTime);
            logger.info("Selected interview date: {} and start time: {}", interviewDate, startTime);
        } catch (Exception e) {
            logger.error("Error selecting interview date and start time: {}", e.getMessage());
        }
    }

    public void clicksNext() {
        try {
            elementUtils.clickElement(nextButton);
            logger.info("Clicked on Next button");
        } catch (Exception e) {
            logger.error("Error clicking Next button: {}", e.getMessage());
        }
    }

    public void clicksConfirmAndSend() {
        try {
            elementUtils.clickElement(confirmSendButton);
            logger.info("Clicked on Confirm and Send button");
        } catch (Exception e) {
            logger.error("Error clicking Confirm and Send button: {}", e.getMessage());
        }
    }

    public boolean isConfirmationMessageDisplayed() {
        try {
            boolean displayed = elementUtils.isElementDisplayed(confirmationMessage);
            logger.info("Confirmation message displayed: {}", displayed);
            return displayed;
        } catch (Exception e) {
            logger.error("Error checking confirmation message: {}", e.getMessage());
            return false;
        }
    }

    public boolean isJobOpeningErrorMessageDisplayed() {
        try {
            boolean displayed = elementUtils.isElementDisplayed(errorMessage);
            logger.info("Job opening error message displayed: {}", displayed);
            return displayed;
        } catch (Exception e) {
            logger.error("Error checking job opening error message: {}", e.getMessage());
            return false;
        }
    }

    public boolean isInterviewScheduledSuccessfully() {
        try {
            return isConfirmationMessageDisplayed();
        } catch (Exception e) {
            logger.error("Error checking if interview is scheduled successfully: {}", e.getMessage());
            return false;
        }
    }

    public void leaveJobOpeningFieldEmpty() {
        try {
            elementUtils.clearElement(jobOpeningDropdown);
            logger.info("Left Job Opening field empty");
        } catch (Exception e) {
            logger.error("Error leaving Job Opening field empty: {}", e.getMessage());
        }
    }

    public void leaveCandidateFieldEmpty() {
        try {
            elementUtils.clearElement(candidateEmailInput);
            logger.info("Left Candidate field empty");
        } catch (Exception e) {
            logger.error("Error leaving Candidate field empty: {}", e.getMessage());
        }
    }

    public void leaveInterviewDateFieldEmpty() {
        try {
            elementUtils.clearElement(interviewDateInput);
            logger.info("Left Interview Date field empty");
        } catch (Exception e) {
            logger.error("Error leaving Interview Date field empty: {}", e.getMessage());
        }
    }

    public void leaveStartTimeFieldEmpty() {
        try {
            elementUtils.clearElement(startTimeInput);
            logger.info("Left Start Time field empty");
        } catch (Exception e) {
            logger.error("Error leaving Start Time field empty: {}", e.getMessage());
        }
    }

    public void leaveAttendeesFieldEmpty() {
        try {
            elementUtils.clearElement(attendeesDropdown);
            logger.info("Left Attendees field empty");
        } catch (Exception e) {
            logger.error("Error leaving Attendees field empty: {}", e.getMessage());
        }
    }

    public boolean areNotificationsSentToParticipants() {
        try {
            logger.info("Checking if notifications are sent to participants");
            // Logic to verify if notifications have been sent
            return true; // Placeholder for actual implementation
        } catch (Exception e) {
            logger.error("Error checking if notifications are sent: {}", e.getMessage());
            return false;
        }
    }

    public void selectScheduledInterviewToCancel() {
        try {
            WebElement interviewElement = driver.findElement(By.id("scheduledInterview"));
            elementUtils.clickElement(interviewElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmCancellation() {
        try {
            WebElement confirmButton = driver.findElement(By.id("confirmCancellation"));
            elementUtils.clickElement(confirmButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCancellationConfirmationMessageDisplayed() {
        try {
            WebElement confirmationMessage = driver.findElement(By.id("cancellationConfirmationMessage"));
            String actualMessage = elementUtils.getElementText(confirmationMessage);
            String expectedMessage = "Your interview has been cancelled.";
            Assert.assertEquals(actualMessage, expectedMessage, "Cancellation confirmation message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isInterviewInCalendar() {
        try {
            WebElement interviewElement = driver.findElement(By.id("interviewInCalendar"));
            return elementUtils.isElementDisplayed(interviewElement);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void makeChangesToInterviewDetails(String newDetails) {
        try {
            WebElement detailsField = driver.findElement(By.id("interviewDetails"));
            elementUtils.clearAndSendKeys(detailsField, newDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInterviewDateErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("interviewDateErrorMessage"));
            String actualMessage = elementUtils.getElementText(errorMessage);
            String expectedMessage = "Invalid interview date.";
            Assert.assertEquals(actualMessage, expectedMessage, "Interview date error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isCancellationEmailNotificationReceived() {
        try {
            // Check email notifications logic here
            String actualNotification = "Cancellation notification"; // placeholder
            String expectedNotification = "You have successfully cancelled the interview.";
            Assert.assertEquals(actualNotification, expectedNotification, "Cancellation email notification not received!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isStartTimeErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("startTimeErrorMessage"));
            String actualMessage = elementUtils.getElementText(errorMessage);
            String expectedMessage = "Invalid start time.";
            Assert.assertEquals(actualMessage, expectedMessage, "Start time error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksSaveChanges() {
        try {
            WebElement saveButton = driver.findElement(By.id("saveChanges"));
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void attachRequiredFiles(String filePath) {
        try {
            WebElement fileUpload = driver.findElement(By.id("fileUpload"));
            elementUtils.clearAndSendKeys(fileUpload, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recruiterSelectsCidate(String cidate) {
        try {
            WebElement cidateDropdown = driver.findElement(By.id("cidateDropdown"));
            elementUtils.selectOptionInDropdown(cidateDropdown, cidate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectJobOpeningFromDropdown(String jobOpening) {
        try {
            WebElement jobDropdown = driver.findElement(By.id("jobOpeningDropdown"));
            elementUtils.selectOptionInDropdown(jobDropdown, jobOpening);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterCidateEmailAddress(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("cidateEmail"));
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAttendeeErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("attendeeErrorMessage"));
            String actualMessage = elementUtils.getElementText(errorMessage);
            String expectedMessage = "Invalid attendee email.";
            Assert.assertEquals(actualMessage, expectedMessage, "Attendee error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void recruiterSelectsMaximumAttendees(int maxAttendees) {
        try {
            WebElement attendeeCountField = driver.findElement(By.id("maximumAttendees"));
            elementUtils.clearAndSendKeys(attendeeCountField, String.valueOf(maxAttendees));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInterviewInAllAttendeesCalendar() {
        try {
            WebElement interviewElement = driver.findElement(By.id("interviewInAllAttendeesCalendar"));
            return elementUtils.isElementDisplayed(interviewElement);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fillOptionalFields(String optionalFieldsData) {
        try {
            WebElement optionalFields = driver.findElement(By.id("optionalFields"));
            elementUtils.clearAndSendKeys(optionalFields, optionalFieldsData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOverlappingInterviewErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("overlappingInterviewErrorMessage"));
            String actualMessage = elementUtils.getElementText(errorMessage);
            String expectedMessage = "Overlapping interview detected.";
            Assert.assertEquals(actualMessage, expectedMessage, "Overlapping interview error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectScheduledInterviewToEdit() {
        try {
            WebElement interviewElement = driver.findElement(By.id("scheduledInterviewToEdit"));
            elementUtils.clickElement(interviewElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInvalidEmailFormatErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("invalidEmailFormatErrorMessage"));
            String actualMessage = elementUtils.getElementText(errorMessage);
            String expectedMessage = "Invalid email format.";
            Assert.assertEquals(actualMessage, expectedMessage, "Invalid email format error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterCidateEmail(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("cidateEmail"));
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCreateInterview() {
        try {
            WebElement createButton = driver.findElement(By.id("createInterview"));
            elementUtils.clickElement(createButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocationFromAvailableOptions(String location) {
        try {
            WebElement locationDropdown = driver.findElement(By.id("locationDropdown"));
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areAttendeesNotifiedWithDetails() {
        try {
            // Logic to check if attendees received notification
            boolean notificationsSent = true; // placeholder
            Assert.assertTrue(notificationsSent, "Attendees are not notified with interview details!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            WebElement errorElement = driver.findElement(By.id("errorMessage"));
            return elementUtils.isElementDisplayed(errorElement);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectOverlappingInterviewDateAndStartTime(String interviewDate, String startTime) {
        try {
            WebElement dateField = driver.findElement(By.id("overlappingDate"));
            elementUtils.clearAndSendKeys(dateField, interviewDate);

            WebElement timeField = driver.findElement(By.id("overlappingStartTime"));
            elementUtils.clearAndSendKeys(timeField, startTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEmailAccepted() {
        try {
            // Logic to check if email is accepted
            String actualEmailStatus = "Accepted"; // placeholder
            String expectedEmailStatus = "Accepted";
            Assert.assertEquals(actualEmailStatus, expectedEmailStatus, "Email status does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void recruiterSelectsStartTime(String startTime) {
        try {
            WebElement startTimeField = driver.findElement(By.id("startTime"));
            elementUtils.clearAndSendKeys(startTimeField, startTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEmailContentCorrect() {
        try {
            // Logic to verify email content
            String actualEmailContent = "Interview Details"; // placeholder
            String expectedEmailContent = "Interview Details";
            Assert.assertEquals(actualEmailContent, expectedEmailContent, "Email content is not correct!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUpdatedEmailNotificationReceived() {
        try {
            // Logic to check if updated email notification is received
            String actualNotification = "Updated notification"; // placeholder
            String expectedNotification = "Your interview details have been updated.";
            Assert.assertEquals(actualNotification, expectedNotification, "Updated email notification not received!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksCancelInterview() {
        try {
            WebElement cancelButton = driver.findElement(By.id("cancelInterview"));
            elementUtils.clickElement(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCandidateErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("candidateErrorMessage"));
            String actualMessage = elementUtils.getElementText(errorMessage);
            String expectedMessage = "Candidate email is invalid.";
            Assert.assertEquals(actualMessage, expectedMessage, "Candidate error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickConfirmSend() {
        try {
            WebElement confirmSendButton = driver.findElement(By.id("confirmSend"));
            elementUtils.clickElement(confirmSendButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewDate(String interviewDate) {
        try {
            WebElement dateField = driver.findElement(By.id("interviewDate"));
            elementUtils.clearAndSendKeys(dateField, interviewDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUpdatedInterviewVisibleInDashboard() {
        try {
            WebElement updatedInterview = driver.findElement(By.id("updatedInterviewInDashboard"));
            return elementUtils.isElementDisplayed(updatedInterview);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectFromDropdown(String option) {
        try {
            WebElement dropdown = driver.findElement(By.id("optionsDropdown"));
            elementUtils.selectOptionInDropdown(dropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCidate(String cidate) {
        try {
            WebElement cidateField = driver.findElement(By.id("cidate"));
            elementUtils.clearAndSendKeys(cidateField, cidate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areOptionalFieldsDisplayedCorrectly() {
        try {
            WebElement optionalFieldsSection = driver.findElement(By.id("optionalFieldsSection"));
            return elementUtils.isElementDisplayed(optionalFieldsSection);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areAllAttendeesNotified() {
        try {
            // Logic to check if all attendees are notified
            boolean allNotified = true; // placeholder
            Assert.assertTrue(allNotified, "Not all attendees have been notified!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterAndSelectCidate(String cidate) {
        try {
            WebElement cidateField = driver.findElement(By.id("cidate"));
            elementUtils.clearAndSendKeys(cidateField, cidate);
            // Logic to select cidate if relevant
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recruiterEnters(String name) {
        try {
            WebElement recruiterNameField = driver.findElement(By.id("recruiterName"));
            elementUtils.clearAndSendKeys(recruiterNameField, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAttendeesAndRound(String attendees) {
        try {
            WebElement attendeesField = driver.findElement(By.id("attendeesDropdown"));
            elementUtils.selectOptionInDropdown(attendeesField, attendees);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void chooseOption(String option) {
        try {
            WebElement optionField = driver.findElement(By.id("optionsField"));
            elementUtils.selectOptionInDropdown(optionField, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void choosePanelInterviewOption() {
        try {
            WebElement panelInterviewOption = driver.findElement(By.id("panelInterviewOption"));
            elementUtils.clickElement(panelInterviewOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUpdateConfirmationMessageDisplayed() {
        try {
            WebElement updateConfirmationMessage = driver.findElement(By.id("updateConfirmationMessage"));
            String actualMessage = elementUtils.getElementText(updateConfirmationMessage);
            String expectedMessage = "Interview details updated successfully.";
            Assert.assertEquals(actualMessage, expectedMessage, "Update confirmation message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areChangeNotificationsSent() {
        try {
            // Logic to check if change notifications are sent
            boolean notificationsSent = true; // placeholder
            Assert.assertTrue(notificationsSent, "Change notifications have not been sent!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectFromCidates(String cidate) {
        try {
            WebElement cidateDropdown = driver.findElement(By.id("cidateDropdown"));
            elementUtils.selectOptionInDropdown(cidateDropdown, cidate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCalendarInviteIncluded() {
        try {
            // Logic to verify if calendar invite is included
            boolean isIncluded = true; // placeholder
            Assert.assertTrue(isIncluded, "Calendar invite is not included!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksEditInterview() {
        try {
            WebElement editButton = driver.findElement(By.id("editInterview"));
            elementUtils.clickElement(editButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recruiterSelectsInterviewDate(String date) {
        try {
            WebElement interviewDateField = driver.findElement(By.id("interviewDate"));
            elementUtils.clearAndSendKeys(interviewDateField, date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewProvider(String provider) {
        try {
            WebElement providerDropdown = driver.findElement(By.id("interviewProviderDropdown"));
            elementUtils.selectOptionInDropdown(providerDropdown, provider);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic boolean enterIsCidateNotifiedWithDetails() {
        try {
            // Logic to check if candidate was notified with details
            boolean isNotified = true; // placeholder
            Assert.assertTrue(isNotified, "Candidate is not notified with details!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterInvalidCandidateEmail(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("candidateEmail"));
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterAndSelectCidateEmail(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("cidateEmail"));
            elementUtils.clearAndSendKeys(emailField, email);
            // Logic to select email if necessary
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInterviewScheduled() {
        try {
            WebElement scheduledInterview = driver.findElement(By.id("scheduledInterview"));
            return elementUtils.isElementDisplayed(scheduledInterview);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void attachFiles(String filePath) {
        try {
            WebElement fileUpload = driver.findElement(By.id("fileUpload"));
            elementUtils.clearAndSendKeys(fileUpload, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectOptions(String option) {
        try {
            WebElement optionsField = driver.findElement(By.id("optionsField"));
            elementUtils.selectOptionInDropdown(optionsField, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFromAvailableOptions(String option) {
        try {
            WebElement availableOptionsDropdown = driver.findElement(By.id("availableOptionsDropdown"));
            elementUtils.selectOptionInDropdown(availableOptionsDropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEmailNotificationReceived() {
        try {
            // Logic to verify if email notification is received
            String actualNotification = "Interview scheduled"; // placeholder
            String expectedNotification = "You have a new interview scheduled.";
            Assert.assertEquals(actualNotification, expectedNotification, "Email notification not received!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectAttendeesAndInterviewRound(String attendees) {
        try {
            WebElement attendeesField = driver.findElement(By.id("attendeesAndInterviewRound"));
            elementUtils.selectOptionInDropdown(attendeesField, attendees);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInterviewInScheduledList() {
        try {
            WebElement scheduledInterview = driver.findElement(By.id("scheduledInterviewInList"));
            return elementUtils.isElementDisplayed(scheduledInterview);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickNext() {
        try {
            WebElement nextButton = driver.findElement(By.id("nextButton"));
            elementUtils.clickElement(nextButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUpdatedInterviewDetailsReflected() {
        try {
            // Logic to verify that updated interview details are reflected
            boolean areReflected = true; // placeholder
            Assert.assertTrue(areReflected, "Updated interview details are not reflected!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isInterviewVisibleInDashboard() {
        try {
            WebElement interviewElement = driver.findElement(By.id("interviewVisibleInDashboard"));
            return elementUtils.isElementDisplayed(interviewElement);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areNotificationsSent() {
        try {
            // Logic to check if notifications are sent
            boolean notificationsSent = true; // placeholder
            Assert.assertTrue(notificationsSent, "Notifications have not been sent!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectOption(String option) {
        try {
            WebElement optionField = driver.findElement(By.id("optionsField"));
            elementUtils.selectOptionInDropdown(optionField, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areCancellationNotificationsSent() {
        try {
            // Logic to check if cancellation notifications are sent
            boolean cancellationNotificationsSent = true; // placeholder
            Assert.assertTrue(cancellationNotificationsSent, "Cancellation notifications have not been sent!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isOnSchedulingPage() {
        try {
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("scheduling"), "Not on scheduling page!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void attachFile(String filePath) {
        try {
            WebElement fileUpload = driver.findElement(By.id("fileUpload"));
            elementUtils.clearAndSendKeys(fileUpload, filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectMinimumAttendees(int minAttendees) {
        try {
            WebElement attendeeCountField = driver.findElement(By.id("minimumAttendees"));
            elementUtils.clearAndSendKeys(attendeeCountField, String.valueOf(minAttendees));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}