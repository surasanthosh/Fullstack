interface d{
    static void demo(){
        System.out.println("first feature of java 8 using static keyword");
    }
}
public class firstfeaturestatickeyword {
    public static void main(String[] args) {
        d.demo();                               //object is not required
    }
}