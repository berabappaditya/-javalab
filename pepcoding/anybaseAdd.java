import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }
public static int mulDigits(int n,int m){
    return n*m;
}
public static int anybaseAdd(int b, int n1, int n2){
     int carry=0;
       int pow=1;
       int val=0;
       
       while(carry!=0||n2!=0){
           int add=carry+n1%10+n2%10;
           if(add>=b){
               carry=add/b;
               add=add%b;
           }else{
               carry=0;
           }
           val=val+add*pow;
           pow *=10;
           n1 /=10;
           n2 /=10;

       }
       return val;
}

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int val=0;
     int pow=1;
    while(n2!=0){
        int d2=n2%10;
        n2 /=10;
        int mul=mulDigits(n1,d2);
        mul *=pow;
        pow *=10;

        val=anybaseAdd(b,val,mul);
    }
    return val;
 }

}