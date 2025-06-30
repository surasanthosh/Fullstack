abstract class hello{
    abstract void greet();
}
class hai extends hello{
    void greet(){
        System.out.println("welcome");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        hai obj=new hai();
        obj.greet();
    }
}
