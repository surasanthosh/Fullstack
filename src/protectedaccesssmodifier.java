class protectedaccess{
    protected void display(){
        System.out.println("PROTECTED ACCESS MODIFIER");
    }
}
public class protectedaccesssmodifier {
    public static void main(String[] args) {
        protectedaccess obj=new protectedaccess();
        obj.display();
    }
}
