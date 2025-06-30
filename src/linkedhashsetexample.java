import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashsetexample {
    public static void main(String[] args) {
        Set<String> s=new LinkedHashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("deer");                        //it will prints order
        s.add("elephant");                    //duplication is not allowed
        System.out.println(s);
    }
}