import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Find the complement that adds up to the target
            int complement = target - nums[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No solution found for the given input.");
    }

    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        
        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        // Output the result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
