 
import java.util.ArrayList;
import java.util.List;

class PermutationSolution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> listResult = new ArrayList<>();
  
    backTracking(listResult, new ArrayList<>(), nums);
    return listResult;
  }

  public void backTracking(List<List<Integer>> listResult, List<Integer> tempList, int[] nums){
    if(tempList.size() == nums.length){
      listResult.add(new ArrayList<>(tempList));
      return;
    }
    
    for(int num: nums){
      if(tempList.contains(num)){
        continue;
      }
      tempList.add(num);
      backTracking(listResult, tempList, nums);
      tempList.remove(tempList.size()-1);
    }
  }
}