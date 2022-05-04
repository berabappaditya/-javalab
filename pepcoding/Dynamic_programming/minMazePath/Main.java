import java.io.*;
import java.util.*;

public class Main {
    
    

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
       System.out.println(minMaze(arr,n,m,0,0)); 
    }
    
    
    public static int minMaze(int[][] arr,int n,int m,int v,int h){
        if(v==n-1 && h==m-1){
            return arr[v][h];
        }
        
        int down=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(v<n-1){
            down=minMaze(arr,n,m,v+1,h);
        }
        
        if(h<m-1){
            right=minMaze(arr,n,m,v,h+1);
        }
        
        if(down<right){
            return arr[v][h]+down;
        }else{
            return arr[v][h]+right;
        }
    }

}