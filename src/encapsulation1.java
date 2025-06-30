class employe{
    private String emp_name;
    private String emp_id;
    private String emp_salary;
    public void setEmp_name(String emp_name1){
        emp_name=emp_name1;
    }
    public void setEmp_id(String emp_id1){
        emp_id=emp_id1;
    }
    public void setEmp_salary(String emp_salary1){
        emp_salary=emp_salary1;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public String getEmp_id(){
        return emp_id;
    }
    public String getEmp_salary(){
        return emp_salary;
    }
}
public class encapsulation1 {
    public static void main(String[] args) {
        employe obj=new employe();
        obj.setEmp_name("santhosh");
        obj.setEmp_id("22FH5a");
        obj.setEmp_salary("700000");
        System.out.println(obj.getEmp_name()+" "+obj.getEmp_id()+" "+obj.getEmp_salary());
    }
}
