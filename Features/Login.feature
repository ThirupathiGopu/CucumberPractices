Feature: Login

Scenario: Login with valid credrtials 
Given Lanch chrome browser
When open url"https://admin-demo.nopcommerce.com/login"
And isdplayed text "Admin area demo"
And Enter user name "admin@yourstore.com" 
And Enter Password "admin"
And click on login link
Then Page Title should be "Dashboard / nopCommerce administration"
When click on logout button
Then Page Title should be "Your store.Login"
And close browser

