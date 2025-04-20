# Calculator

This Java-based calculator is a modular console application that performs various mathematical operations using **object-oriented principles**. Each operation is encapsulated in its own class file to ensure clean separation of concerns and better readability. The program includes **robust exception handling** to ensure a smooth user experience.


---

## Functionalities and Their Implementation

###  `Addition.java`
- **Method:** `add(double a, double b)`
- **Function:** Returns the sum of two numbers.
- **Return Type:** `double`
- **Example:** `add(5, 3)` → `8.0`

---

###  `Subtraction.java`
- **Method:** `subtract(double a, double b)`
- **Function:** Subtracts the second number from the first.
- **Return Type:** `double`
- **Example:** `subtract(10, 4)` → `6.0`

---

###  `Multiplication.java`
- **Method:** `multiply(double a, double b)`
- **Function:** Multiplies two numbers.
- **Return Type:** `double`
- **Example:** `multiply(3, 4)` → `12.0`

---

###  `Division.java`
- **Method:** `divide(double a, double b)`
- **Function:** Divides the first number by the second.
- **Return Type:** `double`
- **Exception Handling:**
  - Throws `ArithmeticException` if the divisor is zero.
- **Example:** `divide(10, 2)` → `5.0`

---

###  `Square.java`
- **Method:** `square(double num)`
- **Function:** Returns the square of a number.
- **Return Type:** `double`
- **Example:** `square(5)` → `25.0`

---

###  `Cube.java`
- **Method:** `cube(double num)`
- **Function:** Returns the cube of a number.
- **Return Type:** `double`
- **Example:** `cube(3)` → `27.0`

---

###  `SquareRoot.java`
- **Method:** `sqrt(double num)`
- **Function:** Calculates the square root of a number.
- **Return Type:** `double`
- **Exception Handling:**
  - Throws `IllegalArgumentException` if the input is negative.
- **Example:** `sqrt(16)` → `4.0`

---

###  `CalculatorMain.java`
- This is the **driver class**.
- Contains a `main` method with a console-based **menu interface**.
- Accepts user inputs and routes them to the appropriate class method.
- **Exception Handling:**
  - Handles invalid choices using `InputMismatchException`.
  - Catches `ArithmeticException` and `IllegalArgumentException` gracefully.

---

## Exception Handling Summary

| Exception Type           | Scenario                                | Handled In            |
|--------------------------|------------------------------------------|------------------------|
| `ArithmeticException`    | Division by zero                         | `Division.java`        |
| `IllegalArgumentException` | Square root of a negative number       | `SquareRoot.java`      |
| `InputMismatchException` | User inputs invalid type (e.g. string)   | `CalculatorMain.java`  |

---



