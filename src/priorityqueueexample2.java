import java.util.PriorityQueue;

public class priorityqueueexample2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.offer("Ram");
        pq.offer("Abhi");
        pq.offer("Vijay");
        pq.offer("Money");
        pq.offer("Bob");
        System.out.println(pq);
         while(!pq.isEmpty()){
             System.out.println(pq.poll());
         }
    }
}