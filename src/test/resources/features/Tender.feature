Feature: Filter search
  Background: located on main page
    Given Open webpage "https://www.rts-tender.ru/"

    Scenario: Filter Search
      Then in footer click on "Поставщикам" link
      Then in search bar click on "Расширенный поиск" link
