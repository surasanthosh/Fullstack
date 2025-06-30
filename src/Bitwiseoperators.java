import java.util.*;
public class Bitwiseoperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a=sc.nextInt();
        System.out.println("Enter the value: ");
        int b=sc.nextInt();
        System.out.println("Bitwise AND "+(a&b));
        System.out.println("Bitwise OR "+(a|b));
        System.out.println("Bitwise XOR "+(a^b));
        System.out.println("compliment "+(~a));
        System.out.println("Left shift "+(a<<3));
        System.out.println("Right shift "+(a>>1));
    }
}
