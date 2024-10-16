public class LongestPalindromicSubstring {
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        String longestPalindrome = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Expand around a single center (odd-length palindrome)
            String oddPalindrome = expandAroundCenter(s, i, i);
            // Expand around two centers (even-length palindrome)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            
            // Find the longest palindrome between odd and even cases
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        
        return longestPalindrome;
    }
   
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the valid palindromic substring
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        
        String s1 = "babad";
        System.out.println("Longest Palindromic Substring in '" + s1 + "' is: " + lps.longestPalindrome(s1));
        
        String s2 = "cbbd";
        System.out.println("Longest Palindromic Substring in '" + s2 + "' is: " + lps.longestPalindrome(s2));
    }
}
