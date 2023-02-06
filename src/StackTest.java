public class StackTest {
    public static void main(String[] args){
        MyStack<String> stack = new MyStack<>();

        for (int i = 0; i < 100; i++) {
            stack.push("Push");
            System.out.println(stack.isFull());
        }


    }
}
