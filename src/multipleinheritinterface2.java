interface vehicle{
    void vshow(String vehicleno,String color);
    void vshow1(String vsound);
}
interface car1 extends vehicle{
    void cshow(String name,String color,String price);
    void cshow1(String csound);
}
interface bike extends vehicle{
    void bshow(String name,String price,String enggno);
    void bshow1(String bsound);
}
class sunny implements bike{
    public void vshow(String vehicleno,String color){
        System.out.println("vehicle: "+vehicleno+" "+color);
    }
    public void vshow1(String vsound){
        System.out.println("vehicle sound: "+vsound);
    }
    public void cshow(String name,String color,String price){
        System.out.println("car :"+name+" "+color+" "+price);
    }
    public void cshow1(String csound){
        System.out.println("car sound: "+csound);
    }
    public void bshow(String name,String price,String enggno){
        System.out.println("Bike: "+name+" "+price+" "+enggno);
    }
    public void bshow1(String bsound){
        System.out.println("Bike sound: "+bsound);
    }
}
public class multipleinheritinterface2 {
    public static void main(String[] args) {
        sunny obj=new sunny();
        obj.vshow("5555","black");
        obj.vshow1("hard");
        obj.cshow("Benz","white","2500000");
        obj.cshow1("smooth");
        obj.bshow("pulsar","150000","5905");
        obj.bshow1("voilent");
    }
}
