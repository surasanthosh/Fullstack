import java.util.Scanner;

interface oo {
    void addition(int a, int b);
}
interface pp {
    void subtraction(int a, int b);
}
interface ww {
    void multiplication(int a, int b);
}
public class lambdafunctionexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p & q: ");
        int p = sc.nextInt();
        int q = sc.nextInt();

        oo obj1 = (a, b) -> System.out.println("Addition: " + (a + b));
        pp obj2 = (a, b) -> System.out.println("Subtraction: " + (a - b));
        ww obj3 = (a, b) -> System.out.println("Multiplication: " + (a * b));

        obj1.addition(p, q);
        obj2.subtraction(p, q);
        obj3.multiplication(p, q);
    }
}
