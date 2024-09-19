Feature: CO-01

  Scenario: TC-CO-01
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling first name "ilham"
    And The user filling last name "basuri"
    And The user filling valid postal code 16452
    And The user click the continue button
    And The user click the finish button
    Then the success message should be displayed

  Scenario: TC-CO-02
    Given The user is on the login page and login with valid data
    When The user click cart logo
    And The user click the checkout button
    Then The user still on the cart page

  Scenario: TC-CO-03
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the continue shopping button
    Then The user back to the home page

  Scenario: TC-CO-04
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling last name "basuri"
    And The user filling valid postal code 16452
    And The user click the continue button
    Then the error first name message should be displayed

  Scenario: TC-CO-05
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling first name "ilham"
    And The user filling valid postal code 16452
    And The user click the continue button
    Then the error last name message should be displayed

  Scenario: TC-CO-06
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling first name "ilham"
    And The user filling last name "basuri"
    And The user click the continue button
    Then the error postal code message should be displayed

  Scenario: TC-CO-07
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling first name "ilham"
    And The user filling last name "basuri"
    And The user filling invalid postal code "aaaa"
    And The user click the continue button
    Then The user still on the checkout information page

  Scenario: TC-CO-08
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling first name "ilham"
    And The user click the continue button
    Then the error message should be displayed

  Scenario: TC-CO-09
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling last name "basuri"
    And The user click the continue button
    Then the error message should be displayed

  Scenario: TC-CO-10
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling valid postal code 16452
    And The user click the continue button
    Then the error message should be displayed

  Scenario: TC-CO-11
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user click the continue button
    Then the error message should be displayed

  Scenario: TC-CO-12
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling first name "ilham"
    And The user filling last name "basuri"
    And The user filling valid postal code 16452
    And The user click the cancel button on the checkout information page
    Then The user back to the cart page

  Scenario: TC-CO-13
    Given The user is on the login page and login with valid data
    When The user click add to cart
    And The user click cart logo
    And The user click the checkout button
    And The user filling first name "ilham"
    And The user filling last name "basuri"
    And The user filling valid postal code 16452
    And The user click the continue button
    And The user click the cancel button on the checkout overview page
    Then The user back to the home page

