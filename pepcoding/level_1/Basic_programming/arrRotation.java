import java.io.*;
import java.util.*;

public class arrRotation{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static int[] rotate(int[] a, int k){
    // write your code here
    int l=a.length;
    int i=l-1;
    k=((k%l)+l)%l;
    while(k!=0){
        int temp=a[i];
        int lup=i-1;
        while(lup>=0){
            a[lup+1]=a[lup];
            lup--;
        }
        a[0]=temp;
        k--;
    }
  
 return a;
 
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    
    display(rotate(a, k));
 }

}