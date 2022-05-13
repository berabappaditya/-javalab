import java.io.*;
import java.util.*;

public class mejPathJumps {

    public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            int dr=sc.nextInt();
            int dc=sc.nextInt();
            System.out.println(getMazePaths(1,1,dr,dc));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

            if(sr==dr &&sc==dc){
                ArrayList<String> base=new ArrayList<>();
                base.add("");
                return base;
            }
        ArrayList<String> myPath=new ArrayList<>();
        //horizontal moves
        for(int hm=1;hm<=dc-sc;hm++){
            ArrayList<String> hpath=getMazePaths(sr,sc+hm,dr,dc);
            for(String ele:hpath){
                myPath.add("h"+hm+ele);
            }
        }

        //vertical moves
         for(int vm=1;vm<=dr-sr;vm++){
            ArrayList<String> vpath=getMazePaths(sr+vm,sc,dr,dc);
            for(String ele:vpath){
                myPath.add("v"+vm+ele);
            }
        }
        //diagonal moves
         for(int dm=1;dm<=dc-sc && dm<=dr-sr;dm++){
            ArrayList<String> dpath=getMazePaths(sr+dm,sc+dm,dr,dc);
            for(String ele:dpath){
                myPath.add("d"+dm+ele);
            }
        }
        return myPath;


    }

}