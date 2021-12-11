import java.io.*;
import java.util.*;

public class Main {
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

    int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = m-1;
        
        int count = 0;
        int total = n*m;
        
        while(count < total){
            //4 loop
            
            for(int i = minr ; i<=maxr && count < total ; i++){
                System.out.println(a[i][minc]);
                count++;
            }
            minc++;
            
            for(int j = minc; j<=maxc && count < total; j++){
                System.out.println(a[maxr][j]);
                count++;
            }
            maxr--;
            
            for(int i = maxr; i>=minr && count < total; i--){
                System.out.println(a[i][maxc]);
                count++;
            }
            maxc--;
            
            for(int j = maxc; j>=minc && count < total; j--){
                System.out.println(a[minr][j]);
                count++;
            }
            minr++;
            
        }

    }

}