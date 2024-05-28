class TreeNode {
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
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }

        backTracking(root, val, depth, 1);

        return root;
    }

    public void backTracking(TreeNode root, int val, int depth, int curDepth){
        if(root==null){
            return;
        }
        if(curDepth==depth-1){
            TreeNode tempLeft = root.left;
            root.left = new TreeNode(val);
            root.left.left = tempLeft;

            TreeNode tempRight = root.right;
            root.right = new TreeNode(val);
            root.right.right = tempRight;
        }else{
            curDepth++;
            backTracking(root.left, val, depth, curDepth);
            backTracking(root.right, val, depth, curDepth);
        }
    }

}