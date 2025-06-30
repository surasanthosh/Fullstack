import java.util.Vector;

public class collectionforvector {
    public static void main(String[] args) {
        Vector<String> clg=new Vector<>();
        clg.add("DR KVSRIT");
        clg.add("CSE");
        clg.add(2,"MECH");
        System.out.println(clg);
        clg.add(3,"ECE");
        clg.add("EEE");
        System.out.println(clg);
        System.out.println(clg.size());
        System.out.println(clg.get(0));
        clg.remove(4);
        System.out.println(clg);
        System.out.println(clg.contains("civil"));
        clg.clear();
        System.out.println(clg);
    }
}
