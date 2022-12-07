import java.util.*;

public class ValidParenthesis implements StackIntF<Character> {

    @Override
    public void push(Character elememt) {
        if (isFull()) {
            throw new RuntimeException("The stack is full.");
        }
        top = top + 1;
        stack[top] = elememt;
    }

    int top;
    char[] stack;

    public ValidParenthesis(int size) {
        this.top = -1;
        this.stack = new char[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (stack.length - 1);
    }

    @Override
    public Character pop() {
        if (isEmpty()) {
            throw new RuntimeException("The Stack is Empty");
        }
        Character res = stack[top];
        top = top - 1;
        return res;
    }

    public char peek() {
        return stack[top];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.next();
        scanner.close();
        Character[] stack = new Character[str.length()];
        ValidParenthesis sParenthesis = new ValidParenthesis(stack.length);
        for (Character a : str.toCharArray()) {
            if (!sParenthesis.isEmpty() && (sParenthesis.peek() == a - 1 || sParenthesis.peek() == a - 2)) {
                sParenthesis.pop();
            } else {
                sParenthesis.push(a);
            }
        }
        if (sParenthesis.isEmpty()) {
            System.out.println("These are valid parenthesis.");
        } else {
            System.out.println("These are not valid prenthesis.");
        }
    }
}

// for (int i = 0; i < stack.length; i++) {
// sParenthesis.push(str.charAt(i));
// }
// System.out.println(Arrays.toString(stack));
// for (int i = 0; i < stack.length; i++) {
// char top = stack[i];
// for (int j = i + 1; j < stack.length; j++) {
// System.out.println((int)top);
// System.out.println((int)stack[j] + 1);
// if((int)top == ((int)stack[j] - 1) || (int)top == ((int)stack[j] - 2)){
// System.out.println(sParenthesis.pop());;
// }
// }
// }
// if (sParenthesis.isEmpty()) {
// System.out.println("These are valid parenthesis.");
// }
// else{
// System.out.println("These are not valid prenthesis.");
// }
