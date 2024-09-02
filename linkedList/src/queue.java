import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] arg){
        Queue<Integer> qu = new PriorityQueue<>();
        qu.offer(100);
        qu.offer(200);
        qu.offer(300);
        qu.offer(400);
        qu.offer(500);
        System.out.println(qu);
        System.out.println("Deleted element is: " + qu.poll());
        System.out.println("Front element is: " + qu.peek());

    }
}
