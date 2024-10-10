public class RemoveDuplicates {

    // Function to remove duplicates in-place and return the count of unique elements
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // Start the 'i' pointer at 1, as the first element is always unique
        int i = 1;

        // Iterate through the array starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the previous one, it is unique
            if (nums[j] != nums[j - 1]) {
                // Place the unique element at the position 'i'
                nums[i] = nums[j];
                // Move 'i' to the next position
                i++;
            }
        }

        // Return the count of unique elements (i is now the number of unique elements)
        return i;
    }

    // Main method for testing the solution
    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // Create an instance of the class
        RemoveDuplicates solution = new RemoveDuplicates();

        // Call the removeDuplicates method and get the count of unique elements
        int k = solution.removeDuplicates(nums);

        // Output the result
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        
        // Print the first 'k' elements of the modified array
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
