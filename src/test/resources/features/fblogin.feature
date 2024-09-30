Feature: Fblogin verification
Scenario: Verify Valid Login
Given open browser And Open Facebook
When enter Username And Password And click loginButton
Then Verify Homepage