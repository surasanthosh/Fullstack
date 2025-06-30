import java.util.Scanner;
public class Assignmentoperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a=sc.nextInt();
        System.out.println("Enter the value: ");
        int b=sc.nextInt();
        System.out.println("+= "+(a+=2));
        System.out.println("-= "+(a-=2));
        System.out.println("*= "+(a*=2));

    }
}
