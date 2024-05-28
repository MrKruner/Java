import java.util.ArrayList;
import java.util.List;

class BaseballGame {
    
    public int calPoints(String[] operations) {
        
        List<Integer> score = new ArrayList<>();

        for(int i=0; i<operations.length; i++){
            
            if(operations[i] == "+"){
                score.add(score.get(score.size() - 1) + score.get(score.size() - 2));
            }else if(operations[i] == "D"){
                score.add(score.get(score.size() - 1) * 2);
            }else if(operations[i] == "C"){
                score.remove(score.size() - 1);
            }else{
                score.add(Integer.parseInt(operations[i]));
            }
        }

        int res = 0;

        for(int n: score){
            res += n;
        }

        return res;
    }  
    
    public static void main(String[] args) {
        BaseballGame solution = new BaseballGame();
        String[] arr = {"5","2","C","D","+"};
        System.out.println(solution.calPoints(arr));
    }
}
