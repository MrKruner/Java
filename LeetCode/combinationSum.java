import java.util.ArrayList;
import java.util.List;

class CombinationSumSolution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> listResult = new ArrayList<>();
        decision(candidates, 0, target, 0, listResult, new ArrayList<>());
        
        return listResult;
    }

    public void decision(int[] candidates, int i, int target, int sum, List<List<Integer>> listResult, List<Integer> listChild){
        if(sum == target){
            listResult.add(new ArrayList<>(listChild));
            return;
        }else if( i>=candidates.length || sum>target ){
            return;
        }

        sum += candidates[i];
        listChild.add(candidates[i]);
        decision(candidates, i, target, sum, listResult, listChild);
        sum-= candidates[i];
        listChild.remove(listChild.size()-1);
        decision(candidates, i+1, target, sum, listResult, listChild);
    }
}
