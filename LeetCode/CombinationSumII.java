import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);

        List<List<Integer>> resList = new ArrayList<>();

        int l = 0, r = candidates.length - 1;

        while (candidates[r] > target) {
            r--;
        }

        for(l = 0; l <= r; l++){
            dp(l, r, 0, target, candidates, resList, new ArrayList<>());
        }

        return resList;
    }

    public void dp(int l, int r, int sum, int target, int[] candidates, List<List<Integer>> resList, List<Integer> tempList){
        
        if(sum > target){
            return;
        }

        tempList.add(candidates[l]);

        if(sum == target){

            if(!resList.contains(tempList)){
                resList.add(new ArrayList<>(tempList));
            }
            
            return;
        }

        sum += candidates[l];        

        for(int i = l; i < r; i++){
            dp(i + 1, r, sum, target, candidates, resList, tempList);
            System.out.println(tempList);
        }

        tempList.remove(tempList.size() - 1);
        System.out.println(resList);
    }

    public static void main(String[] args) {
        CombinationSumII solution = new CombinationSumII();

        int[] c = {10,2,7,6,1,5};
        System.out.println(solution.combinationSum2(c, 8));
    }
}
