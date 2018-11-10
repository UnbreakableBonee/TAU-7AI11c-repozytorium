Feature: Typowe Testy cucumbera

  Scenario Outline: Historia pewnego użytkownika
    When użytkownik jest na naszej stronie
    Then lubi dużo napsocić "<nazwa>" innemu człowiekowi
    But iż będzie usunięty on raz z użytkownikiem <numer1> i <numer2>
    And użytkownikiem <numer3>
    Then i tak sporo przeszkud napsoci MI!

    Examples:
    | nazwa | numer1 | numer2 | numer3 |
    | janusz | 1 | 2 | 0 |
    | ktos | 0 | 2 | 1 |