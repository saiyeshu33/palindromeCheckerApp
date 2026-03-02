public class palindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String : " + input);
        if (isPalindrome) {
            System.out.println("Result : The string is a palindrome.");
        } else {
            System.out.println("Result : The string is not a palindrome.");
        }
    }
}
