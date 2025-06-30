import java.util.PriorityQueue;

public class priotityqueueexample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(34);
        pq.add(100);
        pq.add(45);
        pq.add(12);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove(100);
        System.out.println(pq);
        pq.clear();
        System.out.println(pq);
    }
}