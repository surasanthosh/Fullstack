class outer2{
    private class inner2{
        void emp(String name,String id){
            System.out.println(name+" "+id);
        }
        void dept(String dname,String did){
            System.out.println(dname+" "+did);
        }
    }
    void display(){
        inner2 obj=new inner2();
        obj.emp("santhosh","ABC123");
        obj.dept("manju","ABC456");
    }
}
public class nestedinnerclass2 {
    public static void main(String[] args) {
        outer2 obj1=new outer2();
        obj1.display();
    }
}