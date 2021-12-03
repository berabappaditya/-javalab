

import java.io.*;
import java.util.*;

public class Main{


public static void subArray(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int nl=n;
    for(int i=0;i<n;i++){
        int nst=i;
        for(int j=0;j<nl;j++){
            for(int k=i;k<=nst;k++){
                System.out.print(a[k]+"\t");
            }
            System.out.println();
            nst++;
        }

        nl--;

    }
 }

}