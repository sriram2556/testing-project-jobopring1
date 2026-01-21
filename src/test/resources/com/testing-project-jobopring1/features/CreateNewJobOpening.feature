
@feature_create_new_job_opening
Feature: CreateNewJobOpening

  Background: 
    Given the user is logged into the application

  @job_openings_access
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Job Openings" module from the main menu
    Then the Job Opening page should be displayed with an "Add Job Opening" button visible

  Examples:
    | action                          |
    | Click on the "Job Openings"    |

@display_create_new_job_opening_form
Scenario Outline: Create New Job Opening
  When the user clicks on the "Add Job Opening" button
  Then the Create New Job Opening form should be displayed
  And all required fields are present

Examples:
    | action                       |
    | Click on the "Add Job Opening" button |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create Job Opening Page
    When I fill in the Job Title field with "<job_title>"
    And I fill in the Job Description field with "<job_description>"
    And I select "<department>" from the Department dropdown
    And I fill in the Location field with "<location>"
    And I select "<employment_type>" as Employment Type
    And I click the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title         | job_description                                                                 | department | location  | employment_type |
      | Software Engineer  | Develop and maintain software applications, ensuring high performance and responsiveness. | Engineering | New York  | Full-time       |

  @missing_required_fields
  Scenario Outline: Create New Job Opening with Empty Required Fields
    When the user leaves all required fields empty
    And the user clicks the Save button
    Then the system displays error messages for each required field that is empty
    And the user remains on the Create New Job Opening form

    Examples:
      |   |
      |   |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user is on the Create Job Opening Page
    When I fill in the Job Title field with a valid title "<job_title>"
    And I fill in the Job Description field with a valid description "<job_description>"
    And I select a valid Department "<department>"
    And I leave optional fields empty
    And I click the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title          | job_description                                                    | department  |
      | Software Engineer   | Develop and maintain software applications, ensuring high performance and responsiveness. | Engineering  |

  @cancel_job_opening
  Scenario Outline: Create New Job Opening - Cancel Process
    When the user clicks the "Cancel" button on the Create New Job Opening form
    Then the user should be redirected back to the Job Openings listing page
    And no new job opening should be created

  Examples:
    |   |
    |   |

  @edit_job_opening
  Scenario Outline: Create New Job Opening
    When I click on the newly created job opening
    And I click the "Edit" button
    And I modify the Job Description field
    And I click the "Save" button
    Then the job opening is updated successfully
    And the user is redirected to the Job Openings listing page
    And updated job opening details are displayed in the listing

    Examples:
      | job_description |
      | Updated job description text |

  @verify_job_opening_displayed
  Scenario Outline: Create New Job Opening
    When the user clicks on the "Job Openings" module
    Then the user should observe the list of job openings
    And the newly created job opening should be displayed in the list
    And the job opening details should be correct and match the entered data

    Examples:
      | job_title       | job_description        |
      | Software Engineer| Responsible for coding. |

  @filter_job_openings
  Scenario Outline: Create New Job Opening
    When the user clicks on the filter options
    And the user selects a Department from the filter dropdown
    And the user clicks the Apply Filters button
    Then job openings are filtered based on the selected criteria
    And only relevant job openings are displayed in the listing

    Examples:
      | Department      |
      | Engineering     |
      | Marketing       |
      | Sales           |

  @view_job_details
  Scenario Outline: Create New Job Opening
    When the user clicks on the newly created job opening
    Then the job opening details are displayed correctly
    And all fields match the data entered during creation

  Examples:
    | job_title       | job_description       |
    | Software Engineer| Develops software solutions |

  @invalid-job-title
  Scenario Outline: Create New Job Opening with Invalid Job Title
    Given I enter "<jobTitle>" as the Job Title
    And I enter "<companyName>" as the Company Name
    And I enter "<location>" as the Location
    And I enter "<description>" as the Job Description
    And I enter "<salary>" as the Salary
    When I click the "Save" button
    Then the system displays an error message indicating the Job Title is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | jobTitle | companyName     | location       | description         | salary       |
      | ab       | validCompanyName | validLocation   | validDescription     | validSalary  |

  @invalid-job-description
  Scenario Outline: Create New Job Opening with Invalid Job Description
    When I enter "<job_description>" as Job Description
    And I enter "<title>" as Job Title
    And I enter "<location>" as Job Location
    And I enter "<salary>" as Salary
    And I select "<employment_type>" as Employment Type
    And I click the "Save" button
    Then the system displays an error message indicating the Job Description is too long
    And the user remains on the Create New Job Opening form

    Examples:
      | job_description                                                                                       | title             | location  | salary  | employment_type |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Software Engineer | New York | 80000   | Full-time       |

  @invalid_department_selection
  Scenario Outline: Create New Job Opening with Invalid Department
    When I select "<department>" from the Department dropdown
    And I enter "<job_title>" as the Job Title
    And I enter "<description>" as the Description
    And I enter "<location>" as the Location
    And I enter "<salary>" as the Salary
    And I click the Save button
    Then the system displays an error message indicating the selected Department is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | department          | job_title         | description          | location         | salary        |
      | Invalid Department   | Valid Job Title   | Valid Description     | Valid Location    | Valid Salary   |

  @duplicate-job-title
  Scenario Outline: Create New Job Opening with Existing Job Title
    Given the user enters "<job_title>" as Job Title
    And the user fills in "<company_name>" as Company Name
    And the user fills in "<location>" as Location
    And the user fills in "<description>" as Job Description
    And the user fills in "<salary>" as Salary
    When the user clicks the Save button
    Then the system displays an error message indicating the Job Title already exists
    And the user remains on the Create New Job Opening form

    Examples:
      | job_title          | company_name         | location      | description | salary |
      | Software Engineer   | Tech Solutions Inc.  | New York     | a * 100     | 80000  |

  @invalid-data
  Scenario Outline: Create New Job Opening with Invalid Data Types
    Given the user enters "<salary>" in the Salary field
    And the user enters "<job_title>" in the Job Title field
    And the user enters "<location>" in the Location field
    And the user enters "<description>" in the Description field
    And the user enters "<company>" in the Company field
    When the user clicks the Save button
    Then the system displays an error message indicating invalid data type
    And the user remains on the Create New Job Opening form

    Examples:
      | salary | job_title         | location   | description | company          |
      | abc    | Software Engineer  | New York   | a * 100     | Tech Innovations  |

  @unsaved_changes_warning
  Scenario Outline: Create New Job Opening
    When the user makes changes to the form without saving
    And the user attempts to navigate to another module
    Then the system displays a warning message about unsaved changes
    And the user remains on the Create New Job Opening form until they confirm to leave

    Examples:
      | action                     |
      | Navigate to Job Openings   |

  @invalid-location
  Scenario Outline: Create New Job Opening with Invalid Location
    When I enter "<title>"
    And I enter "<description>"
    And I enter "<company>"
    And I enter "<salary>"
    And I enter "<location>"
    And I click the "Save" button
    Then the system displays an error message indicating the location is invalid
    And the user remains on the Create New Job Opening form

    Examples:
      | title                 | description                           | company                | salary | location      |
      | Software Engineer     | Develop and maintain software applications. | Tech Innovations Inc. | 80000  | "!@#$%^&*()"  |

  @max-character-limit
  Scenario Outline: Create New Job Opening with Maximum Character Limits
    Given the user fills in the Job Title field with "<job_title>"
    And the user fills in the Job Description field with "<job_description>"
    And the user selects "<department>" from the Department dropdown
    And the user fills in other required fields with "<other_required_fields>"
    When the user clicks the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title                                                                                     | job_description                                                                                     | department  | other_required_fields                                                                                     |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Engineering | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @multiple_job_openings
  Scenario Outline: Create New Job Opening
    When I create a new job opening with valid details for "<position>", "<employmentType>", "<experience>", "<salary>", "<description>", "<location>", "<startDate>", "<endDate>"
    And I click "Save"
    And I quickly click "Add Job Opening" again
    And I fill in details for the second job opening
    When I create a new job opening with valid details for "<secondPosition>", "<secondEmploymentType>", "<secondExperience>", "<secondSalary>", "<secondDescription>", "<secondLocation>", "<secondStartDate>", "<secondEndDate>"
    And I click "Save" for the second job opening
    Then both job openings are created successfully
    And the user is redirected to the Job Openings listing page after each save
    And both job openings are displayed in the listing

    Examples:
      | position          | employmentType | experience | salary | description                                | location    | startDate  | endDate    | secondPosition        | secondEmploymentType | secondExperience | secondSalary | secondDescription                         | secondLocation | secondStartDate | secondEndDate |
      | Software Engineer | Full-time      | 5 years    | 100000 | Develop and maintain software applications. | New York    | 2023-10-01 | 2023-10-31 | Senior Software Engineer | Full-time        | 7 years        | 120000      | Lead project development and team mentoring. | New York      | 2023-11-01     | 2023-11-30    |

  @valid-job-opening
  Scenario Outline: Create New Job Opening
    Given the user fills in the Job Title field with "<job_title>"
    And the user fills in the Job Description field with "<job_description>"
    And the user selects "<department>" from the dropdown
    And the user fills in other required fields with valid data
    When the user clicks the "Save" button
    Then a new job opening is created successfully
    And the user is redirected to the Job Openings listing page
    And the newly created job opening is displayed in the listing

    Examples:
      | job_title                        | job_description                                                                                              | department  |
      | Software Engineer @ Tech Co.    | We are looking for a Software Engineer who can develop & maintain applications, ensuring high performance & responsiveness. | Engineering  |
