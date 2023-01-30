import java.util.Stack;
import java.util.*;
import java.lang.*;
public class postfix {
    String question = "((A+(B*(C/A)))-(B/C))";
    String postfix = "";
    Stack<Character> stack = new Stack<>();

    
    for (char i: question){
        System.out.print(i);
    }
}
