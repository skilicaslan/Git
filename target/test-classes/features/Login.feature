Feature: Application Login

Scenario: Home Page default login
Given User is on NetBanking landing page
When User login into application with username "sean" and password "4321"
Then Home page is populated
And Cards are displayed are "true"


Scenario: Home Page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "1234"
Then Home page is populated
And Cards are displayed are "false"
