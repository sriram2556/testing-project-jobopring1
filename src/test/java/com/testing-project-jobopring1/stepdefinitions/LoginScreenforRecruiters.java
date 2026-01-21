package com.testing-project-jobopring1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.testing-project-jobopring1.pages.LoginScreenforRecruitersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenforRecruiters extends DriverFactory {
LoginScreenforRecruitersPage loginPage = new LoginScreenforRecruitersPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginScreen();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_email(String email) {
loginPage.enterEmail(email);
}
@When("I enter {string} in the Password field")
public void i_enter_password_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
"Dashboard is not displayed", loginPage.isDashboardDisplayed();
}
@Then("the Login button is enabled")
public void the_login_button_is_enabled() {
"Login button is not enabled", loginPage.isLoginButtonEnabled();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
"Password is still visible", loginPage.isPasswordVisible();
}
@Then("the user should see the error message {string}")
public void the_user_should_see_the_error_message(String errorMessage) {
Assert.assertEquals("Error message does not match", errorMessage, loginPage.getErrorMessage());
}
@Then("the user remains on the login screen")
public void the_user_remains_on_the_login_screen() {
"User is not on the login screen", loginPage.isLoginScreenDisplayed();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
"Login button is enabled", loginPage.isLoginButtonEnabled();
}
@Given("the user leaves the Email ID field empty")
public void the_user_leaves_the_email_id_field_empty() {
loginPage.leaveEmailFieldEmpty();
}
@Given("the user enters a valid password in the Password field")
public void the_user_enters_a_valid_password_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@When("I click on 'Show Password' option")
public void i_click_on_show_password_option() {
loginPage.clickShowPassword();
}
@When("I click on 'Hide Password' option")
public void i_click_on_hide_password_option() {
loginPage.clickHidePassword();
}
@Then("the Email ID field contains only spaces")
public void the_email_id_field_contains_only_spaces() {
"Email ID field does not contain only spaces", loginPage.isEmailFieldOnlySpaces();
}
@Then("the Password field contains only spaces")
public void the_password_field_contains_only_spaces() {
"Password field does not contain only spaces", loginPage.isPasswordFieldOnlySpaces();
}
@When("I enter {string} in the Email ID field")
public void i_enter_invalid_email_in_the_email_id_field(String email) {
loginPage.enterEmail(email);
}
@Then("the email ID should be correctly entered")
public void the_email_id_should_be_correctly_entered() {
"Email ID is not correctly entered", loginPage.isEmailCorrectlyEntered();
}
@Then("the password should be correctly entered")
public void the_password_should_be_correctly_entered() {
"Password is not correctly entered", loginPage.isPasswordCorrectlyEntered();
}

@Given("I open the application in {string}")
public void i_open_the_application_in(String url) {
driver = DriverFactory.getDriver();
driver.get(url);
}
@When("I enter a valid email id in the email id field")
public void i_enter_a_valid_email_id_in_the_email_id_field() {
loginScreen.enterEmailId("test@example.com"); // Example email, replace with actual logic if needed
}
@When("I enter a valid email id {string}")
public void i_enter_a_valid_email_id(String email) {
loginScreen.enterEmailId(email);
}
@When("I leave the email id field empty")
public void i_leave_the_email_id_field_empty() {
loginScreen.clearEmailIdField();
}
@When("I enter a valid password {string}")
public void i_enter_a_valid_password(String password) {
loginScreen.enterPassword(password);
}
@When("I leave the password field empty")
public void i_leave_the_password_field_empty() {
loginScreen.clearPasswordField();
}
@When("I clickElement the login button again")
public void i_click_the_login_button_again() {
loginScreen.clickLoginButton();
}
@When("I clickElement on 'show password'")
public void i_click_on_show_password() {
loginScreen.clickShowPassword();
}
@When("I clickElement on the 'hide password' option")
public void i_click_on_the_hide_password_option() {
loginScreen.clickHidePassword();
}
@Then("the user is redirected to the dashboard")
public void the_user_is_redirected_to_the_dashboard() {
loginScreen.isUserRedirectedToDashboard();
}
@Then("the user is redirected to the dashboard in {string}")
public void the_user_is_redirected_to_the_dashboard_in(String expectedUrl) {
Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
}
@Then("the login screen is displayed in {string}")
public void the_login_screen_is_displayed_in(String expectedUrl) {
Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
}
@Then("the user enters {string}")
public void the_user_enters(String input) {
loginScreen.enterInput(input); // Assuming a method to handle generic input
}
@Then("the login button should be enabled")
public void the_login_button_should_be_enabled() {
loginScreen.isLoginButtonEnabled();
}
@Then("the user should see an error message 'password must be at least 6 characters long.'")
public void the_user_should_see_an_error_message_password_must_be_at_least_6_characters_long() {
Assert.assertEquals("password must be at least 6 characters long.", loginScreen.getErrorMessage());
}
@Then("the error message 'incorrect email id or password.' is displayed")
public void the_error_message_incorrect_email_id_or_password_is_displayed() {
Assert.assertEquals("incorrect email id or password.", loginScreen.getErrorMessage());
}
@Then("an error message 'please enter your email id.' is displayed")
public void an_error_message_please_enter_your_email_id_is_displayed() {
Assert.assertEquals("please enter your email id.", loginScreen.getErrorMessage());
}
@Then("an error message 'please enter your password.' is displayed")
public void an_error_message_please_enter_your_password_is_displayed() {
Assert.assertEquals("please enter your password.", loginScreen.getErrorMessage());
}
@Then("the user should remain on the login screen")
public void the_user_should_remain_on_the_login_screen() {
loginScreen.isLoginScreenDisplayed();
}
}