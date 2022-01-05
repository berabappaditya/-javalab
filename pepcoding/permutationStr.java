import java.io.*;
import java.util.*;

public class permutationStr{
     
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

	public static void solution(String str){
		// write your code here
        int len=str.length();
        int fct=fact(len);
        for(int i=0;i<fct;i++){
            StringBuilder sb=new StringBuilder(str);
            
            int temp=i;
            for(int l=len;l>=1;l--){
                int r=temp%l;
                temp /=l;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

            }
            System.out.println();
        }		
	}


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}