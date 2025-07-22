import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top; // Pointer to the top of the stack
    int size;

    Stack() {
        top = null;
        size = 0;
    }

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty operation
    boolean isEmpty() {
        return top == null;
    }

    // size operation
    int size() {
        return size;
    }
}

public class StackUsingLL{
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top element is: " + st.peek()); // 30
        System.out.println("Popped element is: " + st.pop()); // 30
        System.out.println("Top after pop: " + st.peek()); // 20
        System.out.println("Is empty: " + st.isEmpty()); // false
        System.out.println("Size: " + st.size()); // 2
    }
}
