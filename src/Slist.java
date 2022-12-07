public class Slist implements LinkedListIntf<Integer> {
    public Node head, tail;

    public Slist() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void addAtFront(Integer element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
    }

    @Override
    public void addAtLast(Integer element) {
        Node newNode = new Node(element);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    @Override
    public void print() {
        Node current = head;

        if (current == null) {
            System.out.println("The list in Empty.");
            return;
        }
        System.out.print("The Elements of the List are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public Integer deleteFirstNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is Empty. cannot delete Element");
        }
        Integer result = head.data;
        head = head.next;
        // has we oremoved nly node in th lsit
        if (head == null) {
            tail = null;
        }
        return result;
    }

    @Override
    public Integer deleteLastNode() {
        if (isEmpty()) {
            throw new RuntimeException("No Node Present in the List.");
        }
        if (head.next == null) {
            int headdata = head.data;
            head = null;
            return headdata;
        }
        Node second_lastNode = head;
        while (second_lastNode.next.next != null) {
            second_lastNode = second_lastNode.next;
        }
        Integer res = second_lastNode.next.data;
        second_lastNode.next = null;
        return res;
    }

    @Override
    public boolean search(Integer element) {
        if (isEmpty()) {
            return false;
        }
        Node currentNode = head;
        int temp = 0;
        while (currentNode != null) {
            if (currentNode.data == element) {
                temp++;
            }
            currentNode = currentNode.next;
        }
        if (temp > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int deleteFromPos(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("List is Empty.");
        }
        if (pos < 0) {
            throw new RuntimeException("Enter the Valid Position.");
        }
        int position = pos;
        Node current = head;
        Node previous = head;
        while (current != null && position > 0) {
            previous = current;
            current = current.next;
            position--;
        }
        if (pos == 0) {
            int temp = head.data;
            head = head.next;
            return temp;
        }
        if (current == null) {
            throw new RuntimeException("Pos is greater than number of nodes in the list.");
        }
        int temp = current.data;
        previous.next = current.next;
        tail = previous;
        return temp;
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    @Override
    public void reverse() {
        if (head == null) {
            throw new RuntimeException("List is Empty.");
        }
        Node previous = head;
        Node current = head.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }
}