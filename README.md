# Java Array Processing Program

## Description
This Java program takes an array of integers as input from the user, processes it to separate odd and even numbers, and finds two consecutive numbers with the least difference. The program is structured into three classes:
- `Main`: Entry point of the program
- `UserInput`: Handles user input
- `ArrayFunctions`: Contains functions for array operations

## Features
- Accepts an array of 5 integers from the user.
- Separates the numbers into even and odd lists.
- Finds the two consecutive numbers with the smallest difference.
- Uses `ArrayList` for dynamic storage and manipulation of numbers.

## Files & Classes
1. **Main.java**
   - Calls methods from `UserInput` and `ArrayFunctions`.
   - Acts as the entry point of the program.

2. **UserInput.java**
   - Uses `Scanner` to take user input.
   - Returns an array of integers.

3. **ArrayFunctions.java**
   - `display(ArrayList<Integer> array)`: Prints the given array.
   - `oddEven(int[] array)`: Separates even and odd numbers and prints them.
   - `minConDiff(int[] array)`: Finds and prints two consecutive numbers with the least difference.

## Usage
### Running the Program
1. Compile the Java files:
   ```sh
   javac Main.java
   ```
2. Run the program:
   ```sh
   java Main
   ```

### Example Input/Output
#### Input:
```
Enter 5 numbers:
3 8 2 9 7
```
#### Output:
```
Odd numbers are:
[3, 9, 7]

Even numbers are:
[8, 2]

Minimum Difference: 1
Index: 3
```

## Requirements
- Java Development Kit (JDK)
- Basic understanding of Java collections (`ArrayList`)

## Methods & Functions Used
- `Scanner.nextInt()` – To read user input.
- `ArrayList<Integer>` – To store even and odd numbers separately.
- `Math.abs()` – To calculate absolute differences.
- `System.out.println()` – To display results.

## Author
- [Tanniru Hari Sri Shanmukha Sai]

## License
This project is open-source and available under the MIT License.

