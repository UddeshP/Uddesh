public class CharacterCount {
    public static int countOccurrences(String str, char c) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello world";
        char character = 'l';
        System.out.println("The character '" + character + "' occurs " + countOccurrences(input, character) + " times.");
    }
}
