class ok{
    public void animal(){
        System.out.println("parent");
    }
}
class notok extends ok{
    public void animal(){
        System.out.println("child");
    }
}
public class dynamicbindingmethodoverriding {
    public static void main(String[] args) {
        ok obj=new notok();
        obj.animal();
    }
}