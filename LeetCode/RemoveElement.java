 

import java.util.Arrays;

class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int l=0,r=nums.length-1;

        while(l<=r){
            if(nums[l]==val){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                r--;
            }else{
                l++;
            }
        }
        

        System.out.println(Arrays.toString(nums));
        return l;
    }

    public static void main(String[] args) {
        RemoveElementSolution solution = new RemoveElementSolution();
        int[] nums = {0,1,2,2,3,0,4,2,1};
        System.out.println(solution.removeElement(nums, 2));
    }
}