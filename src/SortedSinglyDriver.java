public class SortedSinglyDriver {
    public static void main(String[] args) {
        SortedLList sortedLList = new SortedLList();
        sortedLList.insert_into_sortedList(2);
        sortedLList.insert_into_sortedList(5);
        sortedLList.insert_into_sortedList(4);
        sortedLList.insert_into_sortedList(9);
        sortedLList.insert_into_sortedList(12);
        sortedLList.print();
        sortedLList.insert_into_sortedList(1);
        sortedLList.delete(47);
        sortedLList.print();
        
        // sortedLList.print();
    }
}
