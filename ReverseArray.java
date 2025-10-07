public class ReverseArray {
    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {10, 20, 30, 40, 50};
        printReverse(arr1);

        // Test Case 2
        int[] arr2 = {7};
        printReverse(arr2);
    }

    public static void printReverse(int[] arr) {
        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n---------------------");
    }
}
