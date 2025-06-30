class outer{
    private class inner{
        void demo(){
            System.out.println("inner private class");
        }
    }
    void dispaly(){
        inner obj=new inner();
        obj.demo();
    }
}
public class nestedinnerclass {
    public static void main(String[] args) {
        outer obj1=new outer();
        obj1.dispaly();
    }
}