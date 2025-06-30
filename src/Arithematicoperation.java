import java.util.Scanner;
public class Arithematicoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a=sc.nextInt();
        System.out.println("Enter a value: ");
        int b=sc.nextInt();
        System.out.println("Addition "+ (a+b));
        System.out.println("Sub "+ (a-b));
        System.out.println("Mul "+(a*b));
        System.out.println("Div "+(a/b));
        System.out.println("Mod "+(a%b));
    }
}
