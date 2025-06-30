import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.addFirst(1);
        ad.addLast(2);
        ad.addLast(3);
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        ad.removeLast();
        System.out.println(ad);
    }
}