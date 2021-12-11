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
    public static void arrRotate(int r,int[] a){
      int len=a.length;
      r=(r%len+len)%len;

      while(r!=0){
          int temp=a[len-1];
          for(int i=len-1;i>0;i--){
              a[i]=a[i-1];
          }
          a[0]=temp;
          r--;
      }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];

        inputArr(a);

        //getting the shell form 2D array to 1d Array
        int s=sc.nextInt();
        int r=sc.nextInt();

        
        int count=0;
        int minr=s-1;
        int maxr=n-s;
        int minc=s-1;
        int maxc=m-s;
        //1D array length
        int len=2*(maxr-minr + maxc-minc);

        int[] dArr=new int[len];
       
       for(int i=minr;i<=maxr;i++){
           
           dArr[count]=a[i][minc];
           count++;
       }
       minc++;
       for(int j=minc;j<=maxc;j++){
          
           dArr[count]=a[maxr][j];
           count++;
       }
       maxr--;
        for(int i=maxr;i>=minr;i--){
            
           dArr[count]=a[i][maxc];
           count++;
       }
       maxc--;
       for(int j=maxc;j>=minc;j--){
          
           dArr[count]=a[minr][j];
           count++;
       }

      arrRotate(r,dArr);


     


      //rotated 1d arr to 2d arr
      int c=0;
     
     minr=s-1;
        maxr=n-s;
         minc=s-1;
         maxc=m-s;
      for(int i=minr;i<=maxr;i++){
           
           a[i][minc]=dArr[c];
           c++;
       }
       minc++;
       for(int j=minc;j<=maxc;j++){
          
           a[maxr][j]=dArr[c];
           c++;
       }
       maxr--;
        for(int i=maxr;i>=minr;i--){
            
           a[i][maxc]=dArr[c];
           c++;
       }
       maxc--;
       for(int j=maxc;j>=minc;j--){
          
           a[minr][j]=dArr[c];
           c++;
       }
     
       display(a);
    }

    

}