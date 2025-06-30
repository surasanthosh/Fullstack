class A {
    void show() {
        System.out.println("A");
    }
}
class B extends A{
        void show(){
            System.out.println("B");
        }
        void display(){
            System.out.println("B display");
        }
}
class C extends B{
    void show(){
        System.out.println("c");
    }
    void display(){
        System.out.println("c display");
    }
    void gree(){
        System.out.println("C gree");
    }

}
public class multilevelinherit {
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
        obj.display();
        obj.gree();
    }
}
