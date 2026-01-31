Feature: google home page

  Scenario: Home page title
    Given user is on google home page
    When  user look for title
    Then  title should be "Google"

  Scenario: search function
    Given user is on google home page
    When  user search for "ajay"
    Then  suggetion should contain 10 suggetion