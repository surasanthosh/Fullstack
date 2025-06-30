interface o{   //parent
    void add();
}
interface l{   //parent
    void sub();
}
class g implements o,l{   //child
    public void add(){
        System.out.println("parent 1");
    }
    public void sub(){
        System.out.println("parent 2");
    }
}
public class multipleinheritwithinterface {
    public static void main(String[] args) {
         g obj=new g();
        obj.add();
        obj.sub();
    }
}
