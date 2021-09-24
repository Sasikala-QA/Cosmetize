
@smokefeature
 Feature: feature to test login functionality
@smoketest 
 Scenario: Check Login is successful with valid credentials
 
 Given browser is open
 And enter "http://www.cosmetize.com" Site
  When click on Login button
 When user enters username and password 
 And click on signin button 
 And click  on wigs button in the home page 
 And click on synthetic wigs 
 And click on add to cart 
  And click on go to cart 
 And click on move to wishlist
 And click on checkout
 And  click on add new address
 Then  click on save
 Then close the browsers
  
 Example: 
 | Username    |                    |Password|
 |sasikalavallathuru@gmail.com|     |Sasikala@1998|
 