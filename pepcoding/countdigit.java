import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("The number of digits is " + count);
    }
}
