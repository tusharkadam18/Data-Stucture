public interface QueueIntF<T> {
    public void addQ(T element);
    public T deleteQ();
    public boolean isFull();
    public boolean isEmpty();
}

