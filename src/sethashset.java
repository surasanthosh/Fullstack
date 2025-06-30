import java.util.HashSet;
import java.util.Set;

public class sethashset {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("abc");
        s.add("hai");
        s.add("def");
        s.add("hello");
        s.add("def");
        System.out.println(s);
        s.remove("abc");
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}