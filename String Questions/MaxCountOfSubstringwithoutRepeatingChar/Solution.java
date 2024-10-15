import java.util.HashSet;

public class Solution {
   public static int lengthOfLongestSubstring(String s) {
       int maxLength = 0;

       for (int i = 0; i < s.length(); i++) {
           HashSet<Character> seenChars = new HashSet<>();

           for (int j = i; j < s.length(); j++) {
               char currentChar = s.charAt(j);

               if (seenChars.contains(currentChar)) {
                   break;
               }

               seenChars.add(currentChar);
               maxLength = Math.max(maxLength, j - i + 1);
           }
       }
       return maxLength;
   }

   public static void main(String[] args) {
       String s = "abcabcbb";
       int maxLength = lengthOfLongestSubstring(s);
       System.out.println("Max count of substring without repeating its char: " + maxLength);  // Expected: 3
   }
}
