interface z{
    public void display();
}
class p implements z{
    public void display(){
        System.out.println("Any thing");
    }
}
public class interfaceexample {
    public static void main(String[] args) {
        p obj=new p();
        obj.display();
    }
}
