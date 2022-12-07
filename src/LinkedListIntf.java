public interface LinkedListIntf<T> {
    public void addAtFront(T element);
    public T deleteFirstNode();
    public void addAtLast(T element);
    public T deleteLastNode();
    public void print();
    public boolean search(T element);
    public void reverse();
}
