Feature: Calculator

  Scenario Outline: Multiply two integers
    When the system is run with arguments <a> and <b>
    Then the system displays <product>

    Examples:
      | a  | b  | product |
      |  6 |  7 |  42     |