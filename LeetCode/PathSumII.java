import java.util.ArrayList;
import java.util.List;

class PathSumII {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> resLsit = new ArrayList<>();

        dp(root, 0, targetSum, resLsit, new ArrayList<>());

        return resLsit;
    }

    public void dp(TreeNode root, int curSum, int targetSum, List<List<Integer>> resLsit, List<Integer> tempList){
        
        if(root == null){
            return;
        }
 
        tempList.add(root.val);
        
        curSum += root.val;

        if(root.right == null && root.left == null && curSum == targetSum){
            resLsit.add(new ArrayList<>(tempList));
        }

        if(root.left != null){
            dp(root.left, curSum, targetSum, resLsit, tempList);
        }
        if(root.right != null){
            dp(root.right, curSum, targetSum, resLsit, tempList);
        }
        tempList.remove(tempList.size() - 1);
    }  

    public static void main(String[] args) {
        PathSumII solution = new PathSumII();

        // Example usage:
        TreeNode root = solution.new TreeNode(-2);
        root.right = solution.new TreeNode(-3);
        int targetSum = -5;

        List<List<Integer>> result = solution.pathSum(root, targetSum);
        System.out.println(result); // Expected output: [[-2, -3]]
    }
}