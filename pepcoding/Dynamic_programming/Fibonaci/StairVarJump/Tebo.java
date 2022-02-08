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
        System.out.println(Tebo(arr,0,n,dp));
    }

    public static int Tebo(int[] arr,int SRC,int  dest,int[] dp){
        for(int src=dp.length-1;src>=SRC;src--){
        if(src==dest){
            dp[src]=1;
            continue;
        }

        int count =0;
        for(int jump=1;jump<=arr[src]&&jump+src<=dest;jump++){
            count +=dp[src+jump];
        }
        
        dp[src]=count;
        }
        return dp[SRC];
    }
  

}