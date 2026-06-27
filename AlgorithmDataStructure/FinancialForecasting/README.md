# Financial Forecasting

## Objective

The objective of this program is to predict future financial values using a recursive approach based on past growth rates.

---

## Concept of Recursion

Recursion is a programming technique where a function calls itself until a base condition is reached.

It helps solve problems by breaking them into smaller sub-problems.

### Components of Recursion:

1. Base Case → stops the recursion
2. Recursive Call → function calling itself

---

## Setup

We calculate future value using the formula:

Future Value = Current Value × (1 + Growth Rate)

A recursive method is used where each year’s value is calculated based on the previous year.

---

## Implementation

The recursive function works as follows:

- If year = 0 → return initial value (base case)
- Else → calculate previous year value recursively
- Multiply it with growth rate to get current year value

This continues until the required number of years is reached.

---

## Example

Initial Value = 10000  
Growth Rate = 10%  
Years = 3

Year 1 = 11000  
Year 2 = 12100  
Year 3 = 13310

---

## Complexity Analysis

### Recursive Approach:

- Time Complexity: O(n)
- Space Complexity: O(n) (due to recursion stack)

### Iterative Approach:

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Optimization

The recursive solution can be optimized using **memoization** (caching previous results).

This avoids recalculating the same values multiple times and improves efficiency.

Another optimization is converting recursion into an iterative loop to reduce stack usage.

---

## Conclusion

Recursion provides a simple and clear way to calculate future financial values by breaking the problem into smaller steps.

However, it may not be efficient for large inputs due to repeated function calls and stack usage.

To improve performance, memoization or iterative approaches can be used, making the solution more efficient and scalable.

---

## Output Screenshot

The output of the program is shown below:

📸 File Name: FinancialForecastOutput.png

This screenshot shows the recursive calculation of future financial values based on the given growth rate and number of years.
