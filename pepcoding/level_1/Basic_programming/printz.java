import java.util.*;

public class printz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nst = 1;
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= n; i++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(n1 + "\t");
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            nst++;
            System.out.println();
        }
    }
}