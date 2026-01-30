Feature: google home page

  Scenario: Home page title
    Given user is on google home page
    When  user look for title
    Then  title should be "Google"