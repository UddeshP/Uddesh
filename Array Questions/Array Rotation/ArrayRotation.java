import java.util.Arrays;

public class ArrayRotation {
    // Function to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array by 'k' positions
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        
        // Handle cases where k is larger than array length
        k = k % n;
        
        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);
        
        // Step 2: Reverse the first 'k' elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse the remaining 'n - k' elements
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate

        System.out.println("Original array: " + Arrays.toString(arr));

        rotate(arr, k);

        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));
    }
}
