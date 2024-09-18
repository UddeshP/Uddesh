public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest element is: " + secondLargest);
    }
}
