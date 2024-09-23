import java.util.HashMap;

public class Solution {

    public int romanToInt(String s) {
        // Create a map for Roman numeral values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        // Iterate through the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);
            
            // If the current value is less than the previous one, subtract it, otherwise add it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            
            prevValue = currentValue; // Update the previous value
        }
        
        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println("Roman numeral 'III' converts to: " + solution.romanToInt("III"));         // Output: 3
        System.out.println("Roman numeral 'LVIII' converts to: " + solution.romanToInt("LVIII"));     // Output: 58
        System.out.println("Roman numeral 'MCMXCIV' converts to: " + solution.romanToInt("MCMXCIV")); // Output: 1994
    }
}
