import java.util.*;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        float a=sc.nextFloat();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.print("Total: " + (a+b));

    }
}
