public class StackUarray implements StackIntF<Integer> {
    int top;
    Integer[] stack;
    public StackUarray(int size){
        this.top = -1;
        this.stack = new Integer[size];
    }

    @Override
    public void push(Integer element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full.");
        }
        top = top + 1;
        stack[top] = element;
    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty.");
        }
        Integer result = stack[top];
        top--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (top == stack.length -1) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        StackUarray stackUarray = new StackUarray(5);
        stackUarray.push(10);
        stackUarray.push(20);
        stackUarray.push(30);
        stackUarray.push(40);
        stackUarray.push(50);
        System.out.println(stackUarray.pop());
        System.out.println(stackUarray.pop());
        System.out.println(stackUarray.pop());
        System.out.println(stackUarray.pop());
        System.out.println(stackUarray.pop());
        System.out.println(stackUarray.top);
    }
}
