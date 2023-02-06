import com.sun.jdi.ObjectReference;

import java.util.Scanner;

public class truthTable {
    static MyStack<boolean[]> stackOp = new MyStack<>();


    public static void main(String[] args) {
        boolean[] p = {false, false, true, true};
        boolean[] q = {false, true, false, true};
        Scanner input = new Scanner(System.in);
        System.out.println("Input Expression: ");
        String inputted = input.next();
        System.out.println("\t\tp\t\t|| \t\tq\t\t || \t\t"+toInfix(inputted));
        for (int i = 0; i < 4; i++){
            System.out.println("\t\t"+p[i]+"\t\t||"+"\t\t"+q[i]+"\t\t||"+"\t\t"+stackOp.top()[i]+"\t\t");
        }
    }

    private static Object toInfix(String infix)
//converts an infix expression to postfix
    {

        MyStack<Object> stack = new MyStack<>();

        operations op = new operations();
        char symbol;

        for (int i = 0; i < infix.length(); i++) {
            boolean[] p = {false, false, true, true};
            boolean[] q = {false, true, false, true};
            symbol = infix.charAt(i);


            if (Character.isLetter(symbol)) {
                stack.push(symbol);
                if (symbol == 'p') {
                    stackOp.push(p);
                } else stackOp.push(q);


            } else if (symbol == '¬') {
                String temp = stack.top().toString();
                boolean[] temp1 = stackOp.top();
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.not(temp1[j]);
                }

                stack.pop();
                stackOp.pop();

                stack.push(symbol + temp);
                stackOp.push(temp1);

            } else {
                String temp = stack.top().toString();
                boolean[] temp1 = stackOp.top();

                temp = symbol + temp;

                stack.pop();
                stackOp.pop();
                temp = '(' + stack.top().toString() + temp + ')';

                boolean[] temp2 = logicOp(symbol, stackOp.top(), temp1);

                stack.pop();
                stackOp.pop();
                stack.push(temp);
                stackOp.push(temp2);

            }

        }

        return stack.top();
    }

    static boolean[] logicOp(char x, boolean[] p1, boolean[] q2) {


        operations op = new operations();
        boolean[] temp1 = new boolean[4];
        switch (x) {
            case ('∧'):
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.and(p1[j], q2[j]);
                }
                return temp1;

            case ('∨'):
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.or(p1[j], q2[j]);
                }
                return temp1;

            case ('↑'):
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.nand(p1[j], q2[j]);
                }
                return temp1;

            case ('↓'):
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.nor(p1[j], q2[j]);
                }
                return temp1;
            case ('→'):
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.then(p1[j], q2[j]);
                }
                return temp1;
            case ('⇔'):
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.biCon(p1[j], q2[j]);
                }
                return temp1;
            case ('⊻'):
                for (int j = 0; j < 4; j++) {
                    temp1[j] = op.exOr(p1[j], q2[j]);
                }
                return temp1;

        }
    return null;
    }
}
