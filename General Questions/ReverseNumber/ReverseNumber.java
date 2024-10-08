import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        
        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        
        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
        
        scanner.close();
    }
}
