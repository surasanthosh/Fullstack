interface uu{
    default void demo(){
        System.out.println("demo1");
    }
}
interface ku{
    default void demo(){
        System.out.println("demo2");
    }
}
class cc{
    public void demo(){
        System.out.println("demo3");         //first preference should be class after that then going for interface
    }
}
public class demo5 extends cc implements ku{
    public static void main(String[] args) {
        demo5 obj=new demo5();
        obj.demo();
    }
}
