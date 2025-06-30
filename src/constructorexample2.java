class jkl{
    String Emp_name;
    String Emp_role;
    double Emp_salary;
    jkl(String em,String er,double es){
        Emp_name=em;
        Emp_role=er;
        Emp_salary=es;
    }
    public void details(){
        System.out.println(Emp_name+" "+Emp_role+" "+Emp_salary);
    }

}
public class constructorexample2 {
    public static void main(String[] args) {
        jkl obj=new jkl("Santhosh","Backend",1000000);
        obj.details();
    }
}
