import java.util.*;

public class rotate {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int len = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            len++;
        }
        k = (k % len + len) % len;
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= len; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mul *= 10;
            }
        }

        int rem = n % div;
        n /= div;
        System.out.println(rem * mul + n);

    }
}
