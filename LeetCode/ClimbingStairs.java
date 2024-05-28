class ClimbingStairs {
    public int climbStairs(int n) {
        // return dp(n);

        int first = 0, second = 1;

        int res = 0;

        for(int i=1; i<=n; i++){
            res = second + first;
            first = second;
            second = res;
        }

        return res;
    }

    // public int dp(int i){
    //     if(i == 0 || i == 1){
    //         return 1;
    //     }

    //     return dp(i - 1) + dp(i - 2);
    // }

    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();
        System.out.println(solution.climbStairs(45));
    }
}
