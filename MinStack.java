import java.util.*;

public class MinStack {
    private Stack<AbstractMap.SimpleEntry<Integer, Integer>> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(new AbstractMap.SimpleEntry<>(x, x));
        } else {
            int currentMin = stack.peek().getValue();
            stack.push(new AbstractMap.SimpleEntry<>(x, Math.min(x, currentMin)));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().getKey();
    }

    public int getMin() {
        return stack.peek().getValue();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        System.out.println("Top: " + stack.top());     // 7
        System.out.println("Min: " + stack.getMin());  // 3
        stack.pop();
        System.out.println("Top after pop: " + stack.top());   // 3
        System.out.println("Min after pop: " + stack.getMin()); // 3
    }
}
