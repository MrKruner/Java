 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// class FourSumMySolution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
        
//         if(nums.length < 4){
//             return new ArrayList<>();
//         }

//         Arrays.sort(nums);

//         List<List<Integer>> resultList = new ArrayList<>();

//         for(int i=0; i<nums.length; i++){
//             backTracking(i, nums, target, 0, new ArrayList<>(), resultList);    
//         }

//         return resultList;
//     }

//     public void backTracking(int i, int[] nums, int target, int sum, List<Integer> tempList, List<List<Integer>> resultList){

//         sum += nums[i];
//         tempList.add(nums[i]);

//         if(tempList.size() == 4 && sum == target){
//             if(!resultList.contains(tempList)){
//                 resultList.add(new ArrayList<>(tempList));
//             }
//             return;
//         }
//         if(tempList.size() == 4){
//             return;
//         }

//         for(int j=i+1; j<nums.length; j++){
//             backTracking(j, nums, target, sum, tempList, resultList);
//             tempList.remove(tempList.size()-1);
//         }
//         sum -= nums[i];
//     }

//     public static void main(String[] args) {
//         FourSumMySolution solution = new FourSumMySolution();
//         int[] nums = {-2, 2, -1, 1,0,2,3,3,4,4,5,8,9,0};
//         System.out.println(solution.fourSum(nums, 22));
//     }
// }

class FourSumSolution{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        if(nums.length < 4){
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<List<Integer>> resultList = new ArrayList<>();

        for(int i=0; i<nums.length-3; i++){
            
            if (i==0 || nums[i] != nums[i-1]) {

                for(int j=i+1; j<nums.length-2; j++){
                    if(j==i+1 || nums[j] != nums[j-1]){
                        int k = j+1;            
                        int r = nums.length-1;
                
                        while (k<r) {
        
                            long sum = (long)nums[i] + nums[j] + nums[k] + nums[r];
        
                            if(sum == target){
        
                                List<Integer> tempList = new ArrayList<>();
                                
                                tempList.add(nums[i]);
                                tempList.add(nums[j]);
                                tempList.add(nums[k]);
                                tempList.add(nums[r]);
        
                                resultList.add(tempList);
        
                                while (k<r && nums[k] == nums[k+1]) {
                                    k++;
                                }
                                while (k<r && nums[r] == nums[r-1]) {
                                    r--;
                                }
                                k++;
                                r--;
                                
                            }else if(sum < target){
                                k++;
                            }else{
                                r--;
                            }
                        }
                    }
                }
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        FourSumSolution solution = new FourSumSolution();
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(solution.fourSum(nums, -294967296));
    }
    }
