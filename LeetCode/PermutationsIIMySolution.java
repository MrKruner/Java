 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PermutationsIISolution{
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        for(int num: nums){
            numList.add(num);
        }
        Collections.sort(numList);
        List<Integer> curList = new ArrayList<>(numList);
        backTrackingII(resultList, new ArrayList<>(), numList, curList);
        return resultList;
    }

    public void backTrackingII(List<List<Integer>> resultList, List<Integer> tempList, List<Integer>numList, List<Integer>curList){
        if(tempList.size()==numList.size()){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        
        for(int i=0; i<curList.size(); i++){
            
            if(i>0 && curList.get(i)==curList.get(i-1)){
                continue;
            }
            tempList.add(curList.get(i));
            int tempEntry = curList.get(i);
            curList.remove(i);
            
            backTrackingII(resultList, tempList, numList,curList);
            tempList.remove(tempList.size()-1);
            curList.add(i, tempEntry);
        }

    }
}
