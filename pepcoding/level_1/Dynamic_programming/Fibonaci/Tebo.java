import java.io.*;
import java.util.*;

public class Tabo{
    public static int fiboM(int n,int[] dp){
        
        for(int i=0;i<dp.length;i++){
            if(i<=1){
                dp[i]=i;
            continue;
            }
            
             dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] dp=new int[n+1];
    // Arrays.fill(dp,-1);
    System.out.println(fiboM(n,dp));
    
 }

}