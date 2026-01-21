
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

  Background: 
    Given the user is on the Profile section

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | candidate_profile_file |
      | valid_profile.pdf      |
      | valid_profile.docx     |

  @valid-upload-first-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects the "<file>" candidate profile file
    And the user clicks on the Upload button
    Then the upload should complete and confirm success

    Examples:
      | file                |
      | first_candidate.pdf |
      | second_candidate.pdf |

@upload_valid_candidate_profile
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects a valid candidate profile file of 2MB
  And the recruiter clicks on the Upload button
  Then the upload process should complete successfully
  And a success confirmation message is displayed to the recruiter

Examples:
  | <title>                     |
  | Upload New Candidate Profile |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file with a long filename
  And the user clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message should be displayed to the user

Examples:
  | filename                                           |
  | Candidate_Profile_2023_John_Doe_Very_Long_Filename.pdf |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  Given the user clicks on the upload (cloud) icon
  When the user browses and selects a valid candidate profile file in <file_format> format
  And the user clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message should be displayed to the user

Examples:
  | file_format |
  | .txt        |

@valid-upload-candidate-profile
Scenario Outline: Upload New Candidate Profile
  When I click on the upload icon
  And I browse and select a valid candidate profile file with UTF-8 encoding
  And I click on the Upload button
  Then I wait for the upload process to complete
  And I observe the system's response
  Then a success confirmation message should be displayed to the user

Examples:
  | <file> |
  | valid_candidate_profile_utf8.txt |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When I click on the upload icon
  And I browse and select a valid candidate profile file with a .doc extension
  And I click on the Upload button
  Then I wait for the upload process to complete
  And I observe the system's response
  Then a success confirmation message is displayed to the user

Examples:
  | <file_extension> |
  | .doc             |

  @valid-upload-candidate-profile
  Scenario Outline: Upload New Candidate Profile
    When I click on the upload icon
    And I browse and select a valid candidate profile file with text in Spanish
    And I click on the Upload button
    And I wait for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | candidate_profile_file |
      | valid_candidate_profile_spanish.pdf |

  @unsupported-file-upload
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload icon
    When the user browses and selects an unsupported file type <file_type>
    And the user clicks on the Upload button
    Then the system should display an error message indicating the file type is not supported
    And the upload process does not initiate

    Examples:
      | file_type |
      | .exe      |

  @file_size_exceeded
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a file that exceeds the size limit
    And the user clicks on the Upload button
    Then the system should display an error message indicating the file exceeds the maximum size limit
    And the upload process does not initiate

  Examples:
    | file_size |
    | 6MB       |

@error_no_file_selected
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And does not select any file
  And clicks on the Upload button
  Then an error message is displayed indicating that no file was selected
  And the upload process does not initiate

  Examples:
    | file_selection |
    |                |

  @network_failure
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user simulates a network failure during the upload process
    Then the user should see an error message indicating a network failure occurred
    And the upload process should not complete successfully

  Examples:
    | <file> |
    | valid_candidate_profile.pdf |

  @timeout-error
  Scenario Outline: Upload New Candidate Profile
    Given the user clicks on the upload (cloud) icon
    When the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the upload process times out
    Then an error message is displayed indicating the upload process timed out
    And the upload process does not complete successfully

    Examples:
      | <title>                       |
      | Upload New Candidate Profile   |

@corrupted-file-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a corrupted candidate profile file
  And the user clicks on the Upload button
  Then an error message is displayed indicating the file is corrupted and cannot be uploaded
  And the upload process does not initiate

  Examples:
    | corrupted_file |
    | corrupted_file.txt |

@valid-file-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file with special characters in the filename
  And the user clicks on the Upload button
  Then the upload process completes successfully
  And a success confirmation message is displayed to the user

  Examples:
    | filename              |
    | John_Doe@2023.pdf     |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file with a very short filename
    And the user clicks on the Upload button
    Then the upload process should complete
    And a success confirmation message should be displayed to the user

  Examples:
    | filename |
    | A.pdf    |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects a valid candidate profile file with spaces in the filename
  And the recruiter clicks on the Upload button
  Then the upload process should complete
  And a success confirmation message should be displayed to the user

  Examples:
    | filename                     |
    | John Doe Profile.pdf        |
