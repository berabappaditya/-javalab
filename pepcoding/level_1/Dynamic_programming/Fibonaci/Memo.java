import java.io.*;
import java.util.*;

public class Memo{
    public static int fiboM(int n,int[] dp){
        if(n<=1){
            return dp[n]=n;
        }
        if(dp[n]!=-1){
           return dp[n];
        }
        return dp[n]=fiboM(n-1,dp)+fiboM(n-2,dp);
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
    System.out.println(fiboM(n,dp));
    
 }

}