import java.util.Vector;

public class collectionvector {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("2");
        v.add("F");
        v.add("H");
        v.add("5");
        v.add("A");
        v.add("0");
        v.add("5");
        v.add("1");
        System.out.println(v);
        v.add(0,"1");
        System.out.println(v);
        v.add(9,"1");
        System.out.println(v);
        v.set(0,"2");
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }
}