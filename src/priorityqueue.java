import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("ram");
        pq.add("ajay");
        pq.add("sampath");
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add("2");
        pq.add("1");
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}