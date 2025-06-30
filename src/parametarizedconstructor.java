class mno{
    String name;             //variables
    int age;                 //variables
    mno(String n,int a){     //constructor parametarized
        name=n;
        age=a;
    }
    public void details(){                        //method
        System.out.println(name+" "+age);
    }
}
public class parametarizedconstructor {
    public static void main(String[] args) {
        mno obj=new mno("santhosh",21);
        obj.details();
    }
}
