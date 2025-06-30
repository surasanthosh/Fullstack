import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet<>();
        s.add(1);
        s.add(3);
        s.add(2);                                   //it will follows order
        s.add(6);                                   //slower for adding,removing & fasting for searching
        s.add(0);
        System.out.println(s);
    }
}