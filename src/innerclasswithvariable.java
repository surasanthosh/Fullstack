class outer3{
    private int a=10;
    class inner3{
        public int getValue()
        {
            return a;
        }
    }
}
public class innerclasswithvariable {
    public static void main(String[] args) {
        outer3 obj=new outer3();
        outer3.inner3 obj1=obj.new inner3();
        System.out.println(obj1.getValue());
    }
}