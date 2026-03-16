import java.util.ArrayDeque;
import java.util.Deque;

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}