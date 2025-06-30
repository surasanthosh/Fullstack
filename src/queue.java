import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("ajay");    //adding the data
        queue.offer("arun");
        queue.offer("karun");
        System.out.println(queue);
        System.out.println(queue.peek());  //it will accessing the first element
        queue.poll();       //delete
        System.out.println(queue);
    }
}