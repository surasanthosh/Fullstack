interface dogs{
    void show(String name,String breed,String color);
}
interface cats{
    void display(String name,String color);
}
class cad implements dogs,cats{
    public void show(String name,String breed,String color){
        System.out.println("Dog: "+name+" "+breed+" "+color);
    }
    public void display(String name,String color){
        System.out.println("Cat :"+name+" "+color);
    }
}
public class multipleinheritinterface1 {
    public static void main(String[] args) {
        cad obj=new cad();
        obj.show("buddy","non breed","white");
        obj.display("puppy","white&brown");
    }
}