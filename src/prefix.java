import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class prefix {

    public static void main(String argv[]) throws IOException
    {
        Stack<String> operators = new Stack<>();
        String infix;
//create an input stream object
        BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
//get input from user
        System.out.print("\nEnter the infix expression you want to convert: ");
        infix = keyboard.readLine();
//output as postfix
        System.out.println("Postfix expression for the given infix expression is:" + toPrefix(reverseInfix(infix)));

    }

    private static String reverseInfix(String infix){
        String newInfix = "";
        for(int i = infix.length()-1; i>-1;i--) {
            char inputInfix = infix.charAt(i);
            if (inputInfix == ')') inputInfix = '(';
            else if(inputInfix == '(') inputInfix = ')';
            newInfix = newInfix + inputInfix;
        }
        return newInfix;
    }

    private static String toPrefix(String infix)

//converts an infix expression to postfix

    {
        Stack<Character> operators = new Stack<>();
        char symbol;
        String postfix = "";
        for (int i = 0; i < infix.length(); ++i)
//while there is input to be read
        {
            symbol = infix.charAt(i);
//if it's an operand, add it to the string
            if (Character.isLetter(symbol))
                postfix = postfix + symbol;
            else if (symbol == '(')
//push (
            {
                operators.push(symbol);
            } else if (symbol == ')')
//push everything back to (
            {
                while (operators.peek() != '(') {
                    postfix = postfix + operators.pop();
                }
                operators.pop();        //remove '('
            } else
//print operators occurring before it that have greater precedence
            {
                while (!operators.isEmpty() && !(operators.peek() == '(') && prec(symbol) < prec(operators.peek()))
                    postfix = postfix + operators.pop();
                operators.push(symbol);
            }
        }
        while (!operators.isEmpty())
            postfix = postfix + operators.pop();
        return reverseInfix(postfix);
    }

    static int prec(char x) {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        return 0;
    }
}