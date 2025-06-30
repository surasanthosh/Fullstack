import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseofqueuebyusingstack {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        queue.offer(8);
        queue.offer(1);
        queue.offer(0);                          //queue
        queue.offer(4);
        System.out.println("orginal order "+queue);
        while(!queue.isEmpty()){
            stack.push(queue.poll());              //converting queue into stack
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());              //converting stack into queue"reverse"
        }
        System.out.println("reverse order "+queue);
    }
}