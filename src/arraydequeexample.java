import java.util.ArrayDeque;
public class arraydequeexample {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.offer("ashok");
        ad.offer("vijay");
        System.out.println(ad);
        ad.offerFirst("vij");
        ad.offerLast("jiu");
        System.out.println(ad);
        ad.pollLast();
        System.out.println(ad);
        System.out.println(ad.peek());
        ad.pollFirst();
        System.out.println(ad);
        ad.remove();
        System.out.println(ad);
        ad.clear();
        System.out.println(ad);
    }
}