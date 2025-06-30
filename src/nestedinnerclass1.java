class outer1{
    private class inner1{
        void display(String name,int age){
            System.out.println(name+" "+age);
        }
    }
    void show(){
        inner1 obj=new inner1();
        obj.display("santhosh",21);
    }
}
public class nestedinnerclass1 {
    public static void main(String[] args) {
        outer1 obj1=new outer1();
        obj1.show();
    }
}