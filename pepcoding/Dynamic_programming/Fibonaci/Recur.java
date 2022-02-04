// import java.util.*;
// import java.io.*;

// public class Recur {
//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         // fibonacci of nth number
//         int[] dp = new int[n + 1];
//         Arrays.fill(dp, -1);
//         System.out.println(fibonacci(n, dp));
//     }

//     public static int fibonacci(int n, int[] dp) {

//         if (n <= 1) {
//             return dp[n] = n;
//         }
//         if (dp[n] != -1) {
//             return dp[n];
//         }
//         int fib = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
//         return dp[n] = fib;
//     }
// }

//tebo//
import java.util.*;
import java.io.*;

public class Recur {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // fibonacci of nth number
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibonacci(n, dp));
    }

    public static int fibonacci(int N, int[] dp) {

        for (int n = 0; n < dp.length; n++) {
            if (n <= 1) {
                dp[n] = n;
                continue;
            }
            dp[n] = dp[n - 1] + dp[n - 2];

        }
        return dp[N];

    }
}
