public class printDicrRecursion {
    public static void main(String[] args) {
        int n = 5;
        printDcrRecursion(n);
    }

    public static void printDcrRecursion(int n) {
        System.out.println("br " + n);
        if (n < 0) {
            return;
        }
        System.out.println("d" + n);
        printDcrRecursion(n - 1);
        System.out.println("i" + n);
    }
}