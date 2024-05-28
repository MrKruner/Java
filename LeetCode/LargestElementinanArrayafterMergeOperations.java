class LargestElementinanArrayafterMergeOperations {
    public long maxArrayValue(int[] nums) {

        long[] res = new long[nums.length];


        res[nums.length - 1] = nums[nums.length - 1];

        for(int i=nums.length - 1; i>0; i--){
            if(nums[i - 1] <= res[i]){
                res[i -1] = nums[i - 1] + res[i]; 
            }else{
                res[i - 1] = nums[i - 1];
            }
        }

        return res[0];
    }
}
