class out{
    private String name;
    private class in {
        void display(String name) {
            System.out.println(name);
        }
    }
    void display(){
        in obj=new in();
        obj.display("SANTHOSH");
    }
}
public class innerclass3 {
    public static void main(String[] args) {
        out obj1=new out();
        obj1.display();
    }
}