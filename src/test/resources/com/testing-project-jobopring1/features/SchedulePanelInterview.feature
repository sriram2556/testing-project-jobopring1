
@feature_schedule_panel_interview
Feature: SchedulePanelInterview

  Background: 
    Given the recruiter is on the Schedule Interview section

  @panel-interview-scheduling
  Scenario Outline: Schedule Panel Interview
    When the recruiter clicks on Create Interview
    And the recruiter selects "<job_opening>" from the dropdown
    And the recruiter selects "<location>" from the available options
    And the recruiter enters the Candidate's email address "<candidate_email>" and selects the candidate
    And the recruiter chooses the "<panel_option>"
    And the recruiter selects "<interview_date>" and "<start_time>"
    And the recruiter selects "<attendees>" and "<interview_round>"
    And the recruiter selects "<interview_provider>"
    And the recruiter clicks on Next
    And the recruiter attaches "<required_files>"
    And the recruiter clicks on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview

    Examples:
      | job_opening           | location      | candidate_email      | panel_option      | interview_date | start_time | attendees            | interview_round | interview_provider | required_files |
      | job opening value     | location value| candidate@example.com| Panel Interview   | 2023-10-15     | 10:00 AM   | attendee@example.com  | Round 1        | Provider Name     | file.pdf       |

  @schedule-interview
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects "<job_opening>" from the dropdown
    And the user selects "<location>" from the available options
    And the user enters "<candidate_email>" and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects "<interview_date>" and "<start_time>"
    And the user selects "<attendees>" and "<interview_round>"
    And the user selects "<interview_provider>"
    And the user fills in optional fields with "<interview_notes>" and "<special_instructions>"
    And the user clicks on Next
    And the user attaches required files
    And the user clicks on Confirm and Send
    Then the system displays a confirmation message for the scheduled interview
    And all optional fields are saved and displayed correctly in the interview details
    And notifications are sent to all participants with the additional information included
    And the interview appears in the calendar of all attendees with all details
    And the candidate receives an email notification with all details
    And the recruiter can view the scheduled interview in their dashboard with all information

    Examples:
      | job_opening        | location         | candidate_email        | interview_date | start_time | attendees                    | interview_round | interview_provider | interview_notes             | special_instructions         |
      | Job Opening 1      | Location 1       | candidate@example.com   | 2023-10-15     | 10:00 AM   | Attendee 1, Attendee 2     | Round 1        | Provider Name     | Interview notes a * 100     | Special instructions a * 100 |

@edit-panel-interview
Scenario Outline: Schedule Panel Interview
  When the recruiter selects a scheduled panel interview to edit
  And the recruiter clicks on Edit Interview
  And the recruiter makes changes to the Interview Date, Start Time, or Attendees
  And the recruiter clicks on Save Changes
  Then the system displays a confirmation message indicating that the interview has been updated
  And the updated interview details are reflected in the system
  And notifications are sent to all attendees regarding the changes
  And the candidate receives an email notification with updated interview details
  And the recruiter can view the updated interview in their dashboard

Examples:
  | Interview Date | Start Time | Attendees        |
  | 2023-10-01     | 10:00 AM   | John Doe, Jane Smith |

@verify_notifications_sent
Scenario Outline: Schedule Panel Interview
  When I schedule a panel interview with multiple attendees
  Then each attendee should receive an email notification with the interview details
  And the email should contain the correct Interview Date, Start Time, and Location
  And the email should include a calendar invite for the interview

  Examples:
    | attendees                      |
    | Attendee1, Attendee2, Attendee3 |

@cancel_interview
Scenario Outline: Schedule Panel Interview
  When the recruiter selects a scheduled panel interview to cancel
  And the recruiter clicks on Cancel Interview
  And the recruiter confirms the cancellation
  Then the system displays a confirmation message indicating that the interview has been canceled
  And the interview is removed from the scheduled interviews list
  And notifications are sent to all attendees regarding the cancellation
  And the candidate receives an email notification about the cancellation

  Examples:
    |   |
    |   |

  @empty_job_opening
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user leaves the Job Opening field empty
    And the user selects "<location>" as the Location
    And the user enters "<candidate_email>" as the Candidate's email address
    And the user selects "<candidate_name>" from the candidates
    And the user chooses the "<interview_type>" option
    And the user selects the "<interview_date>" and "<start_time>"
    And the user clicks on Next
    Then the system displays an error message indicating that the Job Opening must be selected
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | location   | candidate_email       | candidate_name | interview_type   | interview_date | start_time  |
      | New York   | candidate@example.com  | John Doe       | Panel Interview   | 15/11/2023     | 10:00 AM    |

@error-scheduling-panel-interview
Scenario Outline: Schedule Panel Interview without Selecting Candidate
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user leaves the Candidate field empty
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system displays an error message indicating that a Candidate must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | Job Opening | Location |
    | Job A      | Location 1 |

@error-message
Scenario Outline: Schedule Panel Interview without Selecting Interview Date
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address
  And the user selects the candidate
  And the user chooses the Panel Interview option
  And the user leaves the Interview Date field empty
  And the user clicks on Next
  Then the system displays an error message indicating that an Interview Date must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | Job Opening      | Location      | Candidate's Email      |
    | Job Opening 1    | Location 1    | candidate1@example.com  |
    | Job Opening 2    | Location 2    | candidate2@example.com  |

@error-message
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address and selects the candidate
  And the user chooses the Panel Interview option
  And the user selects the Interview Date
  And the user leaves the Start Time field empty
  And the user clicks on Next
  Then the system displays an error message indicating that a Start Time must be selected
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | candidate_email       |
    | candidate@example.com  |

  @error-message-when-no-attendees
  Scenario Outline: Schedule Panel Interview
    When the user clicks on Create Interview
    And the user selects a Job Opening from the dropdown
    And the user selects a Location from the available options
    And the user enters the Candidate's email address and selects the candidate
    And the user chooses the Panel Interview option
    And the user selects the Interview Date and Start Time
    And the user leaves the Attendees field empty
    And the user clicks on Next
    Then the system displays an error message indicating that at least one Attendee must be selected
    And the user remains on the scheduling page
    And no interview is scheduled

    Examples:
      | Job Opening | Location   | Candidate Email         |
      | Job1       | Location1  | candidate@example.com    |

@invalid-date-scheduling
Scenario Outline: Schedule Panel Interview with Past Date
  When the user clicks on Create Interview
  And the user selects "<job_opening>" from the dropdown
  And the user selects "<location>" from the available options
  And the user enters "<candidate_email>" and selects the candidate
  And the user chooses the Panel Interview option
  And the user selects "<interview_date>"
  And the user selects "<start_time>"
  Then the system displays an error message indicating that the Interview Date cannot be in the past
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | job_opening | location   | candidate_email | interview_date | start_time |
    | Position A  | Location 1 | abc@            | 01/01/2020     | Time 1     |

@overlapping-interview
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters the Candidate's email address "<email>"
  And the user selects the candidate
  And the user chooses the Panel Interview option
  And the user selects an Interview Date "<date>" and Start Time "<time>" that overlaps with an existing interview
  And the user selects Attendees "<attendees>" and Interview Round "<round>"
  And the user clicks on Next
  Then the system displays an error message indicating that the interview time overlaps with an existing interview
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | email                           | date        | time     | attendees                  | round    |
    | overlapping_candidate@gmail.com | 10/10/2023 | 10:00 AM | Attendee 1, Attendee 2     | Round 1  |

@invalid-email-format
Scenario Outline: Schedule Panel Interview with Invalid Email Format
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters an invalid email format for the Candidate "<email>"
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system displays an error message indicating that the email format is invalid
  And the user remains on the scheduling page
  And no interview is scheduled

  Examples:
    | email         |
    | invalidemail  |

@valid-schedule-panel-interview
Scenario Outline: Schedule Panel Interview
  Given the recruiter clicks on Create Interview
  When the recruiter selects "<job_opening>"
  And the recruiter selects "<location>"
  And the recruiter enters "<candidate_email>"
  And the recruiter selects the candidate
  And the recruiter chooses the "<panel_interview_option>"
  And the recruiter selects the interview date "<interview_date>"
  And the recruiter selects the start time "<start_time>"
  And the recruiter selects the maximum number of attendees "<max_attendees>"
  And the recruiter clicks on Next
  And the recruiter attaches "<required_files>"
  And the recruiter clicks on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview
  Then all attendees receive notifications
  Then the interview appears in the calendar of all attendees
  Then the candidate receives an email notification with interview details
  Then the recruiter can view the scheduled interview in their dashboard

  Examples:
    | job_opening        | location         | candidate_email        | panel_interview_option | interview_date | start_time | max_attendees | required_files |
    | job opening value  | location value   | candidate@example.com   | Panel Interview        | 2023-10-30    | 10:00 AM   | 10            | file.pdf       |

@valid-panel-interview
Scenario Outline: Schedule Panel Interview
  When I click on Create Interview
  And I select "<job_opening>"
  And I select "<location>"
  And I enter "<candidate_email>" and select the candidate
  And I choose the "<panel_interview>"
  And I select "<interview_date>" and "<start_time>"
  And I select the minimum number of Attendees as "<minimum_attendees>"
  And I click on Next
  And I attach "<required_files>"
  And I click on Confirm and Send
  Then the system displays a confirmation message for the scheduled interview
  And all attendees receive notifications
  And the interview appears in the calendar of all attendees
  And the candidate receives an email notification with interview details
  And the recruiter can view the scheduled interview in their dashboard

  Examples:
    | job_opening          | location         | candidate_email      | panel_interview | interview_date | start_time | minimum_attendees | required_files |
    | job opening value    | location value   | candidate@example.com | Panel Interview  | 2023-10-15    | 10:00 AM  | 2                 | file.pdf       |

@max-email-length
Scenario Outline: Schedule Panel Interview
  When the user clicks on Create Interview
  And the user selects a Job Opening from the dropdown
  And the user selects a Location from the available options
  And the user enters "<candidate_email>"
  And the user chooses the Panel Interview option
  And the user selects the Interview Date and Start Time
  And the user clicks on Next
  Then the system accepts the email address without errors
  And the interview can be scheduled successfully
  And notifications are sent to all participants

  Examples:
    | candidate_email                     |
    | a@a.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @minimum-character-email
  Scenario Outline: Schedule Panel Interview with Minimum Character Limit Email
    When the user clicks on Create Interview
    And the user selects a Job Opening
    And the user selects a Location
    And the user enters a candidate email address "<candidate_email>"
    And the user chooses the Panel Interview option
    And the user selects the Interview Date and Start Time
    And the user clicks on Next
    Then the system accepts the email address without errors
    And the interview can be scheduled successfully
    And notifications are sent to all participants

    Examples:
      | candidate_email |
      | a@b.c          |
