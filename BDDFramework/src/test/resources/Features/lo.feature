Feature: Login page Automation of sauce demo

  Scenario Outline: check login with valid credentails
    Given user is on login page
    When user enters valid <username> and <password>
    And clicks on login button
    Then user is neviagted to home page
    And close the browser

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
