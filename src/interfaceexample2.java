interface college{
    public void btech(String name,int yearsno,float percentage);
    public void diploma(String name,int yearsno,float percentage);
    public void ssc(String name,int yearsno,float percentage);
}
class college1 implements college{
    public void btech(String name,int yearsno,float percentage){
        System.out.println(name+" "+yearsno+" "+percentage);
    }
    public void diploma(String name,int yearsno,float percentage){
        System.out.println(name+" "+yearsno+" "+percentage);
    }
    public void ssc(String name,int yearsno,float percentage){
        System.out.println(name+" "+yearsno+" "+percentage);
    }
}
public class interfaceexample2 {
    public static void main(String[] args) {
        college1 obj=new college1();
        obj.btech("DRKVSRIT",3,75);
        obj.diploma("BITS",3,76);
        obj.ssc("ZPHS",1,87);
    }
}