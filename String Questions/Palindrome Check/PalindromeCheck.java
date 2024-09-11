

public class PalindromeCheck{
    public static boolean isPalindrome(String input)
    {
        String cleanedStr=input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        int left=0;
        int right=cleanedStr.length()-1;
        
        while(left<right)
        {
            if(cleanedStr.charAt(left)!=cleanedStr.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
      String input = "A man, a plan, a canal, Panama";
      System.out.println("Is Palindrome: "+isPalindrome(input));
    }
}