class o7{
    static class i7{
        void demo(){
            System.out.println("STATIC CLASS");
        }
    }
}
public class staticnestedclass {
    public static void main(String[] args) {
        o7.i7 obj=new o7.i7();
        obj.demo();
    }
}