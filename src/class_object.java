/*class person{
    String name="santhosh";
    int age=21;
}
public class class_object {
    public static void main(String[] args) {
        person obj=new person();
        System.out.println("person name: "+obj.name);
        System.out.println("person age: "+obj.age);
    }
} */


class person{
    String name;
    int age;
}
public class class_object {
    public static void main(String[] args) {
        person obj=new person();
        obj.name="Ajay";
        obj.age=21;
        System.out.println("person name: "+obj.name);
        System.out.println("person age: "+obj.age);
    }
}