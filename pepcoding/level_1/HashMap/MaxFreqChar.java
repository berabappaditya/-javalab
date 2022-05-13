import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        char maxfreqchar=s.charAt(0);
        for(Character key : hm.keySet()){
            if(hm.get(key)>hm.get(maxfreqchar)){
                maxfreqchar=key;
            }

        }
        System.out.println(maxfreqchar);


    }

}