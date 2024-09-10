public class MoveHashToFront {

    public static String moveHashesToFront(String input) {
        StringBuilder hashes = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        // Iterate through the input string
        for (char ch : input.toCharArray()) {
            if (ch == '#') {
                // Collect all the # characters
                hashes.append(ch);
            } else {
                // Collect all other characters
                result.append(ch);
            }
        }
        
        // Prepend all # characters to the result string
        return hashes.append(result).toString();
    }

    public static void main(String[] args) {
        String input = "Move#Hash#to#Front";
        String output = moveHashesToFront(input);
        System.out.println("Output: " + output);  // Output: ###MoveHashtoFront
    }
}
