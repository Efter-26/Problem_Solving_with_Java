# Problem-Solving-With-JAVA
## Project Overview
### This project is a collection of 12 basic Java programs that demonstrate various problem-solving techniques. Below is an overview of each problem and its solution.
---

## Tools and Environment
- **JDK Version**: 11
- **IDE**: IntelliJ IDEA
- **Build Tool**: Gradle
- **DSL**: Groovy

---

### Problem 1: Find the 2nd Highest CGPA (Linear Search)
Given the CGPA list of 10 students: 
`[3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]`

- **Objective**: Find the student with the 2nd highest CGPA without sorting the array.
### Approach:

1. Initialize two variables: `highest_cgpa` and `second_highest_cgpa` with the first value of the CGPA array.
2. Loop through the array:
   - If the current CGPA is higher than `highest_cgpa`, update `second_highest_cgpa` to the value of `highest_cgpa` and then update `highest_cgpa` to the current CGPA.
   - If the current CGPA is greater than `second_highest_cgpa` but not equal to `highest_cgpa`, update `second_highest_cgpa`.
3. After the loop, print the second highest CGPA.

---

### Problem 2: Sort CGPA in Descending Order (Manual Sorting)
Using the same CGPA array, sort the CGPAs in descending order.

- **Objective**: Sort the array programmatically without using the `Arrays.sort()` method.
### Approach:

1. **Initialize**: 
   - Create an array of CGPA values.
   
2. **Sorting Logic**: 
   - Use a nested loop to compare each element in the array.
   - If a CGPA is smaller than the next one, swap their positions to arrange the array in descending order.
   
3. **Display Result**:
   - After the sorting is complete, print the CGPAs in descending order.

---

### Problem 3: Binary Search for CGPA (User Input)
- **Objective**: Take a CGPA as input from the user and check if it exists in the given array using binary search.
### Approach:

1. **Input and Sorting**:
   - Take user input for the CGPA to search.
   - Sort the CGPA array using a nested loop to arrange it in ascending order.

2. **Binary Search**:
   - Initialize two pointers: `left` (start of the array) and `right` (end of the array).
   - Perform binary search by repeatedly dividing the array in half:
     - If the middle element matches the input CGPA, mark it as found.
     - If the input CGPA is greater than the middle element, search the right half.
     - If the input CGPA is smaller, search the left half.
   
3. **Result**:
   - If the CGPA is found, print "CGPA found".
   - If not, print "CGPA not found".


---

### Problem 4: Generate 10 Random Numbers and Find Max/Min
- **Objective**: Generate 10 random integers, print all numbers, and find the maximum and minimum values.
### Approach

1. **Generate Random Numbers**:
   - Create an array of size 10.
   - Populate the array with random integers between 0 and 99 using `Math.random()`.

2. **Display Generated Numbers**:
   - Iterate through the array and print each number.

3. **Find Maximum and Minimum**:
   - Initialize `max` and `min` variables to the first element of the array.
   - Traverse the array:
     - If an element is greater than `max`, update `max`.
     - If an element is less than `min`, update `min`.

4. **Display Results**:
   - Print the maximum and minimum values identified.


---

### Problem 5: Breakdown Amount into Currency Notes
- **Objective**: Break down a given amount (e.g., 546) into notes of different denominations: `[1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]`. and print the output like this.

![image](https://github.com/user-attachments/assets/b35484b8-f157-4ecd-a454-f666f03abbc1)

### Approach:

1. **Initialize**:
   - Create an array of currency notes in descending order.
   
2. **Input**:
   - Take the amount as input from the user.

3. **Breakdown Logic**:
   - Use a loop to check if the amount is greater than or equal to the current note value.
   - If it is, calculate how many notes of that denomination are needed and subtract the corresponding amount.
   - Continue this process for all note values until the amount becomes zero.

4. **Display Result**:
   - For each denomination, print the note value and the count of notes used.

---
### Problem 6: Pattern Printing
- **Objective**: Print the following pattern:

![image](https://github.com/user-attachments/assets/e1768927-d450-4f4f-823f-4d62f1e1f45b)

### Approach:

1. **First Pattern**:
   - Use two nested loops.
   - The outer loop runs from 1 to 4, and the inner loop prints numbers starting from 1, decreasing the number of values printed in each line until 1 value is printed on the last line.

2. **Second Pattern**:
   - Use another set of nested loops.
   - The outer loop runs from 1 to 5, and the inner loop prints increasing numbers from 1, growing the number of printed values in each line until 5 values are printed on the last line.

3. **Display Result**:
   - Print the two patterns consecutively, where the first one prints numbers in decreasing order, and the second one prints numbers in increasing order.

---
### Problem 7: Find the 2 Lowest Heights (Linear Search)
- **Objective**: To find the two lowest heights from an array of 10 baby heights using a linear search algorithm. The solution avoids using built-in sorting methods and instead iterates through the array to determine the smallest and second smallest values.
### Approach:

1. **Input Heights**:
   - Prompt the user to enter the heights of 10 babies and store them in an array.

2. **Display Heights**:
   - Print the 10 heights entered by the user.

3. **Sorting Logic**:
   - Use a nested loop to sort the heights in ascending order by comparing and swapping elements if needed.

4. **Display Result**:
   - After sorting, print the first two positions from the array.

---

### Problem 8: Word, Character, Vowel, and Consonant Count
Given the string: `"I am a SQA Engineer"`,

- **Objective**: Count the number of words, characters (excluding spaces), vowels, and consonants.
- **Output Example**: Words: 5  Chars: 15  Vowel: 8  Consonant: 7
### Approach:

1. **Input String**:
   - Take a string input from the user.

2. **Word Count**:
   - Split the input string by spaces and count the number of words.

3. **Character Count Without Spaces**:
   - Remove spaces from the string and count the total characters left.

4. **Vowel and Consonant Count**:
   - Convert the string to lowercase and iterate through each character.
   - For each character:
     - If it's a letter, check if it's a vowel (using a predefined vowel string).
     - Increment the vowel count if found in the vowel list, otherwise increment the consonant count.

5. **Display Results**:
   - Print the total number of words, characters (excluding spaces), vowels, and consonants.

---

### Problem 9: Character Occurrence in a String
Given the string: `"I live in Dhaka"`,

- **Objective**: Count the number of occurrences of each character.
- **Output Example**: i 3 l 1 v 1 e 1 n 1 d 1 h 1 a 2 k 1

### Approach:

1. **Input String**:
   - Take a string input from the user.

2. **Convert to Lowercase**:
   - Convert the string to lowercase and store the characters in an array.

3. **Count Occurrences**:
   - Use a `LinkedHashMap` to keep track of each character's occurrence.
   - Iterate through the character array, and for each character (excluding spaces), increment its count in the map.

4. **Display Results**:
   - Loop through the `LinkedHashMap` and print each character along with its occurrence count.

---

### Problem 10: Print Non-Duplicate Numbers
Given the array: `[1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7]`,

- **Objective**: Print the numbers that are not duplicated.
- **Output Example**: `3, 6, 7`

### Approach:

1. **Input Numbers**:
   - Prompt the user to input the total count of numbers and then enter the numbers into an array.

2. **Track Occurrences**:
   - Use a `LinkedHashMap` to store each number and count its occurrences as the user inputs them.

3. **Identify Non-Duplicate Numbers**:
   - Loop through the `LinkedHashMap` and identify numbers that appear only once.

4. **Display Result**:
   - Print the numbers that are not duplicates, separated by commas.

---

### Problem 11: Remove Vowels from a String
Given the string: `"I am a SQA Engineer"`,

- **Objective**: Remove all vowels from the string.
- **Output**: `m sq ngnr`

### Approach:

1. **Input String**:
   - Take a string input from the user and convert it to lowercase.

2. **Split String into Words**:
   - Split the input string into individual words using spaces as the delimiter.

3. **Remove Vowels**:
   - For each word, use the `replaceAll()` method to remove all vowels (`a, e, i, o, u`).

4. **Rebuild the String**:
   - Append the words without vowels back into a `StringBuilder`, ensuring proper spacing between words.

5. **Display Result**:
   - Trim any extra spaces and print the string without vowels.

---

### Problem 12: Calculate Total Cost after Discount
Given the following scenario:
- A Core i7 laptop costs 85,000 tk, and a gaming mouse costs 2,500 tk. 
- **Objective**: Calculate the total cost if you buy both items after applying a 15% discount.

### Approach

1. **Extract Digits**:
   - Use regular expressions to remove non-digit characters and extract only the numeric values (prices and discount).
2. **Clean and Split Data**:
   - Remove extra spaces and split the extracted digits into an array for further processing.
3. **Parse Values**:
   - Convert the extracted numeric strings to `double` to represent the laptop price, mouse price, and discount percentage.
4. **Calculate Total**:
   - Sum the laptop and mouse prices.
5. **Apply Discount**:
    - Calculate the discount and subtract it from the total price.
6. **Round and Output**:
    - Round the final total cost after applying the discount and print it.

---

## Google Docs Link
For the complete code and output for each of these problems, refer to this [Google Doc](https://docs.google.com/document/d/1TRtIAThJrV0cA_BlylQI_zFZote8du7-4JAnSJN-o3c/edit?usp=sharing).

