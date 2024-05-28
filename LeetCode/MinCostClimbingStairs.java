 

class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {

        int[] totalCost = new int[cost.length];
        
        totalCost[0] = cost[0];
        totalCost[1] = cost[1];

        for(int i=2; i<cost.length; i++){
        
            totalCost[i] = Math.min(cost[i] + totalCost[i-1], cost[i] + totalCost[i-2]);
        }

        return Math.min(totalCost[totalCost.length - 1], totalCost[totalCost.length - 2]);
    }

    public static void main(String[] args) {
        MinCostClimbingStairs solution = new MinCostClimbingStairs();
        int[] cost = {0,1,2,2};
        System.out.println(solution.minCostClimbingStairs(cost));
    }
}
