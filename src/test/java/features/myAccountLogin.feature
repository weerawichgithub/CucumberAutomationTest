Feature: My Account Login

  Scenario Outline: Log-in with invalid username and password.
    Given Open the browser
    When Enter the URL practice.automationtesting.in
    And Click on My Account Menu
    And Enter "<username>" in username textbox and "<password>" in password textbox
    When Click on login button
    Then Webpage must show error message

    Examples:
      |username|password|
      |vinvin8889||
      |iambot@gmail.com||
      |iambot@gmail.com|asdfasdf|













