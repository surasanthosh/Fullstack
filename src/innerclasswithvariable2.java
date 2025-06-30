class outer4{
    private String name="SANTHOSH";
    class inner4{
        public void getValue(){
            System.out.println(name);
        }
    }
}
public class innerclasswithvariable2 {
    public static void main(String[] args) {
        outer4 obj=new outer4();
        outer4.inner4 obj1=obj.new inner4();
        obj1.getValue();
    }
}