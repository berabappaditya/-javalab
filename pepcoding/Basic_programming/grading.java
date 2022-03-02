import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print(a);
        if (a > 90) {
            System.out.print("excellent");
        } else if (a > 80 && a <= 90) {
            System.out.print("good");
        } else if (a > 70 && a <= 80) {
            System.out.print("fair");
        } else if (a > 60 && a <= 70) {
            System.out.print("meets expectations");

        } else if (a <= 60) {
            System.out.print("below par");
        }
    }

}
