import java.io.*;
import java.util.*;

public class difofTwoArr {
    public static int[] diffofTwoArr(int[] arr1, int arr2[]) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int sz = (l1 > l2 ? l1 : l2);
        System.out.println(l1 + "-" + l2 + "-" + sz);
        int borow = 0;
        int[] arr3 = new int[sz];
        sz--;
        l1--;
        l2--;
        while (l1 >= 0) {
            int dif = 0;
            dif += borow;
            if (l1 >= 0) {
                if (arr2[l2] > arr1[l1]) {
                    dif = 10 + arr2[l2] - arr1[l1];
                    borow = -1;
                } else {
                    dif = arr2[l2] - arr1[l1];
                    borow = 0;
                }
            } else {
                dif += arr2[l2];
            }
            arr3[sz] = dif;
            sz--;
            l1--;
            l2--;

        }
        return arr3;

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
        int[] ans = diffofTwoArr(arr1, arr2);
        int fnz = -1;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != 0) {
                fnz = i;
            }

        }
        if (fnz == -1) {
            System.out.println("0");
            return;
        }
        // System.out.println(ans.length);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

}
