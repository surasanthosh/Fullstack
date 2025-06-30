class mo{
    public void mobile(){
        System.out.println("Nokia");
    }
}
class om extends mo{
    public void mobile(){
        System.out.println("Realme");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        om obj=new om();
        obj.mobile();
    }
}
