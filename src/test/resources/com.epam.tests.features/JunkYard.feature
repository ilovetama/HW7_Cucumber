@test
Feature: As a user I want to see that a submenu has appeared and displays: price section,
  city section and brand section while hovering over a menu item "Автобарахолка"

  Scenario: Submenu should contains the following sections: price, city and brand
    Given the user opens onliner home page
    When the user hovers over a menu item "Автобарахолка"
    Then submenu appears
    And price section is displayed
      | Авто до 4000 р.   |
      | Авто до 10 000 р. |
    And city section is displayed
      | Минск   |
      | Гомель  |
      | Могилев |
      | Витебск |
      | Гродно  |
      | Брест   |
    And brand section is displayed
      | Audi          |
      | BMW           |
      | Citroen       |
      | Ford          |
      | Mazda         |
      | Mercedes-Benz |
      | Nissan        |
      | Opel          |
      | Peugeot       |
      | Renault       |
      | Toyota        |
      | Volkswagen    |
