class people{
    String name="santhosh";
    int age=21;
}
class dog {
    String name="Munna";
    String breed="GS";
    String color="Brown";
}
public class class_objectexample {
    public static void main(String[] args) {
        people obj=new people();
        System.out.println("person name: "+obj.name);
        System.out.println("person age: "+obj.age);
        dog obj1=new dog();
        System.out.println("dog name: "+obj1.name);
        System.out.println("dog breed: "+obj1.breed);
        System.out.println("dog color: "+obj1.color);
    }
}
