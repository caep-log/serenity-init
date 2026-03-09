Feature: Search Amazon

  Scenario Outline: Search Electronics
    Given Go to Amazon
    When Change currency
    Then Put to search "<product>"
    And Search electronic
    And Must show me "<product>" List with "<keyword>" with <value>
    And Add Product to cart
    And Nav to Cart
    And Init checkout process

    Examples:
      | product           | keyword  | value |
      | Chasis PC Corsair | Corsair  | 80 |
      | Noctua NH-D15     | Noctua   | 120 |
      | Monitor Lg        | LG       | 150 |