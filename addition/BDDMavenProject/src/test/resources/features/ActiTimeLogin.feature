Feature: Vdalidation of Actitime login functionality

  Scenario: Validation to check the functionality of the site Actitime with username and password
    Given User is in the Actitime login page
    When User enters username
    And enters password
    And click on login button
    Then validate user is on home page
    And close the browser


  Scenario: Validation the creation of task in actitime
    Given User is in the Actitime login page 
    When User enters username
    And enters password
    And click on login button
    Then validate user is on home page
    And close the browser
