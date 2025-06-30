class cars{
    String color;
    cars(String color){
        this.color=color;
    }
    void display(){
        System.out.println(color);
    }
}
class audii extends cars{
    String price;
    audii(String color,String price){
        super(color);
        this.price=price;
    }
    void display(){
        super.display();
        System.out.println(price);
    }
}
class bmww extends cars{
    String bprice;
    bmww(String color,String bprice){
        super(color);
        this.bprice=bprice;
    }
    void display(){
        super.display();
        System.out.println(bprice);
    }

}
public class heirarchicalinheritexample2 {
    public static void main(String[] args) {
        audii obj1=new audii("Black","10,00000");
        bmww obj2=new bmww("white","50,0000");
        obj1.display();
        obj2.display();

    }
}
