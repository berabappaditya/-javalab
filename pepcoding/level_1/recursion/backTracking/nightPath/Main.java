import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int max = n * n;
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess, r, c, 1, max);
    }

    public static int[][] dirArr = { { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 },
            { -2, -1 } };

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove, int max) {
        if (r >= chess.length || c >= chess.length || r < 0 || c < 0 || chess[r][c] != 0) {
            return;
        }
        if (upcomingMove == max) {
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = upcomingMove;
        for (int i = 0; i < dirArr.length; i++) {
            printKnightsTour(chess, r + dirArr[i][0], c + dirArr[i][1], upcomingMove + 1, max);
        }
        chess[r][c] = 0;

    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}