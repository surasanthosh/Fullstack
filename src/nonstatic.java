class outs{
    private String name="SANTHOSH";
    private int age=21;
    class ins{
        void dispaly(){
            System.out.println(name+" "+age);
        }
    }
}
public class nonstatic {
    public static void main(String[] args) {
        outs obj=new outs();
        outs.ins obj1=obj.new ins();
        obj1.dispaly();
    }
}