public class SinglyListDriver {
    public static void main(String[] args) {
        Slist slist = new Slist();
        slist.addAtFront(5);
        slist.addAtFront(15);
        slist.addAtFront(25);
        slist.addAtFront(35);
        slist.addAtFront(45);
        slist.addAtFront(65);
        slist.addAtFront(75);
        slist.addAtFront(85);
        slist.addAtFront(95);
        // slist.print();
        // slist.deleteLastNode();
        slist.addAtLast(25);
        slist.print();
        slist.deleteLastNode();
        slist.print();
        slist.deleteFirstNode();
        slist.print();
        slist.deleteFromPos(7);
        slist.print();
        System.out.println(slist.tail.data);
        slist.reverse();
        slist.print();
    }
}
