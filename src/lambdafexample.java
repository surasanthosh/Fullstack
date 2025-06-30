import java.util.Scanner;

interface iii{
    void person(String name,String address,int age);
}
public class lambdafexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the details: ");
        String n=sc.nextLine();
        String ad=sc.nextLine();
        int a=sc.nextInt();

        iii obj=(name,address,age)-> System.out.println("name: "+name+", address: "+address+", age: "+age);
        obj.person(n,ad,a);

    }
}
