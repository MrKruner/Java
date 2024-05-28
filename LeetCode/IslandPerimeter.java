 
class IslandPerimeterSolution {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    sum+=4;
                    if(i<grid.length-1){
                        if(grid[i+1][j]==1){
                            sum-=2;
                        }
                    }
                    if(j<grid[i].length-1){
                        if(grid[i][j+1]==1){
                            sum-=2;
                        }
                    }
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        IslandPerimeterSolution solution = new IslandPerimeterSolution();
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(solution.islandPerimeter(grid));
    }
}
