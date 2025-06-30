import java.util.Scanner;
public class switchanotherexample {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number from 1 to 7");
    int marks=sc.nextInt();
    int Grade=marks/10;
    switch(Grade){
        case 10:
            System.out.println("A-Grade");
            break;
        case 9:
            System.out.println("B-Grade");
            break;
        case 8:
            System.out.println("c-Grade");
            break;
        case 7:
            System.out.println("D-Grade");
            break;
        case 6:
            System.out.println("E-Grade");
            break;
        case 5:
            System.out.println("F-Grade");
            break;
        case 4:
            System.out.println("G-Grade");
            break;
        case 3:
            System.out.println("H-Grade");
            break;
        case 2:
            System.out.println("I-Grade");
            break;
        case 1:
            System.out.println("J-Grade");
            break;
        default:
            System.out.println("Enter the valid marks");
            break;
        }
    }

}
