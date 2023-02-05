public class StackTest {
    public static void main(String[] args){
        MyStack stack = new MyStack();

        for (int i = 0; i < 100; i++) {
            stack.push("Gwapo");
        }
        for (int i = 0; i < 100; i++) {
            stack.pop();
        }

    }
}
