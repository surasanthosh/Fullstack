interface I1{
    void vehicle(String vehicleno,String color);
    void vehicle1(String vsound);
}
interface I2 extends  I1{
    void car(String name,String color,String price);
    void car1(String csound);
}
interface I3 extends I2{
    void bike(String name,String price,String enggno);
    void bike1(String bsound);
}
class bunny implements I3{
    public void vehicle(String vehicleno,String color){
        System.out.println(vehicleno+" "+color);
    }
    public void vehicle1(String vsound){
        System.out.println(vsound);
    }
    public void car(String name,String color,String price){
        System.out.println(name+" "+color+" "+price);
    }
    public void car1(String csound){
        System.out.println(csound);
    }
    public void bike(String name,String price,String enggno){
        System.out.println(name+" "+price+" "+enggno);
    }
    public void bike1(String vsound){
        System.out.println(vsound);
    }
}
public class multilevelinheritinterface {
    public static void main(String[] args) {
        bunny obj=new bunny();
        obj.vehicle("5555","white");
        obj.vehicle1("hard");
        obj.car("Benz","white","2500000");
        obj.car1("smooth");
        obj.bike("pulsar","150000","5905");
        obj.bike1("voilent");
    }
}
