import java.util.ArrayList;
import java.util.List;

class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        
        List<String> resList = new ArrayList<>();

        dp(0, 0, n, new StringBuilder(), resList);

        return resList;
    }

    public void dp(int open, int close, int n, StringBuilder sb, List<String> resList){

        if(open == n && close == n){
            resList.add(sb.toString());
            return;
        }

        if(open > close){
            
            sb.append(")");

            dp(open, close + 1, n, sb, resList);
            sb.delete(sb.length() - 1, sb.length());
        }

        if(open < n){

            sb.append("(");

            dp(open + 1, close, n, sb, resList);
            sb.delete(sb.length() - 1, sb.length());
        }
    }

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();
        System.out.println(solution.generateParenthesis(3));
    }

}
