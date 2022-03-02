import java.io.*;
import java.util.*;

public class Main {

   public static void optimum(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here  
      PriorityQueue<Integer> minPQ=new PriorityQueue<>();
      for(int i=0;i<k;i++){
          minPQ.add(arr[i]);
      } 
      for(int i=k;i<n;i++){
          if(minPQ.peek() < arr[i]){
              minPQ.remove();
              minPQ.add(arr[i]);
          }
      }
      for(int ele:minPQ){
          System.out.println(ele);
      }
    }

}