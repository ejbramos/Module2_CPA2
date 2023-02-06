public class MyStack<E> implements StackInterface<E> {

    int size = 10;
    E[] array = (E[]) new Object[size];
    int ptr = -1;


    @Override
    public void push(E j) throws StackFullException {
    ptr++;
    array[ptr] = j;
    }
    @Override
    public void pop() throws StackEmptyException {
        array[ptr] = null;
        ptr--;

    }
    @Override
    public E top() throws StackEmptyException {
        return array[ptr];
    }
    @Override
    public boolean isEmpty() {
        if (ptr == -1) return true;
        return false;
    }
    @Override
    public boolean isFull() {
        if (ptr == size -1) return true;
        return false;
    }

    @Override
    public int size() {
        return ptr+1;
    }
}