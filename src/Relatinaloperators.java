import java.util.Scanner;
public class Relatinaloperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a=sc.nextInt();
        System.out.println("Enter a value: ");
        int b=sc.nextInt();
        System.out.println("Greater than "+(a>b));
        System.out.println("Less than "+ (a<b));
        System.out.println("Equal "+(a==b));
        System.out.println("Not equal "+(a!=b));
        System.out.println("Greater than equal "+(a>=b));
        System.out.println("Less than equal "+(a<=b));

    }
}
