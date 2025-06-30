class student1{
    private String sname="Manju";
    private String sbranch="CSE";
    private String sroll="22FH";
    private String saddress="dupadu";
    public void setSname(String sname1){
        sname=sname1;
    }
    public void setSbranch(String sbranch1){
        sbranch=sbranch1;
    }
    public void setSroll(String sroll1){
        sroll=sroll1;
    }
    public void setSaddress(String saddress1){
        saddress=saddress1;
    }
    public String getSname(){
        return sname;
    }
    public String getSbranch(){
        return sbranch;
    }
    public String getSroll(){
        return sroll;
    }
    public String getSaddress(){
        return saddress;
    }
}
public class encapsulationgetsetmethod {
    public static void main(String[] args) {
        student1 obj=new student1();
        obj.setSname("Santhosh");
        obj.setSbranch("cse");
        obj.setSroll("22FH5A00511");
        obj.setSaddress("kurnool");
        System.out.println(obj.getSname()+" "+obj.getSbranch()+" "+obj.getSroll()+" "+obj.getSaddress());
    }
}