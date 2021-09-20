 
 
@smokefeature
 Feature: feature to test login functionality
@smoketest 
 Scenario: Check Login is successful with valid credentials 
 Given browser is open
 And enter "http://www.cosmetize.com" Site
 When click on Login button
 When user enters username and password 
 And click on signin button 
 When user should be taken to successful login page 
 And click  on account button in the home page 
 And click on Logout 
 Then close the browsers
  
 Example: 
 | Username    |                    |Password|
 |sasikalavallathuru@gmail.com|     |Sasikala@1998|
 