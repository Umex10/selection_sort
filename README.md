# 📦 Java Selection Sort Demo

A Java console application demonstrating a **generic Selection Sort** algorithm that works with both `Integer` and `Double` objects.

## 🧠 Project Description

This program:

- Generates an array of random `Integer` values (0-100)
- Generates an array of random `Double` values (0.0-100.0, rounded to 2 decimal places)
- Prints both arrays before and after sorting
- Sorts both arrays using a **generic Selection Sort** implementation

## 📁 Project Structure

```bash
src/
└── at/
    └── fhj/
        └── msd/
            └── App.java
```

## 🚀 Running the Program

### Prerequisites

- Java 8 or higher
- IDE like IntelliJ IDEA or use the command line

### Compile and Run

```bash
javac at/fhj/msd/App.java
java at.fhj.msd.App
```

## 📌 Sample Output

```text
Before:
[53, 74, 23, 19, 45, 61, 87, 36, 97, 5]
[54.62, 98.27, 15.99, 48.95, 66.79, 17.25, 60.38, 51.9, 73.79, 59.84]
After:
[5, 19, 23, 36, 45, 53, 61, 74, 87, 97]
[15.99, 17.25, 48.95, 51.9, 54.62, 59.84, 60.38, 66.79, 73.79, 98.27]
```

## Selection Sort Explained

Here's a step-by-step explanation of how Selection Sort works, using the same integer array example for comparison:

### 🧩 Example Array
Let's sort this array: `[5, 2, 4, 6, 1, 3]`

### 🔍 Step-by-Step Process

1. **Initial State**  
   `[5, 2, 4, 6, 1, 3]`  
   (Entire array is unsorted initially)

2. **Pass 1 - Find smallest in [0:5]**  
   - Minimum = `1` at index 4  
   - Swap with position 0 (`5` ↔ `1`)  
   Result: `[1, 2, 4, 6, 5, 3]`

3. **Pass 2 - Find smallest in [1:5]**  
   - Minimum = `2` (already at correct position)  
   - No swap needed  
   Result: `[1, 2, 4, 6, 5, 3]`

4. **Pass 3 - Find smallest in [2:5]**  
   - Minimum = `3` at index 5  
   - Swap with position 2 (`4` ↔ `3`)  
   Result: `[1, 2, 3, 6, 5, 4]`

5. **Pass 4 - Find smallest in [3:5]**  
   - Minimum = `4` at index 5  
   - Swap with position 3 (`6` ↔ `4`)  
   Result: `[1, 2, 3, 4, 5, 6]`

6. **Pass 5 - Find smallest in [4:5]**  
   - Minimum = `5` (already at correct position)  
   - No swap needed  
   Final Result: `[1, 2, 3, 4, 5, 6]`

### 📊 Visualization

| Pass | Array State           | Action Taken                          |
|------|-----------------------|---------------------------------------|
| 0    | [5, 2, 4, 6, 1, 3]   | Initial state                         |
| 1    | [1, 2, 4, 6, 5, 3]   | Swapped 5 ↔ 1 (smallest in full array)|
| 2    | [1, 2, 4, 6, 5, 3]   | No swap (2 already correct)          |
| 3    | [1, 2, 3, 6, 5, 4]   | Swapped 4 ↔ 3                        |
| 4    | [1, 2, 3, 4, 5, 6]   | Swapped 6 ↔ 4                        |
| 5    | [1, 2, 3, 4, 5, 6]   | No swap (array sorted)               |

### 🧠 Key Concept
Selection Sort works by:
1. Dividing the array into "sorted" (left) and "unsorted" (right) parts
2. Finding the smallest element in the unsorted part
3. Swapping it with the leftmost unsorted element
4. Expanding the sorted boundary by 1 position

### ⏱️ Performance
For our example (6 elements):
- Total comparisons: 15 (n(n-1)/2)
- Total swaps: 3 (n-1 in worst case)
- Always O(n²) complexity (even in best case)

### 🔄 vs Insertion Sort
| Feature         | Selection Sort      | Insertion Sort       |
|-----------------|---------------------|----------------------|
| **Swaps**       | O(n)               | O(n²) worst case     |
| **Comparisons** | Always O(n²)       | O(n) best case       |
| **Best for**    | Minimal swaps      | Nearly sorted data   |
| **Stable**      | ❌ No              | ✅ Yes               |

## 📚 Method Overview

| Method             | Description                                                | Generics Specification                                |
| ------------------ | ---------------------------------------------------------- | ----------------------------------------------------- |
| `printArray()`     | Prints elements of any array type in a readable format     | Unbounded generic: `<T>`                              |
| `selection_sort()` | Sorts any numeric array using the Selection Sort algorithm | Bounded generic: `<T extends Number & Comparable<T>>` |
| `swap()`           | Swaps two elements in a numeric array                      | Bounded generic: `<T extends Number & Comparable<T>>` |


## 🧠 Selection Sort – Algorithm Analysis

| Property            | Value                                       |
|---------------------|---------------------------------------------|
| **Best Case**        | 🕒 `O(n²)` – even if the array is already sorted |
| **Average Case**     | 🕒 `O(n²)`                                    |
| **Worst Case**       | 🕒 `O(n²)` – occurs when the array is in reverse order |
| **In-Place**         | ✅ Yes – uses only a constant amount `O(1)` of extra space |
| **Stable**           | ❌ No – selection sort may change the relative order of equal elements |
| **Adaptive**         | ❌ No – does not take advantage of existing order in the input |

### 🔍 Explanation

- **In-place** ✅:  
  Selection sort performs sorting directly in the input array and does not use additional data structures.

- **Stable** ❌:  
  When selecting the minimum element and swapping, elements with equal value may be reordered.

- **Adaptive** ❌:  
  The algorithm always goes through the full comparison process regardless of how sorted the input already is.

### 📌 Summary

Selection Sort is simple to implement and has predictable performance characteristics, but it is inefficient on large lists and is generally outperformed by more advanced algorithms like Merge Sort or Quick Sort.

## ✍️ Author

- Umejr Dzinovic