import java.util.Scanner;

public class truthTable {
    public static void main(String[] args){
        MyStack stack = new MyStack();

        Scanner input = new Scanner(System.in);
        System.out.println("Input Expression: ");
        String inputted = input.next();
        System.out.println(toInfix(inputted));

    }
    private static Object toInfix(String infix)
//converts an infix expression to postfix
    {
        MyStack stack = new MyStack();
        char symbol;

        for (int i = 0; i < infix.length();i++){
            symbol = infix.charAt(i);

            if(Character.isLetter(symbol)){
                stack.push(symbol);
            }
            else if(symbol == '¬'){
                String temp = stack.top().toString();
                stack.pop();

                stack.push(symbol+temp);
            }

        }
    return stack.top();
    }
}
