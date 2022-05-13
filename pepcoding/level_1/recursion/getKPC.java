import java.io.*;
import java.util.*;

public class getKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(getKPC(s));

    }
   static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
         ArrayList<String> base=new ArrayList<>();
         base.add("");
         return base;
        }
        char fc=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> recAns=getKPC(ros);
        ArrayList<String> myAns=new ArrayList<>();

            int idx=Character.getNumericValue(fc);
            String cd=codes[idx];
         
        int len=cd.length();
        for(int i=0;i<len;i++){
            for(String ele:recAns){
                myAns.add(cd.charAt(i)+ele);
            }
        }
        return myAns;
         
    }

}