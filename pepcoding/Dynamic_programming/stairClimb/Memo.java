import java.io.*;
import java.util.*;

public class Memo {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(ClimbStair(n, dp));
    }

    public static int ClimbStair(int n, int[] dp) {
        if (n == 0) {
            return dp[n] = 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int count = 0;
        if (n - 1 >= 0) {
            count += ClimbStair(n - 1, dp);
        }
        if (n - 2 >= 0) {
            count += ClimbStair(n - 2, dp);
        }
        if (n - 3 >= 0) {
            count += ClimbStair(n - 3, dp);
        }

        return dp[n] = count;
    }

}