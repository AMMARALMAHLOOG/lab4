import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Arabic on 02/02/22.
 */
public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue=new ArrayQueue<>(5);
        System.out.println("input queue element");
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            queue.enqueue(in.nextInt());
            System.out.println("frist= " + queue.first());
            System.out.println("size= " + queue.size());
        }
        System.out.println("queue elements are ");
        queue.dequeue();
        while (!queue.isEmpty())
            System.out.print(queue.dequeue()+"\t");


    }
}
