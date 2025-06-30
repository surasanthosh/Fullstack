interface as{
    default void demo(){
        System.out.println("first feature of java 8 using default keyword");
    }
}
class ass implements as{

}
public class fstfeatureofjava8createmethodsinterfcae{
    public static void main(String[] args) {
        as obj=new ass();
        obj.demo();
    }
}