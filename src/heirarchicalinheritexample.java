class fruit{
    String season;
    fruit(String season){
        this.season=season;
    }
    void details(){
        System.out.println(season);
    }
}
class apple extends fruit{
    String color;
    apple(String season,String color){
        super(season);
        this.color=color;
    }
    void details(){
        super.details();
        System.out.println(color);
    }

}
class mango extends fruit{
    double price;
    mango(String season,double price){
        super(season);
        this.price=price;
    }
    void details(){
        super.details();
        System.out.println(price);
    }
}
public class heirarchicalinheritexample {
    public static void main(String[] args) {
        apple obj1=new apple("winter","red");
        mango obj2=new mango("summer",100);
        obj1.details();
        obj2.details();
    }
}
