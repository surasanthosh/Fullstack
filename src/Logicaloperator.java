import java.util.Scanner;
public class Logicaloperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a=sc.nextInt();
        System.out.println("Enter a value: ");
        int b=sc.nextInt();
        System.out.println(a>b && a==5); // AND T && F
        System.out.println(a!=2 || a<b); // OR  T || F
        System.out.println(!(a!=2 || a<b)); // NOT

    }
}
