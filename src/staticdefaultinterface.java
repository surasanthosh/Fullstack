interface k{
    static void show(){   //static method thier is no need class for methodcall & direct call from interface
        System.out.println("static method interface");

    }
    default void display(){
        System.out.println("default method interface");
    }
}
class j{
    public void display(){
        System.out.println("default method interface");
    }
}
public class staticdefaultinterface {
    public static void main(String[] args) {
        k.show();
        j obj=new j();
        obj.display();

    }
}