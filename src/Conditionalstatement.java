import java.util.Scanner;
public class Conditionalstatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.print("Eligible");
        }
        else{
            System.out.print("NOt Eligible");
        }

    }
}
