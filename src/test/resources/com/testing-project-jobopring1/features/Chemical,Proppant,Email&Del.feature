
Feature: Chemical,Proppant,Email&Del
  @feature_user_login
  Background: 
    Given the user is on the main menu

  @navigate_job_setup
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When I navigate to the Jobs section from the main menu
    And I select a current Job from the list
    And I choose a Well associated with the Job
    And I select a Stage for the Job
    And I click on the Chemical Setup option
    Then the user is redirected to the Chemical Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Chemical Setup screen

    When I click on the Proppant Setup option
    Then the user is redirected to the Proppant Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Proppant Setup screen

    When I click on the Email Setup option
    Then the user is redirected to the Email Setup screen
    And the selected Job, Well, and Stage are displayed correctly on the Email Setup screen

  Examples:
    | Job         | Well        | Stage       |
    | CurrentJob  | AssociatedWell | SelectedStage |

@add_acid_additives
Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
  Given the user clicks on the "Add Chemical" button
  When the user selects "<chemical_name>" from the chemical dropdown
  And the user enters a design concentration value of "<design_concentration>"
  And the user enters a designed volume of "<designed_volume>"
  And the user clicks on the "Save" button
  And the user refreshes the page
  Then the Acid & Additives entry should be added to the list
  And the entry should persist after the page refresh
  And the correct design concentration "<design_concentration>" should be displayed
  And the correct designed volume "<designed_volume>" should be displayed
  And no validation errors should occur during the process

  Examples:
    | chemical_name | design_concentration | designed_volume |
    | Acid          | 10                   | 100             |

@add_slickwater
Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
  Given the user clicks on the "Add Chemical" button
  When the user selects "<chemical_name>" from the chemical dropdown
  And the user enters a design concentration value "<design_concentration>"
  And the user enters a designed volume "<designed_volume>"
  And the user clicks on the "Save" button
  And the user refreshes the page
  Then the "<chemical_name>" entry should be added to the list
  And the entry should persist after the page refresh
  And the correct design concentration "<design_concentration>" and volume "<designed_volume>" should be displayed
  And no validation errors should occur during the process

  Examples:
    | chemical_name | design_concentration | designed_volume |
    | Slickwater    | 0                    | a * 100        |

  @feature_user_login
  @add_four_proppants
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Proppant" button
    And the user selects "<proppant_name>" from the dropdown
    And the user enters "<total_design_volume>"
    And the user clicks on the "Save" button
    Then the Proppant "<proppant_name>" with volume "<total_design_volume>" should be added to the list

    Examples:
      | proppant_name | total_design_volume |
      | Proppant A    | 1000                |
      | Proppant B    | 2000                |
      | Proppant C    | 3000                |
      | Proppant D    | 4000                |

  @refresh_proppant_list
  Scenario Outline: Verify Proppants Persist After Refresh
    When the user refreshes the page
    Then all Proppants should display with correct names and design volumes

@add_vendor
Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
  Given the user clicks on the "Add Vendor" button
  When the user selects a vendor type "<vendor_type>"
  And the user enters the vendor name "<vendor_name>"
  And the user enters the PO number "<po_number>"
  And the user clicks on the "Save" button
  Then all vendors should be added to the list

  Examples:
    | vendor_type | vendor_name | po_number |
    | Chemical    | Vendor A    | PO12345   |
    | Proppant    | Vendor B    | PO67890   |

  @feature_user_login
  @update_meeting_id
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user locates the "Others" section on the Email Setup screen
    When the user clicks on the Meeting ID field
    And the user enters "<meeting_id>"
    And the user clicks on the "Save" button
    Then the Meeting ID is updated successfully
    And the new Meeting ID persists after the page refresh
    And no validation errors occur during the process

    Examples:
      | meeting_id   |
      | meeting_id_123 |

  @feature_user_login
  @create_delivery_record
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Delivery Record" button
    When the user selects a vendor from the dropdown
    And the user selects a PO from the dropdown
    And the user selects a chemical type from the dropdown
    And the user enters the BOL number
    And the user enters the received quantity
    And the user enters the UOM
    And the user enters the BOL quantity
    And the user selects the inventory type
    And the user clicks on the "Save" button
    Then the delivery record is added to the list
    And all entered details are displayed correctly
    And the entry persists after the page refresh
    And no validation errors occur during the process

    Examples:
      | vendor      | PO         | chemical_type | BOL_number | received_quantity | UOM | BOL_quantity | inventory_type |
      | Vendor A    | PO12345    | Chemical X    | BOL001     | 100               | L   | 100          | Type A         |

  @feature_user_login
  @verify_dropdown_options
  Scenario Outline: Chemical, Proppant, and Email Setup Dropdowns Load Correct Options
    Given the user opens the <setup_screen> screen
    When the user clicks on the <dropdown_name> dropdown
    Then the <dropdown_name> dropdown displays all available <dropdown_type>
    And no errors occur during the loading of dropdown options

  Examples:
    | setup_screen      | dropdown_name         | dropdown_type      |
    | Chemical Setup    | chemical name         | chemicals          |
    | Proppant Setup    | Proppant name         | Proppants          |
    | Email Setup       | vendor type           | vendor types       |

  @feature_user_login
  @add_save_new_buttons
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Chemical" button
    And the user fills in the required fields
    And the user clicks "Save"
    Then the first Chemical should be saved successfully

    When the user clicks on the "Add Chemical" button again
    And the user fills in the required fields
    And the user clicks "Save & New"
    Then the second Chemical should be added and the form resets for new entry

    When the user clicks on the "Save" button for the last entry
    Then the last entry should be saved successfully
    And there should be no validation errors during the process

    Examples:
      | action                | result                                           |
      | Add Chemical         | The first Chemical is saved successfully        |
      | Add Chemical         | The second Chemical is added and the form resets for new entry |
      | Save                 | The last entry is saved successfully            |
      | Validation Check     | No validation errors occur during the process   |

  @feature_user_login
  @missing_fields
  Scenario Outline: Chemical Setup for Job Stages with Missing Fields
    Given the user clicks on the "Add Chemical" button
    When the user leaves the chemical name field empty
    And the user enters a design concentration value of "<concentration>"
    And the user leaves the designed volume field empty
    And the user clicks on the "Save" button
    Then the system should not add the Chemical
    And appropriate error messages should be displayed for missing fields
    And the user should remain on the Chemical Setup screen

    Examples:
      | concentration |
      | 5.0          |

  @negative_design_volume
  Scenario Outline: Prevent Adding Proppant with Negative Total Design Volume
    Given the user clicks on the "Add Proppant" button
    When the user selects "<proppant_name>" from the dropdown
    And the user enters "<total_design_volume>" as the total design volume
    And the user clicks on the "Save" button
    Then the system should not add the Proppant
    And an error message is displayed indicating that the total design volume must be positive
    And the user remains on the Proppant Setup screen

    Examples:
      | proppant_name   | total_design_volume |
      | NegativeProppant | -10                |

  @feature_user_login
  @missing_vendor_name
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Vendor" button
    And the user selects the vendor type "<vendorType>"
    And the user leaves the vendor name field empty
    And the user enters the PO number "<poNumber>"
    And the user clicks on the "Save" button
    Then the system does not save the vendor
    And an error message is displayed indicating that the vendor name is required
    And the user remains on the Email Setup screen

    Examples:
      | vendorType | poNumber |
      | Chemical   | 12345    |
      | Proppant   | 12345    |

  @feature_user_login
  @missing_vendor
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Delivery Record" button
    And the user leaves the vendor field empty
    And the user selects "<po>" from the dropdown
    And the user selects "<chemical>" from the dropdown
    And the user clicks on the "Save" button
    Then the system does not create the delivery record
    And an error message is displayed indicating that the vendor is required
    And the user remains on the Chemical Delivery Tracking screen

    Examples:
      | po                     | chemical                     |
      | PO_Selection_Value     | Chemical_Type_Selection_Value |

  @valid-proppants
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    When the user clicks on the "Add Proppant" button
    And the user selects "<proppant_name>" from the dropdown
    And the user enters "<total_design_volume>"
    And the user clicks on the "Save" button
    Then the user attempts to add a fifth Proppant
    And the user clicks on the "Add Proppant" button
    And the user selects "Proppant Name 5" from the dropdown
    And the user enters ""
    And the user clicks on the "Save" button
    Then an error message is displayed when attempting to add the fifth Proppant
    And the user remains on the Proppant Setup screen

    Examples:
      | proppant_name    | total_design_volume |
      | Proppant Name 1  | 1000                |
      | Proppant Name 2  | 1000                |
      | Proppant Name 3  | 1000                |
      | Proppant Name 4  | 1000                |

  @feature_user_login
  @valid_delivery_record_creation
  Scenario Outline: Chemical, Proppant, Email & Delivery Setup for Job Stages
    Given the user clicks on the "Add Delivery Record" button
    When the user selects "<vendor>" from the dropdown
    And the user selects "<po>" from the dropdown
    And the user selects "<chemical_type>" from the dropdown
    And the user enters "<bol_number>", "<received_quantity>", "<uom>", and "<bol_quantity>"
    And the user selects "<inventory_type>"
    And the user clicks on the "Save" button
    Then the delivery record is added successfully
    And all entered details are displayed correctly
    And the entry persists after the page refresh
    And no validation errors occur during the process

    Examples:
      | vendor     | po       | chemical_type | bol_number  | received_quantity | uom | bol_quantity | inventory_type    |
      | Vendor A  | PO12345  | Chemical X    | BOL123456   | 100               | kg  | 150          | Inventory Type A  |
