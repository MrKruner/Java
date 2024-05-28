 

import java.util.ArrayList;
import java.util.List;

class CombinationsSolution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> resultList = new ArrayList<>();

        for(int i=1; i<n+1; i++){
            dp(i, n, k, new ArrayList<>(), resultList);
        }

        return resultList;

    }

    public void dp(int i, int n, int k, List<Integer> tempList, List<List<Integer>> resultList){

        tempList.add(i);

        if(tempList.size() >= k){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for(int j=i+1; j<n+1; j++){
            dp(j, n, k, tempList, resultList);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinationsSolution solution = new CombinationsSolution();
        System.out.println(solution.combine(4, 2));
    }
}
