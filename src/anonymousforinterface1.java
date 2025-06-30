interface sin{
    void add(int a,int b);
    void sub(int a,int b);
}
interface can{
    void mul(int a,int b);
}
public class anonymousforinterface1 {
    public static void main(String[] args) {
        sin obj=new sin(){
            public void add(int a,int b){
                System.out.println("ADDITION IS: "+(a+b));
            }
            public void sub(int a,int b){
                System.out.println("SUBTRACTION IS: "+(a-b));
            }
        };
        can obj1=new can(){
            public void mul(int a,int b){
                System.out.println("MULTIPLICATION: "+(a*b));
            }
        };
        obj.add(10,20);
        obj.sub(20,10);
        obj1.mul(2,3);
    }
}