import java.util.Arrays;

public class Solution {
    // Method to remove duplicates and return the number of unique elements
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;  // Pointer to track the index of the last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;  // Move the pointer to the next unique element's position
                nums[i] = nums[j];  // Place the next unique element at the new position
            }
        }

        return i + 1;  // Return the number of unique elements
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: Input [1, 1, 2]
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Number of unique elements: " + k1);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums1, k1)));

        // Example 2: Input [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Number of unique elements: " + k2);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums2, k2)));
    }
}
