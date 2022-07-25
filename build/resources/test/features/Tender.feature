Feature: Filter search
  Background: located on main page
    Given Open webpage "https://www.rts-tender.ru/"

    Scenario: Filter Search
      Then in footer click on "Поставщикам" link
      Then in search bar click on "Расширенный поиск" link
      Then in search window click on "Настроить" button
      Then in opened modal click on "615-ПП РФ" checkbox
      And click on "Исключить совместные покупки" checkbox
      And click on "Алтайский край" region checkbox
      And select date TODAY
      And click on "Найти" button

#      Then

