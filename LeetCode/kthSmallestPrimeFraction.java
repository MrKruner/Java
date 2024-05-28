 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class kthSmallestPrimeFraction {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
        Map<Double, List<Integer>> indexMap = new HashMap<>();

        List<Double> listFractions = new ArrayList<>();
       
        for(int i=0; i<arr.length; i++ ){

            for(int j=i+1; j<arr.length; j++){
                listFractions.add((double)arr[i] / (double)arr[j]);

                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i]);
                tempList.add(arr[j]);

                indexMap.put((double)arr[i] / (double)arr[j], tempList);
            }
        }

        Collections.sort(listFractions);

        System.out.println(listFractions);

        int[] res = new int[2];

        int i = 0;
        for(int n : indexMap.get(listFractions.get(k-1))){
            res[i] = n;
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        kthSmallestPrimeFraction solution = new kthSmallestPrimeFraction();
        int[] num = {1,7};
        System.out.println(Arrays.toString(solution.kthSmallestPrimeFraction(num, 1)));
    }
}
