
import java.io.*;
import java.util.*;

public class stateofWakanda{
    public static Scanner sc=new Scanner(System.in);
    public static void inputArr(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }

public static void main(String[] args) throws Exception {
    // write your code here
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] a=new int[n][m];
    inputArr(a);


    for(int i=0;i<m;i++){
        if(i%2==0){
            for(int j=0;j<n;j++){
                System.out.println(a[j][i]);
            }
        }else{
            for(int j=n-1;j>=0;j--){
                System.out.println(a[j][i]);
            }
        }
    }

 }

}