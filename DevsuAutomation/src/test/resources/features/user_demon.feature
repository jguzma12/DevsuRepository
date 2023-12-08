#Autor: Juan Pablo Guzman Quintero
@tag
Feature: The user enters the demoblaze page to make a purchase

  Background:
    Given User in the homepage

  @registroususer
  Scenario: The user registers on the page
    When The user enters the fields for registration
    Then The user register succesfully

  @correctsessionlogins
  Scenario: The user logs in successfully and observes the product data
    When The user logs in successfully
    Then the user can see username

  @buylaptops
  Scenario: User logs in successfully and purchases a laptop
    When the user logs in successfully, they go to the laptop section and purchase one.
    Then The user can see a message after confirming their purchase