interface i{
    static void person1(String name,int age){
        System.out.println(name+" "+age);
    }
    default void person2(String name,int age){
        System.out.println(name+" "+age);
    }
}
class per {
    public void person2(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class staticdefaultinterface1 {
    public static void main(String[] args) {
        i.person1("san",21);
        per obj=new per();
        obj.person2("san",21);
    }
}
