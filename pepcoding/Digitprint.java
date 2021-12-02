import java.util.*;

public class Digitprint {
    static int reverse(int n) {

        int rev = 0; // reversed number
        int rem; // remainder

        while (n > 0) {

            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = 12345;
        int rev = reverse(n);
        System.out.println(rev);
        while (rev > 0) {
            System.out.println(rev % 10);
            rev /= 10;
        }
    }
}
