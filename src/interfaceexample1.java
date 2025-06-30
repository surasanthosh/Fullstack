interface animals{
    public void dog(String name,String breed,String color);
    public void cat(String name,String color);
}
class animal1 implements animals{
    public void dog(String name,String breed,String color){
        System.out.println(name+" "+breed+" "+color);
    }
    public void cat(String name,String color){
        System.out.println(name+" "+color);
    }

}
public class interfaceexample1 {
    public static void main(String[] args) {
        animal1 obj=new animal1();
        obj.dog("buddy","non breed","white");
        obj.cat("ox","white&brown");
    }
}
