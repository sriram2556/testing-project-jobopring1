
@feature_user_login
Feature: LoginScreenforRecruiters

Background: 
  Given the user is on the Login Screen

@valid_login_recruiter
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click on 'Show Password'
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                  | password          |
    | recruiter@example.com  | SecurePassword123  |

@valid_login_button_enabled
Scenario Outline: Login Screen for Recruiters
  Given the user is on the Login Screen
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  Then the Login button is enabled

  Examples:
    | email_id            | password           |
    | krishna@gmail.com   | ValidPassword123   |

@toggle_password_visibility
Scenario Outline: Login Screen for Recruiters
  When I enter a valid password in the Password field
  And I click on the 'Show Password' option
  Then the password should be visible
  And I click on the 'Hide Password' option
  Then the password should be hidden

  Examples:
    | password           |
    | ValidPassword123!  |

@failed_login_then_successful_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<invalid_email>"
  And I enter "<invalid_password>"
  And I click the Login button
  Then the error message 'Incorrect email ID or password.' is displayed
  And the user remains on the login screen
  When I enter "<valid_email>"
  And I enter "<valid_password>"
  And I click the Login button again
  Then the user is redirected to the dashboard

  Examples:
    | invalid_email        | invalid_password | valid_email            | valid_password      |
    | invalid_email@domain | short            | valid_email@example.com | ValidPassword123    |

@valid-login-chrome
Scenario Outline: Login Screen for Recruiters - Chrome
  When I open the application in "<browser>"
  And I enter a valid email ID in the Email ID field
  And I enter a valid password in the Password field
  And I click the Login button
  Then the login screen is displayed in "<browser>"
  And the user is redirected to the dashboard in "<browser>"

  Examples:
    | browser  | email               | password            |
    | Chrome   | <email>            | <password>         |

@valid-login-firefox
Scenario Outline: Login Screen for Recruiters - Firefox
  When I open the application in "<browser>"
  And I enter a valid email ID in the Email ID field
  And I enter a valid password in the Password field
  And I click the Login button
  Then the login screen is displayed in "<browser>"
  And the user is redirected to the dashboard in "<browser>"

  Examples:
    | browser  | email               | password            |
    | Firefox  | <email>            | <password>         |

@valid-login-safari
Scenario Outline: Login Screen for Recruiters - Safari
  When I open the application in "<browser>"
  And I enter a valid email ID in the Email ID field
  And I enter a valid password in the Password field
  And I click the Login button
  Then the login screen is displayed in "<browser>"
  And the user is redirected to the dashboard in "<browser>"

  Examples:
    | browser  | email               | password            |
    | Safari   | <email>            | <password>         |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email_id>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id                | password           |
    | user123@domain.com     | validPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the user navigates to the login screen
  When the user enters "<email_id>"
  And the user enters "<password>"
  And the user clicks the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id            | password          |
    | USER@DOMAIN.COM     | ValidPassword123   |
    | user@domain.com     | ValidPassword123   |

@valid-login
Scenario Outline: Login Screen for Recruiters
  Given the recruiter is on the Login Screen
  When I enter "<email_id>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email_id                | password   |
    | user123@domain.com     | Passw0rd!  |

@invalid_login
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the user should see the error message 'Incorrect email ID or password.'
  And the user should remain on the login screen

  Examples:
    | email                | password |
    | invalid_email@domain | short    |

@disabled_login_button
Scenario Outline: Login Screen for Recruiters
  When I leave the Email ID field empty
  And I enter a valid password "<password>"
  Then the Login button should be disabled

  Examples:
    | password           |
    | valid_password123  |

@valid_login_button
Scenario Outline: Login Screen for Recruiters with Email and Password
  When I enter a valid Email ID "<email>"
  And I enter a valid password "<password>"
  Then the Login button should be enabled

  Examples:
    | email              | password           |
    | valid_email@test.com | valid_password123  |

  @feature_user_login
  @empty_email_error
  Scenario Outline: Login Screen for Recruiters
    Given the user leaves the Email ID field empty
    And the user enters a valid password in the Password field
    When the user clicks the Login button
    Then an error message 'Please enter your email ID.' is displayed
    And the user remains on the login screen

    Examples:
      | password       |
      | valid_password |

@empty_password_error
Scenario Outline: Login Screen for Recruiters
  Given I enter a valid email ID "<email>"
  And I leave the Password field empty
  When I click the Login button
  Then an error message 'Please enter your password.' is displayed
  And the user remains on the login screen

  Examples:
    | email                |
    | krishna@gmail.com    |

@invalid-email-format
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then an error message 'Please enter a valid email ID.' is displayed
  And the user remains on the login screen

  Examples:
    | email          | password          |
    | user@domain    | validPassword123   |

@invalid_password_short
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the user should see an error message 'Password must be at least 6 characters long.'
  And the user remains on the Login Screen

  Examples:
    | email                | password |
    | krishna@gmail.com    | 123      |

  @invalid-email
  Scenario Outline: Login Screen for Recruiters
    When I enter "<email_id>" in the Email ID field
    And I enter "<password>" in the Password field
    And I click the Login button
    Then an error message 'Please enter a valid email ID.' is displayed
    And the user remains on the login screen

    Examples:
      | email_id            | password            |
      | user@domain#.com   | ValidPassword123    |

@error_message_spaces
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the Email ID field contains only spaces
  And the Password field contains only spaces
  And an error message 'Please enter your email ID.' is displayed
  And the user remains on the login screen

  Examples:
    | email | password |
    | "    " | "    "   |

@max-character-login
Scenario Outline: Login Screen for Recruiters
  When I enter "<emailID>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | emailID                                                                 | password                                                              |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

@valid-recruiter-login
Scenario Outline: Login Screen for Recruiters
  Given I enter "<email>"
  And I enter "<password>"
  And I click the Login button
  Then the user should be redirected to the dashboard

  Examples:
    | email                 | password       |
    | krishna@gmail.com     | !@#$%^&*()     |

@successful_login_with_spaces
Scenario Outline: Login Screen for Recruiters
  When I enter "<email>" in the Email ID field
  And I enter "<password>" in the Password field
  And I click the Login button
  Then the email ID should be correctly entered
  And the password should be correctly entered
  Then the user should be redirected to the dashboard

  Examples:
    | email               | password         |
    | " user@domain.com " | " password123 "  |
