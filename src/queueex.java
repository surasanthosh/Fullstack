import java.util.LinkedList;
import java.util.Queue;

public class queueex {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("A");
        q.offer("J");
        q.offer("A");
        q.offer("Y");

        System.out.println("Original Queue: " + q);
        for(int i=q.size()-1;i>=0;i--){
            System.out.println(q);
        }
    }
}
