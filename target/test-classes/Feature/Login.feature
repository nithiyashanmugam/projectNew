@tag
Feature: Login feature
  I want to use this template for my feature file

  @TC001
  Scenario: Test the Login page sending data directly in featre file
    Given User is on Login Page
    When User Enter Username "Admin" and Password "admin123"
    And User click on Login button
    Then Validate user is on Homepage
    
  @TC002
  Scenario: Test the Login page sending data without header in featre file
    Given User is on Login Page
    When User Enter below credential
    |Admin|admin123|
    And User click on Login button
    Then Validate user is on Homepage
    
    @TC003
  Scenario: Test the Login page sending data with header in featre file
    Given User is on Login Page
    When User Enter below details
    |Username|Password|
    |Admin   |admin123|
    And User click on Login button
    Then Validate user is on Homepage
    
       @TC004
  Scenario Outline: Test the Login page sending datatable with examples  in featre file
    Given User is on Login Page
    When User Enter the "<Username>" and "<Password>"
    And User click on Login button
    Then Validate user is on Homepage
    
    Examples:
   |Username|Password|
   |Admin   |admin123|