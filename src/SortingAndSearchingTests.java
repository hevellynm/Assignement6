public class SortingAndSearchingTests {

    public static void main(String[] args) {
        // Test data
        int[] numbers1 = {34, 12, 25, 8, 16};
        int[] numbers2 = {45, 22, 11, 29, 7};
        int target1 = 16;
        int target2 = 30;

        System.out.println("=== Bubble Sort Test ===");
        int[] bubbleTestArray = numbers1.clone();
        SortingAndSearchingApp.bubbleSort(bubbleTestArray);
        System.out.print("Sorted Array: ");
        SortingAndSearchingApp.displayArray(bubbleTestArray);
        boolean result1 = SortingAndSearchingApp.binarySearch(bubbleTestArray, target1);
        System.out.println("Binary Search for " + target1 + ": " + (result1 ? "Found" : "Not Found"));

        System.out.println("\n=== Selection Sort Test ===");
        int[] selectionTestArray = numbers2.clone();
        SortingAndSearchingApp.selectionSort(selectionTestArray);
        System.out.print("Sorted Array: ");
        SortingAndSearchingApp.displayArray(selectionTestArray);
        boolean result2 = SortingAndSearchingApp.binarySearch(selectionTestArray, target2);
        System.out.println("Binary Search for " + target2 + ": " + (result2 ? "Found" : "Not Found"));

        System.out.println("\n=== Combined Test ===");
        System.out.print("Initial Array: ");
        SortingAndSearchingApp.displayArray(numbers1);
        SortingAndSearchingApp.selectionSort(numbers1);
        System.out.print("After Selection Sort: ");
        SortingAndSearchingApp.displayArray(numbers1);
        boolean result3 = SortingAndSearchingApp.binarySearch(numbers1, target1);
        System.out.println("Binary Search for " + target1 + ": " + (result3 ? "Found" : "Not Found"));
    }
}
