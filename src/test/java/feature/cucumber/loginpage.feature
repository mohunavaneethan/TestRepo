Feature: LoginPage TestCases

  Scenario: login with valid credentials
    Given open browser
    And launch adactin url
    When enter the username "mohanraj"
    And enter the password "mohan@123"
    And click on login button

  Scenario Outline: login with valid credentials
    Given open browser
    And launch adactin url
    When enter the username as "<username>"
    And enter the password as "<password>"
    And click on login button

    Examples: 
      | username | password    |
      | mohan    | mohan123    |
      | mohanraj | mohanraj123 |
      | vasuki   | vasuki123   |
