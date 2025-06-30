class santh{
    public void student(String name,String Branch){
        System.out.println(name+" "+Branch);
    }
    public void student(String name,String Branch,String address){
        System.out.println(name+" "+Branch+" "+address);
    }
}
public class methodloadingexample {
    public static void main(String[] args) {
        santh obj=new santh();
        obj.student("santhosh","CSE");
        obj.student("santhosh","CSE","knl");
    }
}