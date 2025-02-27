Feature: Ebay Advanced Search Page

  @S2
  Scenario: Ebay logo on Advanced Search page

    Given I am in Ebay Advanced search page
    When I click on Ebay logo
    Then I should navigate back to Ebay Home page


    @S6 @setCookies
    Scenario: Advance Search an Item

      Given I am in Ebay Advanced search page
      When I Search an item
        | keyword   | exclude     | min | max |
        | iphone 11 | refurbished | 300 | 900 |