import java.util.LinkedList;

public class collectionlinkedlist1 {
    public static void main(String[] args) {
        LinkedList<Integer> LL=new LinkedList<>();
        LL.add(9);
        LL.add(6);
        LL.add(6);
        LL.add(0);
        LL.add(3);
        LL.add(4);
        LL.add(1);
        LL.add(3);
        System.out.println(LL);
        LL.addFirst(9);
        System.out.println(LL);
        LL.addLast(6);
        System.out.println(LL);
        LL.remove(9);
        System.out.println(LL);
        LL.add(9,9);
        System.out.println(LL);
        LL.clear();
        System.out.println(LL);
    }
}