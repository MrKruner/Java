 
class containerWithMostWaterSolution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int width=0, length=0;
        int maxArea = 0;

        while(l<r){
            width = Math.min(height[l], height[r]);
            length = r-l;
            maxArea = Math.max(maxArea, width*length);

            if(height[r] > height[l]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        containerWithMostWaterSolution solution = new containerWithMostWaterSolution();
        int[] height={8,7,2,8};
        System.out.println(solution.maxArea(height));
    }
}