/**
 * Created by Arabic on 02/02/22.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size ();
    void enqueue (E element);
    E dequeue ();
    E first();

}
