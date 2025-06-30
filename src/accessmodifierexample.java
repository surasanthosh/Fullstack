import java.util.*;
class student{
    private String s_name;
    public int s_id;
    void displayDetails(String s_name,int s_id){
        System.out.println("Name "+s_name);
        System.out.println("ID "+s_id);
    }

    public void display() {
    }
}
public class accessmodifierexample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name");
        String s_name=sc.nextLine();
        System.out.println("Enter the student id");
        int s_id=sc.nextInt();
        student obj=new student();
        obj.displayDetails(s_name,s_id);
    }
}
