import java.util.*;
class def{
    public void person(String name,int age){
        System.out.println(name+" "+age);
    }
    public void dog(String dname,String dcolor){
        System.out.println(dname+" "+dcolor);
    }
}
public class methodcalluser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dname & dcolor");
        String dname=sc.nextLine();
        String dcolor=sc.nextLine();
        System.out.println("Enter the Person Name & Age");
        String name=sc.nextLine();
        int age=sc.nextInt();
        def obj=new def();
        obj.person(name,age);
        obj.dog(dname,dcolor);


    }
}
