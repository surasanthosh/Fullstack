class animal{
    String color;
    String type;
    animal(String color,String type){
        this.color=color;
        this.type=type;
    }
    void anidisplay(){
        System.out.println(color+" "+type);
    }
}
class dogg extends animal{
    String name;
    dogg(String color,String type,String name){
        super(color,type);
        this.name=name;
    }
    void dogdisplay(){
        System.out.println(color+" "+type+" "+name);
    }
}
class babydog extends dogg{
    String gender;
    babydog(String color,String type,String name,String gender){
        super(color,type,name);
        this.gender=gender;
    }
    void babydisplay(){
        System.out.println(color+" "+type+" "+name+" "+gender);
    }
}
public class multilevelinheritexample {
    public static void main(String[] args) {
        babydog obj=new babydog("white","carnivorous","buddy","male");
        obj.anidisplay();
        obj.dogdisplay();
        obj.babydisplay();
    }
}
