class java{
    public void person(String name,int age){
        System.out.println(name+" "+age);
    }
    public void dog(String name,String color){
        System.out.println(name+" "+color);
    }
}
public class methodcallingexample {
    public static void main(String[] args) {
        java obj=new java();
        obj.person("santhosh",21);
        obj.dog("charle","white");
    }
}
