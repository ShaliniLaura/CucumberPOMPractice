Feature: conduit Article Post

Scenario: User Login
Given User is on Login Page
When User enters "sharinelaura@gmail.com" and "Shalini"
Then User should be on Home Page

Scenario: Add an new article
Given User is on New Article page
When User adds details for Article
| ArticleTitle | ArticleAbout | ArticleDetail |
| Case Study- SS2  | Selenium     | Cucumber and POM |
#datatable
Then New Article should be added

Scenario: Update an article
Given User is on Global Feed page
When User modifies the article #article detail
Then Article should be updated

Scenario: Delete an article
Given User is on Global Feed page
When User deletes the article #article detail
Then Article should be deleted
