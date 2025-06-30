import java.util.ArrayList;
import java.util.List;

public class collectorarraylist2 {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("pineapple");
        System.out.println(fruits);
        fruits.add(1,"graphes");
        System.out.println(fruits);
        System.out.println(fruits.get(3));
        fruits.remove(0);
        System.out.println(fruits);
        fruits.set(1,"melon");
        System.out.println(fruits);
        System.out.println(fruits.contains("mango"));
    }
}
