import java.io.*;
import java.util.*;

public class Main{

public static void lognestConSeq(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }

    HashMap<Integer,String> hm=new HashMap<>();
    for(int i=0;i<n;i++){
        if(!hm.containsKey(arr[i])){
            hm.put(arr[i],"1");
        }
    }
    
    int bigSeq=0;
    int stNum=0;

    for(int ele:hm.keySet()){
        int start=ele;
        boolean loop=true;
        int count=0;
        while(loop){
            if(hm.containsKey(start-1)){
                count+=1;
                start=start-1;
            }else{
                loop=false;
            }
        }
        if(count>bigSeq){
            bigSeq=count;
            stNum=start;
        }
    }

    for(int i=0;i<=bigSeq;i++){
        System.out.println(stNum+i);
    }

 }

}