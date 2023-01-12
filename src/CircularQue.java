import java.util.Arrays;

public class CircularQue implements QueueIntF<Integer> {

    int front;
    int rear;
    Integer[] cqueue;

    public CircularQue(int size) {
        this.front = 0;
        this.rear = 0;
        this.cqueue = new Integer[size];
    }

    @Override
    public void addQ(Integer element) {
        if (isFull()) {
            throw new RuntimeException();
        }
        cqueue[rear] = element;
        rear = (rear + 1) % (cqueue.length);
    }

    @Override
    public Integer deleteQ() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        Integer result = cqueue[front];
        front = (front + 1) % cqueue.length;
        return result;
    }

    @Override
    public boolean isFull() {
        if ((rear + 1) % (cqueue.length) == rear) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if (rear == front) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CircularQue circularQue = new CircularQue(5);
        circularQue.addQ(5);
        circularQue.addQ(15);
        circularQue.addQ(20);
        circularQue.addQ(25);
        System.out.println(circularQue.deleteQ());
        System.out.println(circularQue.deleteQ());
        System.out.println(circularQue.deleteQ());
        System.out.println(circularQue.deleteQ());
        System.out.println(Arrays.toString(circularQue.cqueue));
    }
}
