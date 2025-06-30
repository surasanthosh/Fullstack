import java.util.ArrayList;
import java.util.List;

public class collectionforarraylist {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("santhosh");
        list.add("22FH5A0511");
        list.add("CSE");
        System.out.println(list);
        list.add(3,"kurnool");
        System.out.println(list);
        list.add(4,"9966034139");
        System.out.println(list);
        System.out.println(list.contains("area"));
        list.clear();
        System.out.println(list);
    }
}
