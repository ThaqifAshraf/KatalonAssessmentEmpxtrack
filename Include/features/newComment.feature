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
@Comment
Feature: Comment on User's Profile
  I want to comment on user's profile

  @Valid
  Scenario Outline: Comment on User Feature
    Given I want to navigate to dashboard
    When I input <comment> for user
    And I click on send button
    And I click on list of comment button
    Then I verify the comment in the list

    Examples: 
      | comment   |
      | Goodluck! |
      | Awesome!  |