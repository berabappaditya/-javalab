import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }

        }
        return isPrime;
    }

    public static void printAllPrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printAllPrime(a, b);

    }
}
