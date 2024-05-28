package ProblemADay;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        List<Integer> intList = new ArrayList<>();
        
        myStack.addAll(intList);
        myStack.removeIf(n -> n < 6);
    }    
}
