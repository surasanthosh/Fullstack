class Employee{
    String EMP_name="santhosh";
    int EMP_id=21;
    String EMP_address="HYD";
}
class Department {
    String dep_id="511";
    String dep_name="IT";
}
public class calssobjectexample {
    public static void main(String[] args) {
        Employee obj=new Employee();
        System.out.println("Employee name: "+obj.EMP_name);
        System.out.println("Employee id: "+obj.EMP_id);
        System.out.println("Employee address: "+obj.EMP_address);

        Department obj1=new Department();
        System.out.println("Deparment id: "+obj1.dep_id);
        System.out.println("Department name: "+obj1.dep_name);
    }
}