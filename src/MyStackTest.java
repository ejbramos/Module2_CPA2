import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    Stack<Object> stack = new Stack<>();
    MyStack<Object> stack1 = new MyStack<>();

    @org.junit.jupiter.api.Test
    void push() {
        stack.push("Push");
        stack1.push("Push");
        assertEquals(stack.peek(),stack1.top());
        assertEquals(stack.size(),stack1.size());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        for(int i = 0; i < 5; i++){
            stack.push("Push");
            stack1.push("Push");
        }
        stack.pop();
        stack1.pop();

        assertEquals(stack.size(),stack1.size());
        assertEquals(stack.peek(),stack1.top());

    }

    @org.junit.jupiter.api.Test
    void top() {
        for(int i = 0; i < 5; i++){
            stack.push("Push");
            stack1.push("Push");
        }
        stack.pop();
        stack1.pop();

        assertEquals(stack.size(),stack1.size());
        assertEquals(stack.peek(),stack1.top());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {

        assertEquals(stack.isEmpty(),stack1.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void isFull() {
        for(int i = 0; i < 10; i++){
            stack1.push("Push");
        }
        assertEquals(true,stack1.isFull());
    }

    @org.junit.jupiter.api.Test
    void size() {
        for(int i = 0; i < 10; i++){
            stack.push("shamwow");
            stack1.push("Push");
        }
        assertEquals(stack.size(),stack1.size());
    }
}