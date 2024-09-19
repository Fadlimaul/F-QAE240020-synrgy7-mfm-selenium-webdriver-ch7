Feature: LOG-01

  Scenario: TC-LOG-01
    Given The user is on the login page
    When The user enters username "standard_user"
    And The user enters password "secret_sauce"
    And The user clicks the login button
    Then the user directed to the home page

  Scenario: TC-LOG-02
    Given The user is on the login page
    When The user enters username "standard"
    And The user enters password "secret_sauce"
    And The user clicks the login button
    Then the user get error message

  Scenario: TC-LOG-03
    Given The user is on the login page
    When The user enters username "standard_user"
    And The user enters password "secret"
    And The user clicks the login button
    Then the user get error message

  Scenario: TC-LOG-04
    Given The user is on the login page
    When The user enters password "secret_sauce"
    And The user clicks the login button
    Then the user get error username message

  Scenario: TC-LOG-05
    Given The user is on the login page
    When The user enters username "standard_user"
    And The user clicks the login button
    Then the user get error password message

  Scenario: TC-LOG-06
    Given The user is on the login page
    When The user clicks the login button
    Then the user get error username message

  Scenario: TC-LOG-01
    Given The user is on the login page
    When The user enters username "standard_user"
    And The user enters password "secret_sauce"
    And The user clicks the login button
    And The user clicks the menu button
    And The user clicks the logout button
    Then the user back to the login page