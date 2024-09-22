import java.util.Arrays;
public class AnagramChecker
{
public static Boolean anagramCheck(String str1, String str2)
{
   if(str1.length()!=str2.length())
   {
       return false;
   }

  char [] charArray1=str1.toLowerCase().toCharArray();
  char [] charArray2=str2.toLowerCase().toCharArray();

   Arrays.sort(charArray1);
   Arrays.sort(charArray2);

   return Arrays.equals(charArray1,charArray2);
   
}

   public static void main(String [] args)
{
     String str1="Listen";
     String str2="Silent";
     
    if(anagramCheck(str1,str2))
   {
        System.out.println(str1+"and  "+str2+"  "+ "are anagrams");
   }
  else
   {
     System.out.println(str1+"and  "+str2+"  "+ "are not anagrams");
   }

}
}