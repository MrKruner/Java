package ProblemADay;

import java.util.Scanner;
import java.util.Stack;

public class TransferDecimalIntoBinary {
    public static void main(String[] args) {

        int heSoCanChuyen = 8;

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        Stack<Integer> myStack = new Stack<>();

        while (num != 0) {
            myStack.push(num % heSoCanChuyen);
            num /= heSoCanChuyen;
        }

        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
