class doggg{
    String name;
    String color;
    doggg(String name,String color){
        this.name=name;
        this.color=color;
    }
    void display(){
        System.out.println(name+" "+color);
    }
}
class baby_dog extends doggg{
    int age;
    baby_dog(String name,String color,int age){
        super(name,color);
        this.age=age;
    }
    void display(){
        super.display();
        System.out.println(name+" "+color+" "+age);

    }
}
public class singleinheritexample2{
    public static void main(String[] args) {
        baby_dog obj=new baby_dog("Buddy","white",5);
        obj.display();
    }
}