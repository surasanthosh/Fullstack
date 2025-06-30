abstract class mangoo {
    abstract void student(String sname, String sbranch);
}
abstract class slice{
    abstract void employee(String ename,String role);
}
public class anonymousclass3 {
    public static void main(String[] args) {
        mangoo obj=new mangoo(){
            public void student(String sname, String sbranch){
                System.out.println(sname +" "+sbranch);
            }
        };
        slice obj1=new slice(){
            public void employee(String ename, String role){
                System.out.println(ename +" "+role);
            }
        };
        obj.student("SANTHOSH","CSE");
        obj1.employee("MANJU","BACKEND");
    }
}