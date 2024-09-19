Feature: ATC-01

  Scenario: TC-ATC-01
    Given The user is on the login page and login
    When The user clicks add to cart to all product
    And The user click cart button
    Then the all product displayed on the cart page

  Scenario: TC-ATC-02
    Given The user is on the login page and login
    When The user clicks add to cart to all product
    And The user clicks remove to all product
    And The user click cart button
    Then the product not displayed on the cart page

  Scenario: TC-ATC-03
    Given The user is on the login page and login
    When The user clicks the product
    And The user clicks add to cart on the inventory page
    And The user click cart button
    Then the product displayed on the cart page

  Scenario: TC-ATC-04
    Given The user is on the login page and login
    When The user clicks the product
    And The user clicks add to cart on the inventory page
    And The user clicks remove on the inventory page
    And The user click cart button
    Then the product not displayed on the cart page

  Scenario: TC-ATC_05
    Given The user is on the login page and login
    When The user clicks add to cart to all product
    And The user click cart button
    And The user clicks remove on the cart page
    Then the product not displayed on the cart page
