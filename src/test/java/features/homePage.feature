Feature: HomePage Functionalities

  Scenario: 1. Home Page with three Sliders only
    Given Open the browser
    When  Enter the URL practice.automationtesting.in
    And   Click on Shop Menu
    And   Now click on Home menu button
    And   Test whether the Home page has Three Sliders only
    Then  The Home page must contains only three sliders

  Scenario: 2. Home page with three Arrivals only
    Given Open the browser
    When  Enter the URL practice.automationtesting.in
    And   Click on Shop Menu
    And   Now click on Home menu button
    And   Test whether the Home page has Three Sliders only
    Then  The Home page must contains only three Arrivals

  Scenario: 3. Home page - Images in Arrivals should navigate
    Given Open the browser
    When  Enter the URL practice.automationtesting.in
    And   Click on Shop Menu
    And   Now click on Home menu button
    And   Test whether the Home page has Three Sliders only
    And   The Home page must contains only three Arrivals
    And   Now click the image in the Arrivals
    And   Test whether it is navigating to next page where the user can add that book into his basket.
    Then  Image should be clickable and should navigate to next page where user can add that book to his basket














