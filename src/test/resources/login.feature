Feature: Login

  # Test Case 1: Successful Login with Valid Credentials

@successfulLogin
Scenario: User logs in with valid phone number and password
  Given the user is on the login page
  When the user enters a valid phone number "938013700"
  And the user enters a valid password "T11112222"
  And the user clicks the login button
  Then the user should be redirected to the dashboard

