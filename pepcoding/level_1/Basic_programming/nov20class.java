import java.util.Scanner;

import java.util.Scanner;
public class nov20class {
    public static Scanner input = new Scanner(System.in);
    public static void printDigits(int n){
        while(n>0){
            if(n>0){
                System.out.println(n%10);
                n/=10;
            }
        }
    }
    public static void main(String[] args) {
        int n=input.nextInt();
        printDigits(n);
    }
}
    
}
