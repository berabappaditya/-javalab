import java.io.*;
import java.util.*;

public class subsetArr{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
       a[i]=sc.nextInt(); 
    }
    int r=(int)Math.pow(2,n);
    for(int i=0;i<r;i++){
        int rt=i;
        String str="";
        for(int j=n-1;j>=0;j-- ){

            
            int rem=rt%2;
            rt /=2;
            if(rem==1){
                str=a[j]+"\t"+str;
            }else{
                str="-\t"+str;
            }
        }
        System.out.println(str);
    }
 }

}