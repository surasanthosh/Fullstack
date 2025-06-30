import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuereversebystack {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        Stack<String> s=new Stack<>();
        q.offer("s");
        q.offer("a");
        q.offer("n");
        q.offer("t");
        q.offer("h");
        q.offer("o");
        q.offer("s");
        q.offer("h");
        System.out.println("orginal name: "+q);
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
        System.out.println("reverse name: "+q);
    }
}
