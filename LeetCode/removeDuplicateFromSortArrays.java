 
import java.util.Arrays;

class RemoveDuplicatesFromSortArraySolution {
    public int removeDuplicates(int[] nums) {
        int base=0;
        for(int i=1; i<nums.length; i++){
            if(nums[base]!=nums[i]){
                base++;
                nums[base]=nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return base+1;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortArraySolution solution = new RemoveDuplicatesFromSortArraySolution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums));
    }
}