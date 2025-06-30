class car{
    String carname;
    String carmodel;
    String carcolor;
    String carprice;
    car(String cn,String cm,String cc,String cp){
        carname=cn;
        carmodel=cm;
        carcolor=cc;
        carprice=cp;
    }
    public void cardetails(){
        System.out.println(carname+" "+carmodel+" "+carcolor+" "+carprice);
    }
}
public class constructorexample {
    public static void main(String[] args) {
        car obj=new car("benz","top","black","10L");
        obj.cardetails();
        car obj1=new car("adi","midle","white"," ");
        obj1.cardetails();

    }
}





