public class ArrayMaxExample {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 2, 10, 4};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum element: " + max); // Output: 10
    }
}
