# E-commerce Platform Search Function

## Objective

The goal of this program is to implement search functionality for an e-commerce platform using Linear Search and Binary Search and understand their performance differences.

## Scenario

In an e-commerce website, there are many products available. When a user searches for a product, the system should return results quickly. So, we need efficient searching techniques depending on the size and structure of data.

## Files Used

| File Name          | Description                                                       |
| ------------------ | ----------------------------------------------------------------- |
| Product.java       | Contains product details like productId, productName and category |
| SearchService.java | Contains linear search and binary search logic                    |
| Main.java          | Used to test both search methods                                  |

## Big O Notation

Big O notation is used to describe how an algorithm performs when the input size increases.

It helps us compare different algorithms based on efficiency.

Some common complexities:

- O(1) → constant time
- O(n) → linear time
- O(log n) → logarithmic time

## Best, Average and Worst Case

### Linear Search:

- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

### Binary Search:

- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Linear Search

Linear search checks each element one by one until the required product is found.

- Works on unsorted data
- Simple to implement
- Not efficient for large datasets

Time Complexity:

- O(1) best
- O(n) average
- O(n) worst

## Binary Search

Binary search works only on sorted data. It repeatedly divides the search space into half.

- Very fast for large datasets
- Requires sorted array
- Uses divide and conquer approach

Time Complexity:

- O(1) best
- O(log n) average
- O(log n) worst

## Comparison

| Feature          | Linear Search | Binary Search |
| ---------------- | ------------- | ------------- |
| Data Requirement | Unsorted      | Sorted        |
| Speed            | Slow          | Fast          |
| Time Complexity  | O(n)          | O(log n)      |
| Efficiency       | Low           | High          |

## Analysis

From the comparison, Linear Search is simple but inefficient for large datasets because it checks each element one by one.

Binary Search is more efficient because it reduces the search space by half in every step, making it much faster with O(log n) complexity.

However, Binary Search requires sorted data, so sorting is necessary before applying it.

In real-world e-commerce systems, Binary Search is preferred because fast search performance is important for handling large numbers of products.

## Conclusion

Binary Search is more efficient than Linear Search for large datasets because it significantly reduces the time complexity.

Linear Search is easy to implement but becomes slow when the dataset increases.

Therefore, for e-commerce platforms where performance is important, Binary Search is the better choice when data is sorted.

## Output Screenshot

The output of the program is attached below:

📸 File Name: EcommercePlatformSearchOutput.png

This screenshot shows the working of both Linear Search and Binary Search with the searched product result displayed in the console.
