Feature: Success Shopping E2E Test

  Background: Login Process
    Given The user is on the login page
    When The user type in valid credentials "standard_user" and "secret_sauce"
    Then The user should be able to see page title: "Products"

  @wip
  Scenario: Positive Shopping E2E Test
    When The user should be able to sort items with order type: "Price (high to low)"
    Then The user verifies the correct order with the first item name: "Sauce Labs Fleece Jacket"
    When The user should be able to sort items with order type: "Name (Z to A)"
    Then The user verifies the correct order with the first item name: "Test.allTheThings() T-Shirt (Red)"
    When The user should be able too add item with item name: "Sauce Labs Fleece Jacket"
    When The user should be able too add item with item name: "Sauce Labs Onesie"
    When The user should be able too add item with item name: "Sauce Labs Bike Light"
    Then The number on the basket icon should show added item quantity 3
    When The user navigates to your cart page
    Then The user should be able to see page title: "Your Cart"
    And The user should be able to see the following items on the page that added before
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Bike Light    |
      | Sauce Labs Onesie        |
    When The user navigates to next page with related button: "checkout"
    Then The user should be able to see page title: "Checkout: Your Information"
    When The user fills the your information form with following data
      | first_name  | Ahmet |
      | last_name   | Atik  |
      | postal_code | 34550 |
    When The user navigates to next page with related button: "continue"
    Then The user should be able to see page title: "Checkout: Overview"
    And The user should be able to verify total price with "Total: $73.41"
    When The user navigates to next page with related button: "finish"
    Then The user should be able to see page title: "Checkout: Complete!"
    And The user verifies the success shopping message: "Thank you for your order!"






