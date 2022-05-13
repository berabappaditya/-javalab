import java.io.*;
import java.util.*;

public class toggleCase {

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int len=str.length();
    StringBuilder newst=new StringBuilder();
    for(int i=0;i<len;i++){
        char c=str.charAt(i);
        if(c >= 'A'&& c<='Z'){
            char lc=(char)(c-'A'+'a');
            newst.append(lc);
        }else{
          char lc= (char)(c- 'a'+'A');  
          newst.append(lc);
        }
        
    }
System.out.println(newst);
   }
    
 }