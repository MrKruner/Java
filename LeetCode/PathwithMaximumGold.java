 

class PathwithMaximumGold {

    public int getMaximumGold(int[][] grid) {
        
        int lenRow = grid.length;
        int lenCol = grid[0].length;

        int maxSum = 0;

        for(int r=0; r<lenRow; r++){
            for(int c=0; c<lenCol; c++){
                maxSum = Math.max(maxSum, dfs(lenRow, lenCol, r, c, grid));
            }
        }

        return maxSum;
    }

    public int dfs(int lenRow, int lenCol, int r, int c, int[][] grid){
        
        if(r > lenRow - 1 || r < 0 || c > lenCol - 1 || c < 0 || grid[r][c] == 0){
            return 0;
        }

        int temp = grid[r][c];

        grid[r][c] = 0;

        int sumUp = dfs(lenRow, lenCol, r - 1, c, grid);
        int sumDown = dfs(lenRow, lenCol, r + 1, c, grid);
        int sumRight = dfs(lenRow, lenCol, r, c - 1, grid);
        int sumLeft = dfs(lenRow, lenCol, r, c + 1, grid);

        grid[r][c]= temp;

        return temp + Math.max(Math.max(sumUp, sumDown), Math.max(sumRight, sumLeft));
    }

    public static void main(String[] args) {
        
    }
}
