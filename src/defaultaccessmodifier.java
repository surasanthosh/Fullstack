class defaultaccess{
    void display(){
        System.out.println("DEFAULT ACCESS MODIFIER");
    }
}
public class defaultaccessmodifier {
    public static void main(String[] args) {
        defaultaccess obj=new defaultaccess();
        obj.display();
    }
}
