import java.util.LinkedList;
import java.util.Queue;

public class queueexample {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        q.add("aa");
        q.offer("bb");
        System.out.println(q);
        System.out.println( q.contains("10"));
        System.out.println(q.size());
        q.add("cc");
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        q.remove("cc");
        System.out.println(q);
        q.clear();
        System.out.println(q);
    }
}