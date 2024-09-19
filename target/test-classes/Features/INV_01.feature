Feature: INV-01

  Scenario: TC-INV-01
    Given The user on the login page and login
    When The user clicks the product name
    Then the user directed to inventory item page

  Scenario: TC-INV-02
    Given The user on the login page and login
    When The user clicks add to cart
    And The user clicks cart button
    And The user clicks the product name on the cart page
    Then the user directed to inventory item page

  Scenario: TC-INV-03
    Given The user on the login page and login
    When The user clicks add to cart
    And The user clicks cart button
    And The user clicks the checkout button
    And The user filling valid data on the checkout information page
    And The user clicks the product name on the checkout overview page
    Then the user directed to inventory item page

