import java.io.*;
import java.util.*;

public class sumofTwoArr {
    public static void addArr(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int sz = (l1 > l2 ? l1 : l2);

        int cary = 0;
        int[] arr3 = new int[sz];
        sz--;
        l1--;
        l2--;

        while (sz >= 0) {
            int val = 0;
            if (l1 >= 0) {
                val += arr1[l1];
            }
            if (l2 >= 0) {
                val += arr2[l2];
            }
            val += cary;

            if (val >= 10) {
                cary = val / 10;
                val %= 10;
            } else {
                cary = 0;
            }
            arr3[sz] = val;
            sz--;
            l1--;
            l2--;

        }
        if (cary != 0) {
            System.out.println(cary);
        }
        for (int ele : arr3) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        addArr(arr1, arr2);

    }

}