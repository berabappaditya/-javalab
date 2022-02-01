import java.io.*;
import java.util.*;

public class printSubSeq {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        String ans="";
        printSS(str,ans);
        
        }

    public static void printSS(String str,String ans) {
        if(str.length()==0){
           System.out.println(ans);
           return;
        }
        char fc=str.charAt(0);
        String ros=str.substring(1);
        printSS(ros,ans+fc);
        printSS(ros,ans);
        
    }

}