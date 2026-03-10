Feature: Search Amazon

  Scenario Outline: Search Electronics
    Given Go to Amazon
    When Change currency
    Then Put to search "<product>"
    And Search electronic
    And Must show me "<product>" List with "<keyword>" with <value>
    And Select Quantity <quantity> about this "<product>"
    And Add Product to cart
    And Nav to Cart
    And Init checkout process

    Examples:
      | product           | keyword  | value | quantity |
      | Chasis PC Corsair | Corsair  | 80    | 2        |
      | Noctua NH-D15     | Noctua   | 120   | 1        |
      | Monitor Lg        | LG       | 150   | 4        |