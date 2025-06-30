import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(55);                                       //it will unorder
        s.add(4);                                        //duplication is not allowed
        s.add(5);
        s.add(5);
        System.out.println(s);
    }
}