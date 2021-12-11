import java.io.*;
import java.util.*;

public class rotate90deg{
     public static void transpose(int[][] a){
         for(int i=0;i<a.length;i++){
             for(int j=i;j<a[0].length;j++){
                 int temp=a[i][j];
                 a[i][j]=a[j][i];
                 a[j][i]=temp;
             }
         }
     }
     public static void reverse(int[][] a){
         
         for(int i=0;i<a.length;i++){
             int minc=0;
         int maxc=a[0].length-1;
             while(minc<maxc){
                 int temp=a[i][minc];
                 a[i][minc]=a[i][maxc];
                 a[i][maxc]=temp;
                 minc++;
                 maxc--;
                
             }
            
         }
     }

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        transpose(arr);
        reverse(arr);
        display(arr);

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}