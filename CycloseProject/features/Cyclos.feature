Feature:Test login for Cyclos
Scenario:Test Cyclos with valid credentials

Given Open Chrome and start application
When I provide valid username and password
Then user should be able to login



Given Links should be displayed
When Click on Account link
Then links should get displayed

Given Search transactions
When Click on Account Information link
Then Search transactions on Member account page with all the transactions should get displayed

Given Transactions details should be displayed
When Click on View icon of Particular transaction
Then Transaction details page containing detailed transaction should get displayed

Given Display all transactions
When Click on Back button
Then All the transactions should get displayed

