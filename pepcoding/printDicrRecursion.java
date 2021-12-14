Public class printDicrRecursion {
    public static void main(String[] args) {
        int n = 5;
        printDicrRecursion(n);
    }

    public static void printDicrRecursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDicrRecursion(n - 1);
    }
}