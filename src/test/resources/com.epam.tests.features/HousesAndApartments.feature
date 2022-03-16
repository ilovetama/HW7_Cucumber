@test
Feature: As a user I want to see that a submenu has appeared and displays: city section,
  rooms section and price section while hovering over a menu item "Дома и квартиры"

  Scenario: Submenu should contains the following: city section, rooms section and price section
    Given the user opens onliner home page
    When the user hovers over a menu item "Дома и квартиры"
    Then submenu appears
    And city section is displayed
      | Минск   |
      | Гомель  |
      | Могилев |
      | Витебск |
      | Гродно  |
      | Брест   |
    And rooms section is displayed
      | 1-комнатные  |
      | 2-комнатные  |
      | 3-комнатные  |
      | 4+-комнатные |
      | Комнаты      |
    And price section is displayed
      | До 30 000 $     |
      | 30 000–80 000 $ |
      | От 80 000 $     |
      | От собственника |
      | До 250 $        |
      | 250-500 $       |
      | От 500 $        |

