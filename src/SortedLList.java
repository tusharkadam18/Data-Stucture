
public class SortedLList implements SortedListIntf<Integer>{
    
    Node head;
    
    public SortedLList(){
        this.head = null;
    }
    public void insert_into_sortedList(Integer element){
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            return;
        }
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (current.data > newNode.data) {
                break;
            }
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        previous.next = newNode;
        newNode.next = current;
    }
    @Override
    public void print(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");    
    }
    @Override
    public void delete(Integer element) {
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data == element) {
                break;
            }
            previous = current;
            current = current.next;
        }
        if (current == null) {
            throw new RuntimeException("Element is not present");
        }
        if (current == head) {
            head = null;
            return;
        }
        previous.next = current.next;
    }
    
    
}
