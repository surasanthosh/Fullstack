class persons{
    private String name="Money";
    private int age=21;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class encapsulationreadonlyset {
    public static void main(String[] args) {
        persons obj=new persons();
        System.out.println(obj.getName()+" "+obj.getAge());
    }
}