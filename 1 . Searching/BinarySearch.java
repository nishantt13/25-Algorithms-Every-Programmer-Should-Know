import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the sorted array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // Binary search requires a sorted array, so we'll sort it first.
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}

/*This Java program, named "BinarySearch," implements the binary search algorithm to find the index of a target element within a sorted integer array. Here's a short description of its key components:

1. `binarySearch` Method:
   - This method performs the binary search on a sorted integer array.
   - It takes two parameters: `arr`, the sorted array to search in, and `target`, the element to find.
   - It initializes `left` to 0 (the leftmost index of the array) and `right` to `arr.length - 1` (the rightmost index).
   - It repeatedly divides the search range in half until the target element is found or the search range becomes empty.
   - If the middle element (`arr[mid]`) is equal to the target, it returns the index of that element.
   - If the middle element is less than the target, it updates `left` to `mid + 1` to search in the right half.
   - If the middle element is greater than the target, it updates `right` to `mid - 1` to search in the left half.
   - If the target element is not found after the loop, it returns -1.

2. `main` Method:
   - This is the program's entry point.
   - It initializes a `Scanner` object to read user input.
   - It prompts the user to enter the length of the sorted array and reads the input.
   - It creates an integer array `arr` of the specified length.
   - It prompts the user to enter the sorted elements of the array and populates the `arr` array.
   - It prompts the user to enter the element they want to search for (`target`).
   - It sorts the `arr` array using `Arrays.sort` because binary search requires a sorted array.
   - It calls the `binarySearch` method to search for the `target` in the sorted array.
   - It then prints whether the element was found at a particular index or if it was not found.

3. The program is designed to handle sorted integer arrays and provides feedback on whether the target element is present in the array and, if so, at which index.

4. Finally, the program closes the `Scanner` object to release resources.

Note: The binary search algorithm works efficiently on sorted arrays and can quickly locate elements within them. It relies on the array being sorted for its effectiveness.*/
