import java.util.LinkedList;
import java.util.List;

public class collectionlinkedlist {
    public static void main(String[] args) {
        LinkedList<String> LL=new LinkedList<>();
        LL.add("ajay");
        LL.add("abhi");
        LL.add(1,"ram");
        System.out.println(LL);
        LL.addFirst("abc");
        System.out.println(LL);
        LL.addLast("def");
        System.out.println(LL);
        LL.removeFirst();
        System.out.println(LL);
        LL.removeLast();
        System.out.println(LL);
        LL.clear();
        System.out.println(LL);
    }
}