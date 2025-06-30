class ccar{
    String color;
    String model;
    ccar(String color,String model){
        this.color=color;
        this.model=model;
    }
    void cardetails(){
        System.out.println(color+" "+model);
    }
}
class bmw extends ccar{
    String fueltype;
    bmw(String color,String model,String fueltype) {
        super(color, model);
        this.fueltype = fueltype;
    }
    void bmwdetails(){
        System.out.println(color+" "+model+" "+fueltype);
    }
}
public class singleinheritexample {
    public static void main(String[] args) {
        ccar obj1=new ccar("blue","2023");
        bmw obj2=new bmw("black","2023","petrol");
        obj2.cardetails();
        obj2.bmwdetails();
    }
}
