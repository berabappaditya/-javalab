import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner  sc=new Scanner(System.in);
        String str=sc.next();
        printEncodings(str,"");
        

    }

    public static void printEncodings(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.length()==1){
            if(str.charAt(0)=='0'){
               return; 
            }else{
            
            
            char char1=str.charAt(0);
            int fn=char1-'0';
            char charc=(char)('a'+fn-1);
             System.out.println(ans+charc);
            return;
                
            }
            
        }else{
            if(str.charAt(0)=='0'){
            return;
                
            }else
            {
            char char1=str.charAt(0);
            String ros1=str.substring(1);
            int char1v=char1-'0';
            char code1=(char)('a'+char1v-1);
            
            printEncodings(ros1,ans+code1);
            
            String char12=str.substring(0,2);
            String ros2=str.substring(2);
            int mun2=Integer.parseInt(char12);
            
            if(mun2<26){
                char code=(char)('a'+mun2-1);
              printEncodings(ros2,ans+code);  
            }
                
            }
              
            
            
            
        }
        
    }

}