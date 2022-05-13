import java.io.*;
import java.util.*;

public class mazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(getMazePaths(1,1,n,m));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ph=new ArrayList<>();
        ArrayList<String> pv=new ArrayList<>();

      // sr - source
        if(sc<dc){
            ph=getMazePaths(sr,sc+1,dr,dc);
        }
          if(sr<dr){
            pv=getMazePaths(sr+1,sc,dr,dc);
        }
        
       

        ArrayList<String> mypath=new ArrayList<>();

        for(String ele:ph){
            mypath.add("h"+ele);
        }

        for(String ele:pv){
            mypath.add("v"+ele);
        }
        return mypath;



    }

}