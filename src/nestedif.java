import java.util.Scanner;
public class nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Enter c value: ");
        int c = sc.nextInt();
        if (a >= b) {
            if (a >= c) {
                System.out.println(a + " is large");
            } else {
                System.out.println(c + " is large");
            }
        }
        else {
            if (b >= c) {
                System.out.println(b + " is large");
            } else {
                System.out.println(c + " is large");
            }
        }
    }
}
