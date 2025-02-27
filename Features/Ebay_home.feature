Feature: Ebay Home page scenario
@S1
  Scenario: Advanced Search Link

    Given I am at Ebay Home page
    When I click on Advanced link
    Then I should navigate to Advanced Search Page

  @S3 @setCookies
  Scenario: Search Item Count

    Given I am at Ebay Home page
    When I search for 'iPhone 11'
    Then I should get atleast 1000 search items

@S4 @setCookies
  Scenario: Search Item Count

    Given I am at Ebay Home page
    When I search for 'Trimmers'
    Then I should get atleast 3000 search items
@S5 @setCookies
Scenario: Search Item in a category

  Given I am at Ebay Home page
  When I search for 'Soap' in 'Baby' category