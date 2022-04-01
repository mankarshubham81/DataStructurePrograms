import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// package Queue;

public class TheQueue {
    public static void main(String[] args) {
        // The Standard Queue
        Queue<Integer> aQueue = new LinkedList<>();
        aQueue.add(3);
        aQueue.add(2);
        aQueue.add(1);

        System.out.println(aQueue);
        System.out.println(aQueue.remove());
        System.out.println(aQueue);
        System.out.println(aQueue.peek());

        // The Deuqe 
        System.out.println(" Below Output is of The Deuqe ");
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(5);
        deque.add(2);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        deque.push(100);
        System.out.println(deque);
    }
}
