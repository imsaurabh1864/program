import java.util.Scanner;
public class PalindromeChecker1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        String cleanedString = originalString.toLowerCase();
        boolean isPalindrome = true;
        int length = cleanedString.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(  originalString + "is a palindrome.");
        } else {
            System.out.println( originalString + " is not a palindrome.");
        }
    }
}
