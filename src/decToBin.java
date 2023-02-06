import java.util.Stack;
import java.util.Scanner;


public class decToBin {
    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();

        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number: ");
        int num = input.nextInt();

        while (num >= 1){
            binary.push(num % 2);
            num = num / 2;
        }


        System.out.println("The final binary is ");
        while (!(binary.isEmpty())){
            System.out.print(binary.pop());
        }
    }
}