package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class LoginScreenforRecruitersPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "showPasswordButton")
    private WebElement showPasswordButton;

    @FindBy(id = "hidePasswordButton")
    private WebElement hidePasswordButton;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    public LoginScreenforRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickShowPassword() {
        try {
            elementUtils.clickElement(showPasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickHidePassword() {
        try {
            elementUtils.clickElement(hidePasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isDashboardDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoginScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(emailField) && elementUtils.isElementDisplayed(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void clearEmailField() {
        try {
            elementUtils.clearElement(emailField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearPasswordField() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEmailCorrectlyEntered() {
        try {
            return emailField.getAttribute("value").equals(emailField.getText());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordCorrectlyEntered() {
        try {
            return passwordField.getAttribute("value").equals(passwordField.getText());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmailFieldOnlySpaces() {
        try {
            return emailField.getAttribute("value").trim().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordFieldOnlySpaces() {
        try {
            return passwordField.getAttribute("value").trim().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void leaveEmailFieldEmptyAndCheckPasswordVisibility() {
        try {
            clearEmailField();
            boolean isPasswordVisible = passwordField.getAttribute("type").equals("text");
            Assert.assertTrue(isPasswordVisible, "Password should be visible!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost/login");
            WebElement loginHeader = driver.findElement(By.xpath("//h1[text()='Login']"));
            Assert.assertTrue(elementUtils.isElementDisplayed(loginHeader), "Login screen is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}