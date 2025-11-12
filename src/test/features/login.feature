Feature: login
Scenario Outline: User login with valid credentials.
  Given : I am on the amazon page
  When : user enters <email> and <password>
  And :click on login button
  Then : user should be logged into amazon account
  Examples:
    | email | password |
    |cciuikn@gmail.com|aaa|
    |okijh@gmail.com  |bbb|