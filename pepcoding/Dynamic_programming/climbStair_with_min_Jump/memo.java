import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(arr,0,n,dp));
    }
    public static int solve(int[] arr,int src,int dest,int[] dp){
        if(src==dest){
            return dp[src]=1;
        }
        if(arr[src]!=-1){
            return dp[src];
        }
        int count=0;
        for(int jump=1;jump<=arr[src]&&jump+src<=dest;jump++){
            count+=solve(arr,src+jump,dest,dp);

        }
        System.out.print(count+" ");
        return dp[src]=count;
    }
}