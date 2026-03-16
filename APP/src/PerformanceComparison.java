import java.util.*;

public class PerformanceComparison {

    public static boolean method1(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static boolean method2(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean r1 = method1(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = method2(input);
        long end2 = System.nanoTime();

        System.out.println("Method 1 Result: " + r1);
        System.out.println("Method 1 Time: " + (end1 - start1) + " ns");

        System.out.println("Method 2 Result: " + r2);
        System.out.println("Method 2 Time: " + (end2 - start2) + " ns");
    }
}