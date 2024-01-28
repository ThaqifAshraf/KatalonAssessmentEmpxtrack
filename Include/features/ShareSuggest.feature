#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@ShareSuggest
Feature: Share Suggestion Feature
  I want to share suggestion on Empxtrack system

  @Valid
  Scenario Outline: Share suggestion on system
    Given I want to navigate to share suggestion
    When I input <specifyArea> for the suggestion
    And I input <suggestionArea> for suggesting
    Then I click to submit suggestion

    Examples: 
      | specifyArea  | suggestionArea |
      | IT Deparment |  More Laptops  |
      | HR Department|  More devices  |