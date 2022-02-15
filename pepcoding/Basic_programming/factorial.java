import java.io.*;
import java.util.*;
public class factorial{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       factorial(n);
    }
    public static int factorial(int n){
       if(n==0){
              
              return n;
       }
         n= factorial(n-1)*n;

    }
}