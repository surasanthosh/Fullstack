class x{
    void config(String name,String ram,String rom){
        System.out.println("parent mobile: "+name+" "+ram+" "+rom);

    }
}
class y extends x{
    void config(String name,String ram,String rom){
        System.out.println("student mobile: "+name+" "+ram+" "+rom);

    }
}
public class mathodoverridingexample {
    public static void main(String[] args) {
        y obj=new y();
        obj.config("redmi","4gb","64gb");
        obj.config("Realme","6gb","128gb");

    }
}