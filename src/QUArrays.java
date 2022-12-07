import java.util.Arrays;
public class QUArrays implements QueueIntF<Integer>{ // queue using array...
    int rear;
    int front;
    int max_size;
    int[] queue = new int[max_size];
    public QUArrays(int max_size) {
        this.rear = -1;
        this.front = -1;
        this.max_size = max_size;
        this.queue = new int[max_size];
    }

    @Override
    public void addQ(Integer element) {
        if (isFull()) {
            throw new RuntimeException();
        }
        rear = rear + 1;
        queue[rear] = element;
        System.out.println("Rear: " + rear +", element: " + queue[rear]);
    }

    @Override
    public Integer deleteQ() {
       if (isEmpty()) {
        throw new RuntimeException();      
       }
       front = front + 1;
       System.out.println("Front: " + front + ", elememt: " +queue[front]);
       return queue[front];
    }

    @Override
    public boolean isFull() {
        if (rear == queue.length - 1) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if (rear == front) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        QUArrays quArray = new QUArrays(5);
        quArray.addQ(5);
        quArray.addQ(10);
        quArray.addQ(15);
        quArray.addQ(20);
        quArray.deleteQ();
        quArray.deleteQ();
        quArray.deleteQ();
        quArray.addQ(25);
        System.out.println(Arrays.toString(quArray.queue));
    }
}
