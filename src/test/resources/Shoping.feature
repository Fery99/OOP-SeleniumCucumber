@Shoping
  Feature:Shoping
  @viewAllList
  Scenario: All Item Dispalyed
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user click open menu button
    When user click all items
    Then user is on All List Item

    @detailItems
    Scenario: Display detailed of item selection
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      And user is on homepage
      When  user click item selection
      Then  user is on page of item selection

    @addItemToChart
    Scenario: Item selection can be add to chart
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      And user is on homepage
      And  user click item selection
      When  user is on page of item selection
      Then user click Add to chart

    @buyItem
    Scenario: Item selection can be add to chart
      Given user is on login page
      And user input username with "standard_user"
      And user input password with "secret_sauce"
      And user click login button
      And user is on homepage
      And user inspec item on Page Chart
      And USer on Page Chart
      And user click Checkout
      And user is on Page checkot
      And user input Frist Name with "Fery"
      And user input Last Name  with "Sadewa"
      And user input Zip/Code with "53132"
      And  user click item Continue
      And user is on Page Checkout Overview
      When user click Finish
      Then user is on Page Checkout Complete
