 

class MaxiummSubarraySolution {
    int maxSum = Integer.MIN_VALUE;

    public int maxSubArray(int[] nums) {
        int sum = 0;
        for(int num:nums){
            if(sum<0){
                sum=0; // if all num in nums is negative => the result will be only one of all nums||if there is only one positive number => the result will be that number
            }
            sum += num;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // public void tracking(int i, int[] nums, int sum){
    //     if(i>nums.length-1){
    //         return;
    //     }

    //     sum+=nums[i];

    //     if(sum<nums[i]){
    //         return;
    //     }
    //     maxSum = Math.max(maxSum, sum);
    //     tracking(i+1, nums, sum);
    // }

    public static void main(String[] args) {
        MaxiummSubarraySolution solution = new MaxiummSubarraySolution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }
}