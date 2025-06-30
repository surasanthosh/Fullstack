class privateaccess{
    private String name="PRIVATE ACCESS MODIFIER";
    private void display(){
        System.out.println(name);
    }
    public void access(){
        display();
    }
}
public class privateaccessmodifier {
    public static void main(String[] args) {
        privateaccess obj=new privateaccess();
        obj.access();
    }
}
