 
// only work with not significant String num and k

import java.util.Stack;

class removeKDigitsMySolution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k){
            return "0";
        }

        for(int i=0; i<k; i++){
            int pointer = 0;
            while(pointer<num.length()-1 && Integer.parseInt(String.valueOf(num.charAt(pointer))) <= Integer.parseInt(String.valueOf(num.charAt(pointer+1)))){
                pointer++;
            }

            num = num.substring(0, pointer) + num.substring(pointer+1, num.length());
        }
        int numInt = Integer.parseInt(num);

        return Integer.toString(numInt);
    }
    public static void main(String[] args) {
        removeKDigitsMySolution solution = new removeKDigitsMySolution();
        System.out.println(solution.removeKdigits("1100", 1));
    }
}

class removeKdigitsStackSolution{
    public String removeKdigits(String num, int k) {
        Stack<Character> numStack = new Stack<>();

        if(k== num.length()){
            return "0";
        }

        for(char c: num.toCharArray()){

            while(!numStack.isEmpty()&& k>0 && numStack.peek()> c){
                numStack.pop();
                k--;
            }

            if(!numStack.isEmpty() || c!='0'){
                numStack.push(c);
            }
        }
        
        while (!numStack.isEmpty()&&k>0) {
            numStack.pop();
            k--;     
        }

        StringBuilder result = new StringBuilder();
        for(char c: numStack){
            result.append(c);
        }

        return result.toString().length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        removeKdigitsStackSolution solution = new removeKdigitsStackSolution();
        System.out.println(solution.removeKdigits("10", 1));
    }
}