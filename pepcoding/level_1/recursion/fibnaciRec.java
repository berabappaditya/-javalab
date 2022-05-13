import java.util.*;

public class fibnaciRec {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibnaci(n, 0, 1);
    }

    public static void fibnaci(int n, int n1, int n2) {
        if (n == 0) {
            return;
        }
        System.out.println(n1);
        int n3 = n1 + n2;
        fibnaci(n - 1, n2, n3);

    }
}
