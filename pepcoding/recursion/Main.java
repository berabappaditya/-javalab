import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reAns(n);
    }

    public static void reAns(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        reAns(n - 1);
    }
}
