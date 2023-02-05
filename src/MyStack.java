public class MyStack implements StackInterface {

    private int size = 100;
    public Object[] array = new Object[size];
    private int ptr = -1;

    @Override
    public void push(Object j) throws StackFullException {
    ptr++;
    array[ptr] = j;
    }
    @Override
    public void pop() throws StackEmptyException {
        array[ptr] = null;
        System.out.println(array[ptr]);
        ptr--;

    }
    @Override
    public Object top() throws StackEmptyException {
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