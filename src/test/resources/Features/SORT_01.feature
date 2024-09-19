Feature: SORT-01

  Scenario: TC-SORT-01
    Given The user on the login page and login with valid data
    When The user clicks sorting name product from A to Z
    Then the product name is sorted from A to Z

  Scenario: TC-SORT-02
    Given The user on the login page and login with valid data
    When The user clicks sorting name product from Z to A
    Then the product name is sorted from Z to A

  Scenario: TC-SORT-03
    Given The user on the login page and login with valid data
    When The user clicks sorting product price from high to low
    Then the product price is sorted from high to low

  Scenario: TC-SORT-04
    Given The user on the login page and login with valid data
    When The user clicks sorting product price from low to high
    Then the product price is sorted from low to high