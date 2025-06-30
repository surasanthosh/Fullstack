abstract class man{
    abstract void emp(String name,String salary);
    abstract void dep(String name,String id);
    void clg(String name){
        System.out.println("College name: "+name);
    }


}
class peopl extends man{
    void emp(String name,String salary){
        System.out.println(name+" "+salary);
    }
    void dep(String name,String id){
        System.out.println(name+" "+id);
    }
}
public class abstractclassexample {
    public static void main(String[] args) {
        peopl obj = new peopl();
        obj.emp("san", "100000");
        obj.dep("vij", "ABC01");
        obj.clg("drkvsrit");
    }
}
