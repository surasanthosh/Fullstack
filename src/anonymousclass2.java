abstract class anony{
    abstract void dog(String name,String color);
    abstract void cat(String name,String color);
}
public class anonymousclass2 {
    public static void main(String[] args) {
        anony obj=new anony(){
            public void dog(String name,String color){
                System.out.println("DOG NAME & COLOR: "+name+" "+color);
            }
            public void cat(String name,String color){
                System.out.println("CAT NAME & COLOR: "+name+" "+color);
            }
        };
        obj.dog("BUDDY","White");
        obj.cat("PIN","white");
    }
}