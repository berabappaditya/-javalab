import java.util.*;

public class gcdLcm {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;

        for (int i = 2; i * i <= a; i++) {
            while (a % i == 0 && b % i == 0) {
                gcd *= i;
                a /= i;
                b /= i;
            }
        }
        System.out.println(gcd);
        System.out.println(gcd * a * b);

    }
}
