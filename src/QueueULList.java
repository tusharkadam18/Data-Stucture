public class QueueULList extends Slist implements QueueIntF<Integer>{

    @Override
    public void addQ(Integer element) {
        addAtFront(element);
    }

    @Override
    public Integer deleteQ() {
        return deleteLastNode();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }

    public static void main(String[] args) {
        QueueULList queueULList = new QueueULList();
        queueULList.addQ(25);
        queueULList.addQ(5);
        queueULList.addQ(2);
        System.out.println(queueULList.deleteLastNode());
    }   
}
