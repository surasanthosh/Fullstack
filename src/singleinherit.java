class parent{
    public void A(){
        System.out.println("parent features");
    }
}
class child extends parent{
    public void A(){
        System.out.println("child features");
    }
    public void B(){
        System.out.println("extra features");
    }
}
public class singleinherit {
    public static void main(String[] args) {
        child obj = new child();
        obj.A();
        obj.B();
    }
}

