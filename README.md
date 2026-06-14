# Java Consecutive Duplicate Detector

## Overview

This project demonstrates how to identify consecutive duplicate elements in an array using Java.

The program reads array elements from the user and checks whether any two adjacent elements are equal. If consecutive duplicates are found, it outputs `1`; otherwise, it outputs `0`.

---

## Features

* Accepts array input from the user
* Detects adjacent duplicate elements
* Uses loops and conditional statements
* Beginner-friendly implementation
* Demonstrates array traversal techniques

---

## Technologies Used

* Java
* Arrays
* Loops
* Conditional Statements
* Scanner Class

---

## Project Structure

```text
Array.java
README.md
```

---

## How It Works

### Step 1

Read the array size.

```java
int n = sc.nextInt();
```

### Step 2

Store elements in an array.

```java
int arr[] = new int[n];
```

### Step 3

Compare adjacent elements.

```java
if(arr[i] == arr[i + 1])
```

### Step 4

If consecutive duplicates are found:

```java
count++;
break;
```

The loop stops after finding the first adjacent duplicate.

---

## Sample Input 1

```text
5
1 2 2 4 5
```

### Output

```text
1
```

---

## Sample Input 2

```text
5
1 2 3 4 5
```

### Output

```text
0
```

---

## Algorithm

1. Read array size.
2. Store array elements.
3. Traverse from index 0 to n-2.
4. Compare current element with next element.
5. If equal:

   * Increment count.
   * Stop checking further.
6. Print the result.

---

## Time Complexity

```text
O(n)
```

The array is traversed only once.

---

## Space Complexity

```text
O(n)
```

Space used for storing the array.

---

## Learning Outcomes

After completing this project, you will understand:

* Array Traversal
* Adjacent Element Comparison
* Loop Optimization using break
* Basic Problem Solving in Java
* User Input Handling

---

## How to Run

### Compile

```bash
javac Array.java
```

### Execute

```bash
java Array
```

---

## Possible Enhancements

* Count all consecutive duplicate pairs
* Display duplicate values
* Find non-consecutive duplicates
* Sort array before checking duplicates
* Use ArrayList implementation

---

## Author

Supraja Shetty

---

## License

This project is open-source and available for educational and learning purposes.
