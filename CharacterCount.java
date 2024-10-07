import java.util.Map;
import java.util.HashMap;

public class CharacterCount
{

public static Map<Integer,Character> countCharacters(String str)
  {
    Map<Character,Integer> charCountMap=new HashMap<>();
    
    char[] charArray=str.toCharArray();

   for(char c: charArray)
{

if(charCountMap.containsKey(c))
{
    charCountMap.put(c,charCountMap.get(c)+1);
}
else
{
    charCountMap.put(c,1);
}

}
return charCountMap;



  }

public static void main(String [] args)
{
   String str="hello world";
  
   Map<Character,Integer> charCountMap=countCharacters(str);

   for(Map.Entry<Character,Integer>entry:charCountMap.entrySet())
{
  System.out.println( entry.getKey()+":"+ entry.getValue());
}
    
}
}