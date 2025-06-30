import java.util.*;
class san{
    public void add(int a,int b){
        System.out.println("Addition "+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("Subtraction "+(a-b));
    }
    public void mul(int a,int b){
        System.out.println("Multiplication "+(a*b));
    }
    public void div(int a,int b){
        if(b!=0) {
            System.out.println("Division " + (a / b));
        }
        else{
            System.out.println("Denominator should not be zero");
        }
    }
    public void mod(int a,int b){
        System.out.println("MOD "+(a%b));
    }
    public void inc(int a,int b){
        System.out.println("Increment "+(a++));
    }
    public void dec(int a,int b){
        System.out.println("Decrement "+(b--));
    }
}
public class userinputmethodcall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value a ");
        int a=sc.nextInt();
        System.out.println("Enter the value b ");
        int b=sc.nextInt();
        san obj=new san();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
        obj.mod(a,b);
        obj.inc(a,b);
        obj.dec(a,b);
    }
}
