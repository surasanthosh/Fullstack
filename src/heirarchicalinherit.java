class a{
    void show(){
        System.out.println("parent class");
    }
}
class b extends a{
    void show(){
        System.out.println("child class");
    }
    void show1(){
        System.out.println("extra child class 1");
    }
}
class c extends a{
    void show(){
        System.out.println("child class");
    }
    void show2(){
        System.out.println("extra child class 2");
    }
}
public class heirarchicalinherit {
    public static void main(String[] args) {
        b obj=new b();
        obj.show();
        obj.show1();
        c obj1=new c();
        obj1.show();
        obj1.show2();
    }
}
