import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter integers
        System.out.println("Enter a list of integers separated by spaces:");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        // Prompt user to choose a sorting algorithm
        System.out.println("Select a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                SortingAndSearchingApp.bubbleSort(numbers);
                System.out.println("Array sorted using Bubble Sort:");
                break;
            case 2:
                SortingAndSearchingApp.selectionSort(numbers);
                System.out.println("Array sorted using Selection Sort:");
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Display the sorted array
        SortingAndSearchingApp.displayArray(numbers);

        // Prompt user to search for an integer
        System.out.println("Enter an integer to search for:");
        int target = scanner.nextInt();

        // Perform binary search and display the result
        boolean found = SortingAndSearchingApp.binarySearch(numbers, target);
        if (found) {
            System.out.println("The integer " + target + " was found in the array.");
        } else {
            System.out.println("The integer " + target + " was not found in the array.");
        }

        scanner.close();
    }
}