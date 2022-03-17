import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int [][] arr ={{1,4},
            {5,7},
            {3,12},
            {18,2},
            {6,10}
        };

        //special expression to sort array function
        //lambda expressionv java
        //arr.sort((a,b)->a[0]-b[0]);
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });
        for(int[] d:arr){
            System.out.println(d[0]+"  "+d[1]);
        }
    }
}