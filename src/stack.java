import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("san");
        s.push("can");
        s.push("aa");
        System.out.println(s);
        s.add(1, "man");
        System.out.println(s);
        s.set(0, "van");
        System.out.println(s);
        s.pop();
        System.out.println();
        System.out.println(s.contains("owl"));
        s.remove(3);
        System.out.println(s);
        System.out.println(s.get(1));
        s.clear();
        System.out.println(s);
    }
}