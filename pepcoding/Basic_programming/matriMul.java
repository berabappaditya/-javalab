import java.io.*;
import java.util.*;

public class Main {
    public static int[][] inputArr(int n, int m) {
        Scanner sc = new Scanner(System.in);
        int[][] e = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                e[i][j] = sc.nextInt();
            }
        }
        return e;
    }

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] a = inputArr(n1, m1);
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] b = inputArr(n2, m2);
        int[][] c = new int[n1][m2];
        if (m1 == n2) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    for (int k = 0; k < m1; k++) {
                        c[i][j] = a[i][k] * b[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }

    }

}