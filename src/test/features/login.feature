Feature: login
  Background:
    Given : I am on the amazon page
    When : user enters <email> and <password>
    And :click on login button
Scenario Outline: User login with valid credentials.

  Then : user should be logged into amazon account
  Examples:
    | email | password |
    |aaa@gmail.com|aaa123|
    |bbb@gmail.com  |bbb123|