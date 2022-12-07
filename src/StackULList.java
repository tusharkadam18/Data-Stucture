public class StackULList extends Slist implements StackIntF<Integer>{

    @Override
    public void print(){
        super.print();
    }

    @Override
    public void push(Integer elememt) {
        addAtFront(elememt);
    }
    
    @Override
    public Integer pop() {
        return deleteFirstNode();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public static void main(String[] args) {
        StackULList stackULList = new StackULList();
        stackULList.push(25);
        stackULList.push(15);
        stackULList.push(5);
        stackULList.print();
        System.out.println("Top of the list(removed): " + stackULList.pop());
        System.out.println("Top of the list(removed): " + stackULList.pop());
        stackULList.print();
    }
}
