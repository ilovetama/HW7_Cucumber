Feature: As a user I want to see that a submenu has appeared and displays sections: division
  by price, by city and brand while hovering over a menu item "Автобарахолка"

  Scenario: Submenu should contains the following sections: division by price, division by city and
  division by brand
    Given the user opens onliner home page
    When the user hovers over a menu item "Автобарахолка"
    Then submenu appears
#    And following sections are displayed
#      | division by price |
#      | division by city  |
#      | division by brand |