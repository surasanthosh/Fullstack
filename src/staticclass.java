class outer8{
    static class inner8{
        void display(int a,int b){
            System.out.println("Addition is: "+(a+b));
            System.out.println("Subtraction  is: "+(a-b));
            System.out.println("Multiplication is: "+(a*b));
            System.out.println("Division is: "+(a/b));
            System.out.println("Mod is: "+(a%b));
        }
    }
}
public class staticclass {
    public static void main(String[] args) {
        outer8.inner8 obj=new outer8.inner8();
        obj.display(3,2);
    }
}