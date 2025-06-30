class person1{
    private String name="Money";
    private int age=21;
    public void setName(String name1){
        name=name1;
    }
    public void setAge(int age1){
        age=age1;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class encapsulationwriteonlyget {
    public static void main(String[] args) {
        person1 obj=new person1();
        obj.setName("Santhosh");
        obj.setAge(22);
        System.out.println(obj.getName()+" "+obj.getAge());
    }
}