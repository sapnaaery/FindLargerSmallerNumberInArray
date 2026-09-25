Find Largest and Smallest Number in an Array
A simple Java program that finds the largest and smallest numbers in an integer array using a single loop.

📌 Description
This program demonstrates how to:

Find the maximum value in an integer array.

Find the minimum value in an integer array.

Handle an empty or null array.

Traverse an array using a for loop.

Compare and update minimum and maximum values.

🛠️ Technologies Used
Java

Arrays

for loop

Conditional statements (if)

📂 Package
day7

📄 Class
FindLargestSmallestNumberInArray

💻 Source Code
package day7;

public class FindLargestSmallestNumberInArray {

    public static void main(String[] args) {

        int[] arr = {10, -6, 70, 89, 3, 11, 14, 25, 17};

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Initialize max/min variables
        int maxNumber = arr[0];
        int minNumber = arr[0];

        // Update max/min values in the array
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }

            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        System.out.println("Maximum number is: " + maxNumber);
        System.out.println("Minimum number is: " + minNumber);
    }
}

▶️ Sample Input
{10, -6, 70, 89, 3, 11, 14, 25, 17}

📤 Sample Output
Maximum number is: 89
Minimum number is: -6

🔍 How It Works
The program creates an integer array.

It checks whether the array is null or empty.

The first element is initially assigned to both maxNumber and minNumber.

The program loops through the remaining elements.

If an element is smaller than minNumber, minNumber is updated.

If an element is larger than maxNumber, maxNumber is updated.

Finally, the minimum and maximum values are printed.

⏱️ Complexity
Time Complexity: O(n) — the array is traversed once.

Space Complexity: O(1) — only two additional variables are used.

🎯 Learning Objective
This example is useful for practicing Java arrays, loops, conditional statements, and basic time/space complexity analysis.
