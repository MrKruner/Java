 

class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        
        for(int i=rowLen-1; i>=0; i--){
            for(int j=colLen-1 ; j>=0; j--){

                int downValue = Integer.MAX_VALUE;
                int rightValue = Integer.MAX_VALUE;

                if(i<rowLen-1){
                    downValue = grid[i+1][j];
                }

                if(j<colLen-1){
                    rightValue = grid[i][j+1];
                }

                if(downValue == Integer.MAX_VALUE && rightValue == Integer.MAX_VALUE){
                    downValue = 0;
                }

                grid[i][j] = Math.min(downValue, rightValue) + grid[i][j];
            }
        }

        return grid[0][0];
    }

    public static void main(String[] args) {
        MinimumPathSum solution = new MinimumPathSum();

        int[][] grid = {{1,3,1}, {1,5,1}, {4,2,1}};
        System.out.println(solution.minPathSum(grid));
    }
}
